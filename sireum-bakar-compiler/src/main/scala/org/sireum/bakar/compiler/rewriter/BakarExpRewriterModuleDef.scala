package org.sireum.bakar.compiler.rewriter

import org.sireum.pipeline.PipelineJob
import org.sireum.pipeline.PipelineJobModuleInfo
import org.sireum.pipeline.Input
import org.sireum.pipeline.Output
import org.sireum.option.PipelineMode
import org.sireum.util._
import org.sireum.pilar.ast._
import org.sireum.pilar.pretty.NodePrettyPrinter
import org.sireum.bakar.compiler.module.URIS
import org.sireum.bakar.compiler.module.PilarNodeFactory
import org.sireum.bakar.compiler.module.PilarNodeFactory.{ copyPropertyMap => cp }
import org.sireum.bakar.symbol.TypeDecl
import org.sireum.bakar.util.TagUtil

class BakarExpRewriterModuleDef(val job : PipelineJob, info : PipelineJobModuleInfo) extends BakarExpRewriterModule {
  try {
    models = for (m <- this.models) yield BakarRewriter.rewriter(m, bakarTypeUri2TypeMap)
  } catch {
    case e : Throwable => {
      job.exceptions += e
      info.hasError = true
      info.tags += TagUtil.genUnexpectedErrorTag(e)
    }
  }
}

object BakarRewriter {
  def rewriter(m : Model, typeMap : IMap[ResourceUri, TypeDecl]) : Model =
    new BakarRewriter(typeMap).rewrite(m)
}

class BakarRewriter(typeMap : IMap[ResourceUri, TypeDecl]) {
  type RVistor = Any => Any
  var tcounter = 0;
  var lcounter = 0;
  val tempVarPrefix = "_bert"
  val locPrefix = "berl"

  val eannot = ilistEmpty[Annotation]
  def newTempVar(typeName : String, typeUri : String) = {
    val name = tempVarPrefix + tcounter
    tcounter += 1

    val path = URIS.getPath(currentMethodUri) :+ name
    val (lvd, ret) = PilarNodeFactory.buildLocalTempVar(typeName, typeUri, path)

    this.newTempVars :+= lvd

    ret
  }

  def newLabel = {
    val label = locPrefix + lcounter
    val path = URIS.getPath(currentMethodUri) :+ label
    lcounter += 1
    Some(PilarNodeFactory.buildLocationLabel(path))
  }

  implicit def nd2nu(nd : NameDefinition) = {
    val nu = NameUser(nd.name)
    nu.propertyMap ++= nd.propertyMap
    nu
  }

  var clhs : Option[Exp] = None
  var prelocs = ilistEmpty[LocationDecl]
  var postlocs = ilistEmpty[LocationDecl]
  var newTempVars = ilistEmpty[LocalVarDecl]

  var currentMethodUri : ResourceUri = null

  def getTypeUri(e : Exp) : String = {
    assert(URIS.hasTypeUri(e))
    URIS.getTypeUri(e)
  }

  val rewriter = Rewriter.build[LocationDecl]({
    case l : LocationDecl                                   => l
    case e @ AccessExp(NameExp(NameUser(n)), attributeName) => e
    case e @ AccessExp(exp, attributeName) =>
      val etype = typeMap(getTypeUri(e))
      val exptype = typeMap(getTypeUri(exp))
      val te = newTempVar(exptype.id, exptype.uri)
      prelocs :+= ActionLocation(newLabel, eannot, AssignAction(eannot, te, ":=", exp))
      clhs match {
        case Some(cexp) if cexp eq e =>
          postlocs :+= ActionLocation(newLabel, eannot, AssignAction(eannot, exp, ":=", te))
        case _ =>
      }
      val ae = cp(e, AccessExp(te, attributeName))
      URIS.addTypeUri(ae, etype.uri)
    case e @ IndexingExp(NameExp(NameUser(n)), indices) => e
    case e @ IndexingExp(exp, indices) =>
      val etype = typeMap(getTypeUri(e))
      val exptype = typeMap(getTypeUri(exp))
      val te = newTempVar(exptype.id, exptype.uri)
      prelocs :+= ActionLocation(newLabel, eannot, AssignAction(eannot, te, ":=", exp))
      clhs match {
        case Some(cexp) if cexp eq e =>
          postlocs :+= ActionLocation(newLabel, eannot, AssignAction(eannot, exp, ":=", te))
        case _ =>
      }
      val ie = cp(e, IndexingExp(te, indices))
      URIS.addTypeUri(ie, etype.uri)
  }, Rewriter.TraversalMode.BOTTOM_UP, true)

  var q = (c : Int) => c

