package org.sireum.bakar.compiler.rewriter

import org.sireum.pipeline.PipelineJob
import org.sireum.pipeline.PipelineJobModuleInfo
import org.sireum.pipeline.Input
import org.sireum.pipeline.Output
import org.sireum.option.PipelineMode
import org.sireum.pipeline.gen.ModuleGenerator
import org.sireum.util._
import org.sireum.pilar.ast._
import org.sireum.pilar.pretty.NodePrettyPrinter
import org.sireum.bakar.compiler.module.URIS

class BakarExpRewriterModuleDef(val job : PipelineJob, info : PipelineJobModuleInfo) extends BakarExpRewriterModule {
  var r = ilistEmpty[Model]
  for (m <- this.models) {
    r :+= BakarRewriter.rewriter(m)
  }
  this.models = r
}

object BakarRewriter {
  def rewriter(m : Model) : Model = new BakarRewriter().rewrite(m)
}

class BakarRewriter {
  type RVistor = Any => Any
  var tcounter = 0;
  var lcounter = 0;
  val tempVarPrefix = "_t"
  val locPrefix = "rwl"

  val SCHEME = "ada"
  val TEMP_VAR_TYPE = "variable_temp"
  
  val eannot = ilistEmpty[Annotation]
  def newTempVar(typeName : String, typeUri : String) = {
    import org.sireum.pilar.symbol.Symbol

    val name = tempVarPrefix + tcounter
    val path = ilist(this.currentPackage, this.currentMethod, name)
    val uri = SCHEME + "://" + TEMP_VAR_TYPE + "/" + path.mkString("/")
    
    val tvtnu = NameUser(typeName)
    tvtnu(URIS.REF_URI) = tvtnu
    val nts = Some(NamedTypeSpec(tvtnu, ilistEmpty[TypeSpec]))
    val lvd = LocalVarDecl(nts, NameDefinition(name), ilistEmpty[Annotation])
    lvd(URIS.REF_URI) = uri
    this.newTempVars :+= lvd
    
    val nu = NameUser(name)
    nu.uri("ada", "variable_temp", path, uri)
    val ret = NameExp(nu)
    ret(URIS.TYPE_URI) = typeUri
    tcounter += 1
    ret
  }

  def newLabel = {
    val ret = NameDefinition(locPrefix + lcounter)
    lcounter += 1
    Some(ret)
  }

  var clhs : Option[Exp] = None
  var prelocs = ilistEmpty[LocationDecl]
  var postlocs = ilistEmpty[LocationDecl]
  var newTempVars = ilistEmpty[LocalVarDecl]

  var currentPackage : String = null
  var currentMethod : String = null
  
  def getTypeUri(e : Exp) : String = {
    assert (e ? URIS.TYPE_URI)
    e(URIS.TYPE_URI)
  }
  
  val rewriter = Rewriter.build[LocationDecl]({
    case l : LocationDecl => l
    case b @ BinaryExp(o, l, r) =>
      val btype = getTypeUri(b)
      val ltype = getTypeUri(l)
      val rtype = getTypeUri(r)
      
      val le = newTempVar("FIXME", ltype)
      prelocs :+= ActionLocation(newLabel, eannot, AssignAction(eannot, le, ":=", l))

      val re = newTempVar("FIXME", rtype)
      prelocs :+= ActionLocation(newLabel, eannot, AssignAction(eannot, re, ":=", r))

      val be = BinaryExp(o, le, re)
      be(URIS.TYPE_URI) = btype
      be
    case e @ AccessExp(NameExp(NameUser(n)), attributeName) => e
    case e @ AccessExp(exp, attributeName) =>
      val etype = getTypeUri(e)
      val exptype = getTypeUri(exp)
      val te = newTempVar("FIXME", exptype)
      prelocs :+= ActionLocation(newLabel, eannot, AssignAction(eannot, te, ":=", exp))
      clhs match {
        case Some(cexp) if cexp eq e =>
          postlocs :+= ActionLocation(newLabel, eannot, AssignAction(eannot, exp, ":=", te))
        case _ =>
      }
      val ae = AccessExp(te, attributeName)
      ae(URIS.TYPE_URI) = etype
    case e @ IndexingExp(NameExp(NameUser(n)), indices) => e
    case e @ IndexingExp(exp, indices) =>
      val etype = getTypeUri(e)
      val exptype = getTypeUri(exp)
      val te = newTempVar("FIXME", exptype)
      prelocs :+= ActionLocation(newLabel, eannot, AssignAction(eannot, te, ":=", exp))
      println(e)
      clhs match {
        case Some(cexp) if cexp eq e =>
          postlocs :+= ActionLocation(newLabel, eannot, AssignAction(eannot, exp, ":=", te))
        case _ =>
      }

      val ie = IndexingExp(te, indices)
      ie(URIS.TYPE_URI) = etype
      ie.propertyMap ++= e.propertyMap
      ie
  }, Rewriter.TraversalMode.BOTTOM_UP)

  def rewrite(m : Model) : Model = {
    var packages = ilistEmpty[PackageDecl]
    Visitor.build({
      case p @ PackageDecl (name, _, elements) =>
        var elems = ivectorEmpty[PackageElement]
        this.currentPackage = name.get.name
        elements.foreach {
          case m @ ProcedureDecl(n, a, tv, params, rt, va, body : ImplementedBody) => {

            var locmap = ilinkedMapEmpty[LocationDecl, (ISeq[LocationDecl], ISeq[LocationDecl])]
            
            this.currentMethod = n.name
            
            for (l <- body.locations) {
              clhs = None
              l match {
                case ActionLocation(_, _, AssignAction(_, lhs, _, _)) =>
                  lhs match {
                    case a : AccessExp   => clhs = Some(lhs)
                    case i : IndexingExp => clhs = Some(lhs)
                    case _               =>
                  }
                case _ =>
              }
              prelocs = ilistEmpty[LocationDecl]
              postlocs = ilistEmpty[LocationDecl]

              val rl = rewriter(l)
              locmap += (rl -> (prelocs, postlocs))
            }

            val x = locmap.flatMap { s => (s._2._1 :+ s._1) ++ s._2._2 }
            val pd = ProcedureDecl(n, a, tv, params, rt, va,
              ImplementedBody(body.locals, x.toList, body.catchClauses))
            pd.propertyMap ++= p.propertyMap
            elems :+= pd
            
            this.newTempVars = ilistEmpty[LocalVarDecl]
          }
          case o => elems :+= o
        }
        packages :+= PackageDecl(p.name, p.annotations, elems)
        false
    })(m)
    Model(m.sourceURI, m.annotations, packages)
  }
}

case class BakarExpRewriter(

  title : String = "Bakar Exp Rewriter",

  @Input @Output models : ISeq[Model])

object BakarExpRewriter {
  def main(args : Array[String]) {
    val opt = PipelineMode()
    opt.classNames = Array(BakarExpRewriter.getClass.getName.dropRight(1))
    opt.dir = "./src/main/scala/org/sireum/bakar/compiler/rewriter"

    ModuleGenerator.run(opt)
  }
}