  def rewrite(m : Model) : Model = {
    val _m = Rewriter.build[Model]({
      case p : ProcedureDecl =>
        currentMethodUri = p.name.uri
        p
      case b : ImplementedBody => {
        newTempVars = ilistEmpty[LocalVarDecl]
        val lmap = mlinkedMapEmpty[LocationDecl, Seq[LocationDecl]]
        for (l <- b.locations) {
          val x = mlinkedMapEmpty[Exp, Seq[LocationDecl]]

          val _l = {
            l match {
              case ActionLocation(_, _, AssertAction(_, CallExp(NameExp(nu), _), _)) if URIS.isUIFUri(nu.uri) => l
              case ActionLocation(_, _, AssumeAction(_, CallExp(NameExp(nu), _), _)) if URIS.isUIFUri(nu.uri) => l              
              case _ =>
                val nl = Rewriter.build({
                  case be @ BinaryExp(op, lhs, rhs) if (op == PilarAstUtil.COND_AND_BINOP || op == PilarAstUtil.COND_OR_BINOP) =>
                    // lhs and then rhs --> #. r := lhs
                    //                      #. if !(r) then exit.
                    //                      #. r := rhs
                    //                      #exit.
                    val beType = typeMap(getTypeUri(be))
                    val result = newTempVar(beType.id, beType.uri)
                    val exit = newLabel

                    val p = mlistEmpty[LocationDecl]

                    if (x.contains(lhs)) p ++= x.remove(lhs).get
                    p += ActionLocation(newLabel, ilistEmpty, AssignAction(ilistEmpty, result, ":=", lhs))

                    val c = if (op == PilarAstUtil.COND_AND_BINOP) UnaryExp("!", result) else result
                    p += ComplexLocation(newLabel, ilistEmpty,
                      ilist(Transformation(ilistEmpty, None, ilistEmpty, Some(IfJump(ilistEmpty,
                        ilist(IfThenJump(c, ilistEmpty, exit.get)), None)))))

                    if (x.contains(rhs)) p ++= x.remove(rhs).get
                    p += ActionLocation(newLabel, ilistEmpty, AssignAction(ilistEmpty, result, ":=", rhs))

                    p += EmptyLocation(exit, ilistEmpty)

                    x(result) = p
                    cp(be, result)
                }, Rewriter.TraversalMode.BOTTOM_UP, true)(l)
                cp(l, nl)
                assert(x.size <= 1)
                nl
            }
          }
          lmap(_l) = if (!x.isEmpty) x.head._2 else mlistEmpty
        }
        cp(b, ImplementedBody(b.locals ++ newTempVars,
          ilistEmpty ++ lmap.map(f => f._2 :+ f._1).flatten, b.catchClauses))
      }
    }, Rewriter.TraversalMode.TOP_DOWN, true)(m)

    newTempVars = ilistEmpty[LocalVarDecl]

    var packages = ilistEmpty[PackageDecl]
    Visitor.build({
      case p @ PackageDecl(packName, _, elements) =>
        var elems = ivectorEmpty[PackageElement]
        elements.foreach {
          case pd @ ProcedureDecl(methName, a, tv, params, rt, va, body : ImplementedBody) => {

            var locmap = ilinkedMapEmpty[LocationDecl, (ISeq[LocationDecl], ISeq[LocationDecl])]

            currentMethodUri = methName.uri

            for (l <- body.locations) {
              clhs = None
              var rewrite = false
              l match {
                case ActionLocation(_, _, AssignAction(_, lhs, _, _)) =>
                  rewrite = true
                  lhs match {
                    case a : AccessExp   => clhs = Some(lhs)
                    case i : IndexingExp => clhs = Some(lhs)
                    case _               =>
                  }
                case ActionLocation(_, _, AssertAction(_, CallExp(NameExp(nu), _), _)) =>
                  rewrite = !URIS.isUIFUri(nu.uri)
                case ActionLocation(_, _, AssumeAction(_, CallExp(NameExp(nu), _), _)) =>
                  rewrite = !URIS.isUIFUri(nu.uri)
                case _ =>
                  rewrite = true
              }
              prelocs = ilistEmpty[LocationDecl]
              postlocs = ilistEmpty[LocationDecl]

              val rl = if (rewrite) cp(l, rewriter(l)) else l
              locmap += (rl -> (prelocs, postlocs))
            }

            import org.sireum.bakar.symbol.BakarSymbol._
            val x = locmap.flatMap { s =>
              val preLocs = s._2._1
              val (_preLocs, orig) = if (!preLocs.isEmpty) {
                val firstPre = preLocs.head.asInstanceOf[ActionLocation]
                val origLoc = s._1

                val _origLoc = origLoc match {
                  case i : ActionLocation  => cp(origLoc, i.copy(name = firstPre.name))
                  case i : ComplexLocation => cp(origLoc, i.copy(name = firstPre.name))
                  case i : JumpLocation    => cp(origLoc, i.copy(name = firstPre.name))
                }

                val _firstPre = cp(firstPre, firstPre.copy(name = origLoc.name))
                val _moddedPres = _firstPre +: preLocs.drop(1)

                (_moddedPres, _origLoc)
              } else
                (preLocs, s._1)
              (_preLocs :+ orig) ++ s._2._2
            }
            val _body = ImplementedBody(body.locals ++ this.newTempVars, x.toList, body.catchClauses)
            val parentUri = pd.parentUri.get
            val modpd = PilarNodeFactory.buildProcedureDecl(methName, parentUri, params, rt, _body)
            cp(pd, modpd)
            elems :+= modpd

            this.newTempVars = ilistEmpty[LocalVarDecl]
          }
          case o => elems :+= o
        }
        packages :+= cp(p, PilarNodeFactory.buildPackageDecl(p.name.get, p.annotations, elems))
        false
    })(_m)
    cp(m, Model(m.sourceURI, m.annotations, packages))
  }
}

case class BakarExpRewriter(

  title : String = "Bakar Exp Rewriter",
  @Input bakarTypeUri2TypeMap : IMap[ResourceUri, TypeDecl],
  @Input @Output models : ISeq[Model])

object BakarExpRewriter {
  def main(args : Array[String]) {
    val sireum = System.getenv.get("SIREUM_HOME") + "/sireum"
    val destdir = "./src/main/scala/org/sireum/bakar/compiler/rewriter"
    val cname = BakarExpRewriter.getClass.getName.dropRight(1)

    val args = List(sireum, "tools", "pipeline", "-d", destdir, cname)

    val e = new Exec()
    e.env("CLASSPATH") = System.getProperty("java.class.path")

    println(e.run(10000, args, None, None))
  }
}