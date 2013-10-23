package org.sireum.bakar.compiler.module

import scala.collection.JavaConversions.asScalaBuffer
import org.sireum.bakar.symbol._
import org.sireum.bakar.xml._
import org.sireum.pilar.ast._
import org.sireum.pipeline._
import org.sireum.util._
import java.net.URI

class BakarTranslatorModuleDef(val job : PipelineJob, info : PipelineJobModuleInfo) extends BakarTranslatorModule {

  type BVisitor = Any => Boolean

  val DEBUG = false

  trait Context {
    val LOCATION_PREFIX = "l"

    var regression = false

    var fileUri : String = null

    var models = mlistEmpty[Model]

    var unhandledSet = msetEmpty[String]


    
    var countLocation = 0
    var stackLocationList = mstackEmpty[MList[LocationDecl]]
    def pushLocationList = {
      val locs = mlistEmpty[LocationDecl]; stackLocationList.push(locs); locs
    }
    def popLocationList = this.stackLocationList.pop
    def pushLocation(l : LocationDecl) = {
      stackLocationList.top += l
      l
    }

    var nameStack = mstackEmpty[String]
    def pushNameStack(s : String) = nameStack.push(s)
    def popNameStack = nameStack.pop

    var exitLocations = mstackEmpty[LocationDecl]
    def pushExitLocation(s : LocationDecl) = exitLocations.push(s)
    def popExitLocation = exitLocations.pop
    def peekExitLocation = exitLocations.top
    
    val globalUriMap = mmapEmpty[ResourceUri, ResourceUri]
    val globalNameMap = mmapEmpty[ResourceUri, String]

    var tempVarCounter = 0
    def genTempVar(typeName : String, typeUri : ResourceUri) = {
      val tempVarPrefix = "_tcomp"
      val name = tempVarPrefix + tempVarCounter
      tempVarCounter += 1
      val path = this.nameStack.toList :+ name
      val uri = "ada://variable_temp/" + path.mkString("/")

      val nts = Some(NamedTypeSpec(URIS.addResourceUri(NameUser(typeName), typeUri), ilistEmpty))
      val lname = URIS.addResourceUri(NameDefinition(name), uri)
      val lvd = LocalVarDecl(nts, lname, ilistEmpty)
      this.localsPush(lvd)

      val ret = NameExp(URIS.addResourceUri(NameUser(name), uri))
      ret(URIS.TYPE_URI) = typeUri
      ret
    }

    def purifyPath(s : FileResourceUri) = {
      if (!regression) s
      else s.substring(s.lastIndexOf("/") + 1)
    }

    def handleLoc(s : SourceLocation) : Location =
      new BeginEndLineColumnLocation {
        var lineBegin = s.getLine
        var columnBegin = s.getCol
        var lineEnd = s.getEndline
        var columnEnd = s.getEndcol
      }

    def addSourceLoc[T <: PilarAstNode](o : T, sloc : SourceLocation) : T = {
      o match {
        case x : PropertyProvider =>
          import org.sireum.util.SourceLocation._
          x at (purifyPath(this.fileUri), sloc.getLine, sloc.getCol(), sloc.getEndline(), sloc.getEndcol())
        case _ =>
      }
      o
    }

    var result : Any = null;
    def pushResult[T <: PilarAstNode](o : T, sloc : SourceLocation) {
      addSourceLoc(o, sloc)
      result = o
    }

    def popResult = {
      //assert(result != null)
      val t = result
      result = null
      t
    }

    def isEmpty(o : Base) : Boolean = o.isInstanceOf[NotAnElement]

    def isUnaryOp(o : Any) = getUnaryOp(o).isDefined
    def getUnaryOp(o : Any) : scala.Option[UnaryOp] = {
      if (!o.isInstanceOf[ExpressionClass]) {
        return None
      }
      val x = o.asInstanceOf[ExpressionClass].getExpression().asInstanceOf[Any]

      x match {
        case UnaryMinusOperatorEx(_) => Some(PilarAstUtil.MINUS_UNOP)
        case UnaryPlusOperatorEx(_)  => Some(PilarAstUtil.PLUS_UNOP)
        case NotOperatorEx(_)        => Some(PilarAstUtil.NOT_UNOP)
        case _                       => None
      }
    }

    def isBinaryOp(o : Any) = getBinaryOp(o).isDefined
    def getBinaryOp(o : Any) : scala.Option[BinaryOp] = {
      if (!o.isInstanceOf[ExpressionClass]) {
        return None
      }
      val x = o.asInstanceOf[ExpressionClass].getExpression().asInstanceOf[Any]

      x match {
        case AndOperatorEx(_)                => Some(PilarAstUtil.LOGICAL_AND_BINOP)
        case OrOperatorEx(_)                 => Some(PilarAstUtil.LOGICAL_OR_BINOP)

        case EqualOperatorEx(_)              => Some(PilarAstUtil.EQ_BINOP)
        case GreaterThanOperatorEx(_)        => Some(PilarAstUtil.GT_BINOP)
        case GreaterThanOrEqualOperatorEx(_) => Some(PilarAstUtil.GE_BINOP)
        case LessThanOperatorEx(_)           => Some(PilarAstUtil.LT_BINOP)
        case LessThanOrEqualOperatorEx(_)    => Some(PilarAstUtil.LE_BINOP)
        case NotEqualOperatorEx(_)           => Some(PilarAstUtil.NE_BINOP)

        case DivideOperatorEx(_)             => Some(PilarAstUtil.DIV_BINOP)
        case MinusOperatorEx(_)              => Some(PilarAstUtil.SUB_BINOP)
        case MultiplyOperatorEx(_)           => Some(PilarAstUtil.MUL_BINOP)
        case PlusOperatorEx(_)               => Some(PilarAstUtil.PLUS_UNOP)
        case RemOperatorEx(_)                => Some(PilarAstUtil.REM_BINOP)

        case XorOperatorEx =>
          if (DEBUG) println("Don't know how to handle bin op " + o)
          None
        case ModOperatorEx =>
          if (DEBUG) println("Don't know how to handle bin op " + o)
          None

        case _ =>
          None
      }
    }

    var locals : MList[LocalVarDecl] = null
    def localsInit = {
      assert(locals == null)
      locals = mlistEmpty[LocalVarDecl]
    }
    def localsPush(l : LocalVarDecl) = {
      assert(locals != null)
      locals += l
    }
    def localsPop = {
      val r = locals
      locals = null
      r
    }

    def newLocLabel(s : SourceLocation) = {
      countLocation += 1
      val simpName = this.LOCATION_PREFIX + countLocation
      val urlName = simpName + "_" +
        s.getLine + "." + s.getCol + "_" + s.getEndline + "." + s.getEndcol
      this.addResourceUri(NameDefinition(simpName), urlName)
    }

    def createEmptyLocation(locName : NameDefinition, annots : ISeq[Annotation] = TranslatorUtil.emptyAnnot) = {
      EmptyLocation(Some(locName), annots)
    }

    def createLocation(locName : NameDefinition, a : Action, annots : ISeq[Annotation] = TranslatorUtil.emptyAnnot) = {
      ActionLocation(Some(locName), annots, a)
    }

    def createPushLocation(a : Action, annots : ISeq[Annotation], s : SourceLocation) : LocationDecl = {
      createPushLocation(newLocLabel(s), a, annots)
    }

    def createPushLocation(locName : NameDefinition, a : Action, annots : ISeq[Annotation] = TranslatorUtil.emptyAnnot) : LocationDecl = {
      val loc = createLocation(locName, a, annots)
      pushLocation(loc)
      loc
    }

    def createJumpLocation(j : Jump, s : SourceLocation) =
      JumpLocation(Some(newLocLabel(s)), TranslatorUtil.emptyAnnot, j)

    def createGotoJumpLocation(target : NameUser, annots : ISeq[Annotation], s : SourceLocation) =
      createJumpLocation(GotoJump(annots, target), s)

    def createPushAssignmentLocation(lhs : Exp, rhs : Exp, annots : ISeq[Annotation], s : SourceLocation) = {
      createPushLocation(createAssignment(lhs, rhs, annots), TranslatorUtil.emptyAnnot, s)
    }

    def createAssignment(lhs : Exp, rhs : Exp, annots : ISeq[Annotation]) = {
      AssignAction(annots, lhs, ":=", rhs)
    }

    def handleUnaryExp(sloc : SourceLocation,
                       op : UnaryOp, exp : Exp, theType : String) : Exp = {
      addSourceLoc(handleExp(addProperty(URIS.TYPE_URI, theType, UnaryExp(op, exp))), sloc)
    }

    def handleBE(sloc : SourceLocation,
                 op : BinaryOp, lhs : Exp, rhs : Exp, theType : String) : Exp = {
      addSourceLoc(handleExp(addProperty(URIS.TYPE_URI, theType, BinaryExp(op, lhs, rhs))), sloc)
    }

    def handleBE(v : => BVisitor, sloc : SourceLocation,
                 op : BinaryOp, lhs : ExpressionClass, rhs : ExpressionClass, theType : String) : Exp = {
      v(lhs)
      val plhs = popResult.asInstanceOf[Exp]
      v(rhs)
      val prhs = popResult.asInstanceOf[Exp]

      handleBE(sloc, op, plhs, prhs, theType)
    }

    def handleExp(e : Exp) : Exp = {
      //if (this.genThreeAddress)
      //  assignToTemp(e)
      //else
      e
    }

    def addProperty[T <: PropertyProvider](key : String, value : Any, pp : T) : T = {
      if (value == null || value == "") {
        if (DEBUG) println("null/empty value for %s from %s".format(key, pp))
      } else {
        pp.setProperty(key, value)
      }
      pp
    }

    def handleTypeDefinition(o : DefinitionClass, v : => BVisitor) : Option[TypeDef] = {
      o.getDefinition match {
        case cad @ ConstrainedArrayDefinitionEx(sloc, discreteSubtypeDefs, arrayComponentDef) =>
          val dim = discreteSubtypeDefs.getDefinitions.size
          assert(dim == 1)

          if (DEBUG) println(arrayComponentDef.getElement())

          var compTypeName : Option[String] = None
          var compTypeUri : Option[ResourceUri] = None
          arrayComponentDef.getElement match {
            case cd @ ComponentDefinitionEx(sloc, ha, compDefView) =>
              assert(isEmpty(ha.getHasAliased()))
              compDefView.getDefinition match {
                case si @ SubtypeIndicationEx(siloc, ha, hne, smark, scons) =>
                  assert(isEmpty(ha.getHasAliased()))
                  assert(isEmpty(hne.getHasNullExclusion))
                  assert(isEmpty(scons.getConstraint))

                  var (_, tname, turi, _) = getName(smark.getExpression)
                  compTypeName = Some(tname)
                  compTypeUri = Some(turi)
              }
            case x =>
              if (DEBUG) Console.err.println("Not expecting array component type " + x)
              assert(false)
          }

          var indexTypes = ivectorEmpty[ResourceUri]
          discreteSubtypeDefs.getDefinitions.foreach {
            case ds @ DiscreteSubtypeIndicationAsSubtypeDefinitionEx(sloc, stmark, stcons) =>
              assert(isEmpty(stcons.getConstraint()))

              val (_, itname, ituri, _) = getName(stmark)
              indexTypes :+= ituri
            case x =>
          }

          return Some(ConstrainedArrayDef("", dim, compTypeUri.get, indexTypes))

        case etd @ EnumerationTypeDefinitionEx(_) =>
        case rtd @ RecordTypeDefinitionEx(rsloc, hasAbs, hasLim, recDef) =>
          assert(this.isEmpty(hasAbs.getHasAbstract()))
          assert(this.isEmpty(hasLim.getHasLimited()))

          val components = mlinkedMapEmpty[String, ComponentDef]
          recDef.getDefinition match {
            case rde @ RecordDefinitionEx(rdsloc, hasLim, recordComponents) =>
              assert(this.isEmpty(hasLim.getHasLimited()))

              for (rc <- recordComponents.getRecordComponents) {
                rc match {

                  case cd @ ComponentDeclarationEx(rcsloc, names, hasAliased,
                    objDecView, initExp, aspectSpec) =>
                    assert(this.isEmpty(hasAliased.getHasAliased()))
                    assert(this.isEmpty(initExp.getExpression()))
                    assert(aspectSpec.getElements().isEmpty())
                    assert(names.getDefiningNames().size() == 1)

                    var typeName : Option[String] = None
                    var typeUri : Option[String] = None

                    objDecView.getDefinition match {
                      case cd @ ComponentDefinitionEx(sloc, ha, compDefView) =>
                        assert(isEmpty(ha.getHasAliased()))
                        compDefView.getDefinition match {
                          case si @ SubtypeIndicationEx(siloc, ha, hne, smark, scons) =>
                            assert(isEmpty(ha.getHasAliased()))
                            assert(isEmpty(hne.getHasNullExclusion))
                            assert(isEmpty(scons.getConstraint))

                            var (_, tname, turi, _) = getName(smark.getExpression)
                            typeName = Some(tname)
                            typeUri = Some(turi)
                        }
                    }
                    val (csloc, cname, curi, ctype) = this.getName(names.getDefiningNames.head)
                    components(cname) = ComponentDef(curi, typeName.get, typeUri.get,
                      handleLoc(csloc))
                  case x =>
                    if (DEBUG) Console.err.println("Not expecting component decl " + x)
                    assert(false)
                }
              }
            case x =>
              if (DEBUG) Console.err.println("Not expecting record definition " + x)
              assert(false)
          }
          return Some(RecordTypeDef(
            "que",
            false,
            components.toMap))
        case x =>
          if (DEBUG) Console.err.println("Not handling type def " + x)
          assert(false)
      }
      assert(false)
      None
    }

    def handleType(o : Base, v : => BVisitor) : Option[PackageElement] = {
      o match {
        case otd @ OrdinaryTypeDeclarationEx(sloc, names, discriminantPart,
          typeDecView, aspectSpecs) =>
          assert(names.getDefiningNames().size == 1)
          assert(this.isEmpty(discriminantPart.getDefinition()))
          assert(aspectSpecs.getElements().isEmpty())

          val (tsloc, tname, turi, ttyp) = getName(names.getDefiningNames.head)

          val td = this.handleTypeDefinition(typeDecView, v)

          td.get match {
            case cad : ConstrainedArrayDef =>
              val tad = TypeAliasDecl(NameDefinition(tname),
                TranslatorUtil.emptyAnnot,
                NamedTypeSpec(NameUser("_ARRAY_"), ilistEmpty[TypeSpec]))
              tad(URIS.TYPE_DEF) = cad
              tad(URIS.TYPE_URI) = turi
              tad(URIS.REF_URI) = turi
              return Some(tad)
            case rtd : RecordTypeDef =>
              var attrs = ivectorEmpty[AttributeDecl]
              for ((k, v) <- rtd.components) {
                val attr = AttributeDecl(
                  NameDefinition(k),
                  TranslatorUtil.emptyAnnot,
                  Some(NamedTypeSpec(NameUser(v.typeName), ilistEmpty[TypeSpec])),
                  None
                )
                attr(URIS.REF_URI) = v.refUri
                attr(URIS.TYPE_URI) = v.typeUri
                attrs :+= attr
              }
              val rd = RecordDecl(
                NameDefinition(tname),
                TranslatorUtil.emptyAnnot,
                ilistEmpty[(NameDefinition, ISeq[Annotation])],
                ilistEmpty[ExtendClause],
                attrs
              )
              rd(URIS.TYPE_DEF) = rtd
              rd(URIS.TYPE_URI) = turi

              rd(URIS.REF_URI) = turi
              return Some(rd)
            case x =>
              if (DEBUG) Console.err.println("Not handling " + x)
              assert(false)
          }
          None
        case std @ SubtypeDeclarationEx(sloc, names, typeDeclView, aspectSpecs) =>
          assert(names.getDefiningNames().size == 1)
          assert(aspectSpecs.getElements().isEmpty())

          val (tsloc, tname, turi, ttyp) = getName(names.getDefiningNames.head)

          typeDeclView.getDefinition match {
            case si @ SubtypeIndicationEx(sloc, hasAliased, hasNullEx, subtypeMark,
              subtypeCons) =>
              assert(this.isEmpty(hasAliased.getHasAliased()))
              assert(this.isEmpty(hasNullEx.getHasNullExclusion()))

              val (ssloc, sname, suri, styp) = getName(subtypeMark)

              var cons : Option[Constraint] = None
              if (!this.isEmpty(subtypeCons.getConstraint())) {
                subtypeCons.getConstraint() match {
                  case ser @ SimpleExpressionRangeEx(sloc, lower, upper) =>
                    v(lower)
                    val l = this.popResult.asInstanceOf[Exp]

                    v(upper)
                    val u = this.popResult.asInstanceOf[Exp]

                    cons = Some(SimpleRangeConstraint(l, u))
                  case x =>
                    if (DEBUG) Console.err.println("Not expecting constraint type " + x)
                }
              }

              val std = SubTypeDecl(tname, turi, suri, cons)
              val tad = TypeAliasDecl(NameDefinition(tname),
                TranslatorUtil.emptyAnnot,
                NamedTypeSpec(NameUser(sname), ilistEmpty[TypeSpec]))

              tad(URIS.TYPE_DEF) = std
              tad(URIS.TYPE_URI) = turi
              tad(URIS.REF_URI) = turi

              return Some(tad)
            case x =>
              if (DEBUG) Console.err.println("Not expecting type decl view " + x)
              assert(false)
          }
          None
        case x =>
          if (DEBUG) Console.err.println("Not handling type declaration " + x)
          assert(false)
          None
      }
    }

    def addResourceUri[T <: org.sireum.pilar.symbol.Symbol](s : T, uri : String) = {
      URIS.addResourceUri(s, uri)
    }

    /**
     * the uri's generated by gnat2xml for globals doesn't provide any
     * indication that the uri refers to a global variable.  For example, the
     * global variable 'G' may have the uri 'ada://variable/P-3:9/G+2:5'.
     * Simply observing that it is the 3rd element in the path (a local var
     * or parameter would have the procedure's name as the 3rd element) is not
     * enough since nested and child packages could have paths that contain
     * 4+ elements.
     *
     * Furthermore, parts of sireum expect global uri's to contain @@ before
     * the globals name -- e.g. refer to how org.sireum.pilar.state.State
     * determines where to store a variables value.
     */
    def convertGlobal(name : String, uri : ResourceUri) : (String, ResourceUri) = {
      var i = uri.lastIndexOf("/")
      assert(i > 0)
      val returi = uri.substring(0, i + 1) + "@@" + uri.substring(i + 1)
      val retname = "@@" + name

      this.globalUriMap(uri) = returi
      this.globalNameMap(uri) = retname

      (retname, returi)
    }

    def copyPropertyMap[I <: PropertyProvider](a : I, b : I) : I = {
      b.propertyMap ++= a.propertyMap
      b
    }
    
    def rewriteName(uri : ResourceUri, name : String) = globalNameMap.getOrElse(uri, name)
    def rewriteUri(uri : ResourceUri) : ResourceUri = globalUriMap.getOrElse(uri, uri)

    def getName(o : Base) : (SourceLocation, String, String, String) = {
      o match {
        case e @ ExpressionClassEx(exp) => getName(exp)
        case di @ DefiningIdentifierEx(sloc, defName, defUri, typ) =>
          (sloc, rewriteName(defUri, defName), rewriteUri(defUri), typ)
        case i @ IdentifierEx(sloc, refName, refUri, typ) =>
          (sloc, rewriteName(refUri, refName), rewriteUri(refUri), typ)
      }
    }

    def stripParens(x : Base) : Base = {
      x match {
        case o : ParenthesizedExpression => stripParens(o.getExpressionParenthesizedQ())
        case o : ExpressionClass         => stripParens(o.getExpression)
        case _                           => x
      }
    }
  }

  implicit def nu2nd(nu : NameUser) = {
    val nd = NameDefinition(nu.name)
    nd.propertyMap ++= nu.propertyMap
    nd
  }

  implicit def nd2nu(nd : NameDefinition) = {
    val nu = NameUser(nd.name)
    nu.propertyMap ++= nd.propertyMap
    nu
  }

  implicit def addprop[T <: PropertyProvider](pp : T, key : String, value : Any, required : Boolean = false) : T = {
    if (value == null || value == "null" || value == "") {
      if (DEBUG) Console.err.println(s"null/empty value for $key from $pp")
      if (required)
        throw new RuntimeException("Missing required type")
    } else {
      pp.setProperty(key, value)
    }
    pp
  }

  def packageH(ctx : Context, v : => BVisitor) : VisitorFunction = {
    case o @ CompilationUnitEx(
      sloc,
      contextClauseElements,
      unitDeclaration,
      pragmasAfter,
      unitKind,
      unitClass,
      unitOrigin,
      unitFullName,
      defName,
      sourceFile) =>

      if (!contextClauseElements.getContextClauses().isEmpty)
        if (DEBUG) Console.err.println("Need to handle context clauses")

      v(unitDeclaration)

      ctx.popResult match {
        case p : PackageDecl =>
          ctx.models += Model(Some(sourceFile), ivectorEmpty[Annotation], ivector(p))
        case x =>
          if (DEBUG) println("Expecting a PackageDecl, received " + x)
      }

      false
    case o @ PackageDeclarationEx(sloc, names, aspectSpec,
      visiblePartDecItems, privatePartDecItems) =>
      if (DEBUG) println(o.getClass().getSimpleName())

      assert(names.getDefiningNames.length == 1)
      val di = names.getDefiningNames.get(0).asInstanceOf[DefiningIdentifier]
      val pname = NameDefinition(di.getDefName)

      if (!aspectSpec.getElements().isEmpty())
        if (DEBUG) Console.err.println("Need to handle package spec aspect clauses: " + pname)

      for (x <- visiblePartDecItems.getDeclarativeItems()) {
        //v(x)
        if (DEBUG) Console.err.println("Need to handle package spec public declarative items: " + pname)
      }

      for (x <- privatePartDecItems.getDeclarativeItems()) {
        //v(x)
        if (DEBUG) Console.err.println("Need to handle package spec private declarative items: " + pname)
      }

      false
    case o @ PackageBodyDeclarationEx(sloc, names, aspectSpec,
      bodyDecItems, bodyStatements, bodyExceptionHandlers) =>

      assert(bodyExceptionHandlers.getExceptionHandlers().isEmpty())

      assert(names.getDefiningNames().length == 1)
      val (pnameLoc, _pname, _puri, _) = ctx.getName(names.getDefiningNames.head)
      val pname = URIS.addResourceUri(NameDefinition(_pname), _puri)
      ctx.pushNameStack(_pname)

      val packElems = mlistEmpty[PackageElement]

      for (td <- TranslatorUtil.getTypeDeclarations(bodyDecItems)) {
        val pe = ctx.handleType(td, v)
        if (pe.isDefined) packElems += pe.get
      }
      // inject the standard definitions
      packElems += StandardTypeDefs.StandardBoolean
      packElems += StandardTypeDefs.StandardInteger
      packElems += StandardTypeDefs.StandardNatural
      packElems += StandardTypeDefs.StandardPositive
      packElems += StandardTypeDefs.StandardFloat

      // FIXME: inject the non-standard universal_integer
      packElems += StandardTypeDefs.UniversalInteger

      if (!aspectSpec.getElements().isEmpty())
        if (DEBUG) Console.err.println("Need to handle package body aspect clauses")

      if (!bodyStatements.getStatements.isEmpty)
        if (DEBUG) Console.err.println("Need to handle package body statements")

      if (!TranslatorUtil.getConstantDeclarations(bodyDecItems).isEmpty)
        if (DEBUG) Console.err.println("Need to handle package body consts")

      TranslatorUtil.getGlobalDeclarations(bodyDecItems).foreach {
        case vd @ VariableDeclarationEx(sloc, names, hasAliased, objDecView, initExpr, aspectSpec) =>
          assert(ctx.isEmpty(hasAliased.getHasAliased))
          assert(ctx.isEmpty(initExpr.getExpression))
          assert(aspectSpec.getElements.isEmpty)

          v(objDecView)
          val odv = ctx.popResult.asInstanceOf[NameExp]
          val typeSpec = Some(NamedTypeSpec(odv.name, ivectorEmpty[TypeSpec]))

          names.getDefiningNames.foreach {
            case di : DefiningIdentifier =>
              val (sloc, defName, defUri, typ) = ctx.getName(di)
              val (cdefName, cdefUri) = ctx.convertGlobal(defName, defUri)

              val name = ctx.addResourceUri(NameDefinition(cdefName), cdefUri)
              val gvd = GlobalVarDecl(name, TranslatorUtil.emptyAnnot, typeSpec)
              packElems += gvd
            case x =>
              if (DEBUG) Console.err.println("Not Expecting: " + x)
              assert(false)
          }
      }

      for (m <- TranslatorUtil.getMethodDeclarations(bodyDecItems)) {
        v(m)
        val pm = ctx.popResult
        packElems += pm.asInstanceOf[ProcedureDecl]
      }

      val pack = PackageDecl(Some(pname), TranslatorUtil.emptyAnnot, packElems.toList)
      ctx.pushResult(pack, sloc)

      ctx.popNameStack
      false
  }

  def methodH(ctx : Context, v : => BVisitor) : VisitorFunction = {
      def handleMethodBody(sloc : SourceLocation,
                           names : DefiningNameList,
                           paramProfile : ParameterSpecificationList,
                           bodyDeclItems : ElementList,
                           bodyStatements : StatementList,
                           resultProfile : Option[ElementClass],
                           aspectSpecs : ElementList,
                           exceptionHandlerList : ExceptionHandlerList,
                           isOverridingDec : Base,
                           isNotOverridingDec : Base) = {

        assert(exceptionHandlerList.getExceptionHandlers().isEmpty())
        assert(ctx.isEmpty(isOverridingDec))
        assert(ctx.isEmpty(isNotOverridingDec))

        import FileLineColumnLocation._
        assert(names.getDefiningNames().length == 1)
        val (sloc, methodDefName, methodDefUri, methodTypeUri) = ctx.getName(names.getDefiningNames.get(0))
        val mname = ctx.addResourceUri(NameDefinition(methodDefName), methodDefUri)
        mname at (ctx.fileUri, sloc.getLine(), sloc.getCol())

        ctx.pushNameStack(methodDefName)

        val params = mlistEmpty[ParamDecl]
        paramProfile.getParameterSpecifications().foreach {
          case ps @ ParameterSpecificationEx(sloc, pnames, _hasAliased, _hasNullEx,
            objDecView, _initExpr, mode) =>
            // e.g (I : Integer) or (I, J : 
            assert(ctx.isEmpty(_hasAliased.getHasAliased()))
            assert(ctx.isEmpty(_hasNullEx.getHasNullExclusion()))
            assert(ctx.isEmpty(_initExpr.getExpression()))

            v(objDecView.getDefinition)
            val odv = ctx.popResult.asInstanceOf[NameExp]

            pnames.getDefiningNames().foreach {
              case pname : DefiningIdentifier =>
                val (sloc, defName, defUri, typ) = ctx.getName(pname)
                val name = ctx.addResourceUri(NameDefinition(pname.getDefName), defUri)
                val typeSpec = Some(NamedTypeSpec(odv.name, ivectorEmpty[TypeSpec]))

                val pd = ParamDecl(typeSpec, name, TranslatorUtil.emptyAnnot)
                pd(URIS.REF_URI) = defUri
                params += pd

                import org.sireum.bakar.symbol.BakarSymbol._
                pd.mode(mode)

              case x =>
                if (DEBUG) println("Not expecting: " + x)
                assert(false)
            }
          case x =>
            if (DEBUG) println("Not expecting: " + x)
            assert(false)
        }

        ctx.localsInit
        bodyDeclItems.getElements().foreach {
          case vd @ VariableDeclarationEx(sloc, names, hasAliased,
            objDecView, initExpr, aspectSpec) =>
            assert(ctx.isEmpty(hasAliased.getHasAliased))
            assert(ctx.isEmpty(initExpr.getExpression))
            assert(aspectSpec.getElements.isEmpty)

            v(objDecView)
            val odv = ctx.popResult.asInstanceOf[NameExp]
            val typeSpec = Some(NamedTypeSpec(odv.name, ivectorEmpty[TypeSpec]))

            names.getDefiningNames().foreach {
              case di : DefiningIdentifier =>
                val (sloc, defName, defUri, typ) = ctx.getName(di)
                val name = ctx.addResourceUri(NameDefinition(defName), defUri)
                val lvd = LocalVarDecl(typeSpec, name, TranslatorUtil.emptyAnnot)
                ctx.localsPush(lvd)
              case x =>
                if (DEBUG) println("Not expecting: " + x)
                assert(false)
            }
          case x =>
            if (DEBUG) Console.err.println("Not expecting:" + x)
            assert(false)
        }

        ctx.pushLocationList
        v(bodyStatements)

        val returnType : Option[TypeSpec] = resultProfile match {
          case Some(e) =>
            v(e)
            val ne = ctx.popResult.asInstanceOf[NameExp]
            val nts = NamedTypeSpec(ne.name, ivectorEmpty[TypeSpec])
            ne.propertyMap.foreach { case (key, value) => nts.setProperty(key, value) }
            Some(nts)
          case None => {
            // ada procedure so add an empty return to the body
            ctx.pushLocation(
              JumpLocation(Some(ctx.newLocLabel(sloc)), TranslatorUtil.emptyAnnot,
                ReturnJump(TranslatorUtil.emptyAnnot, None)))
            None
          }
        }

        val locs = ctx.popLocationList.toList
        for (i <- 0 to locs.size - 1)
          locs(i).index(i)

        val body = ImplementedBody(ctx.localsPop.toList, locs, ivectorEmpty[CatchClause])

        val typeVars = ivectorEmpty[(NameDefinition, ISeq[Annotation])]
        val varArity = false
        val pd = ProcedureDecl(mname, TranslatorUtil.emptyAnnot, typeVars, params.toList,
          returnType, varArity, body)

        pd(URIS.REF_URI) = methodDefUri

        aspectSpecs.getElements.foreach {
          case as @ AspectSpecificationEx(sloc, mark, defs) =>
            val (_, m, _, _) = ctx.getName(mark.getElement)
            m.toLowerCase match {
              case "global" =>
                var ins = isetEmpty[ResourceUri]
                var outs = isetEmpty[ResourceUri]
                var proofs = isetEmpty[ResourceUri]

                defs.getElement match {
                  case ra @ RecordAggregateEx(rasloc, associations, _) =>
                    associations.getAssociations.foreach {
                      case rca @ RecordComponentAssociationEx(_, choices, exp) =>
                        var items = isetEmpty[ResourceUri]
                        ctx.stripParens(exp.getExpression) match {
                          case paa @ PositionalArrayAggregateEx(_, arrassoc, _) =>
                            arrassoc.getAssociations.foreach {
                              case ArrayComponentAssociationEx(_, _choices, _exp) =>
                                assert(_choices.getElements.isEmpty)
                                val (_, _, refuri, _) = ctx.getName(ctx.stripParens(_exp.getExpression))
                                items += refuri
                            }
                          case i @ IdentifierEx(_, refname, refuri, _) =>
                            items += ctx.rewriteUri(refuri)
                        }

                        assert(choices.getExpressions.size == 1)
                        val (_, mode, _, _) = ctx.getName(choices.getExpressions.head)
                        mode.toLowerCase match {
                          case "input"  => ins ++= items
                          case "output" => outs ++= items
                          case "in_out" =>
                            ins ++= items
                            outs ++= items
                          case "proof_in" => proofs ++= items
                        }
                    }
                }

                import org.sireum.bakar.symbol.BakarSymbol._
                if (!ins.isEmpty) pd.globalsIn(ins)
                if (!outs.isEmpty) pd.globalsOut(outs)
                if (!proofs.isEmpty) pd.globalsProof(proofs)
              case _ => throw new RuntimeException("Not hanlding aspect: " + m)
            }
        }
        ctx.popNameStack
        pd
      }

    {
      case o @ ProcedureDeclarationEx(sloc, isOverridingDec, isNotOverridingDec,
        name, paramProfile, hasAbstract, aspectSpec) =>
        if (DEBUG) println(o.getClass().getSimpleName())
        true
      case o @ FunctionDeclarationEx(sloc, isOverridingDec, isNotOverridingDec,
        names, paramProfile, isNotNullReturn, resultProfile, hasAbstract, aspectSpec) =>
        if (DEBUG) println(o.getClass().getSimpleName())
        true

      case o @ ProcedureBodyDeclarationEx(sloc, isOverridingDec, isNotOverridingDec,
        names, paramProfile, aspectSpec, bodyDecItems, bodyStatements, bodyExceptionHandlers) =>

        val m = handleMethodBody(sloc, names, paramProfile, bodyDecItems,
          bodyStatements, None, aspectSpec, bodyExceptionHandlers,
          isOverridingDec.getIsOverriding(), isNotOverridingDec.getIsNotOverriding())
        ctx.pushResult(m, sloc)

        false
      case o @ FunctionBodyDeclarationEx(sloc, isOverridingDec, isNotOverridingDec,
        names, paramProfile, isNotNullReturn, resultProfile, aspectSpec,
        bodyDecItems, bodyStatements, bodyExceptionHandlers) =>

        assert(ctx.isEmpty(isNotNullReturn.getIsNotNullReturn()))

        val m = handleMethodBody(sloc, names, paramProfile, bodyDecItems,
          bodyStatements, Some(resultProfile), aspectSpec, bodyExceptionHandlers,
          isOverridingDec.getIsOverriding(), isNotOverridingDec.getIsNotOverriding())
        ctx.pushResult(m, sloc)

        false
    }
  }

  def nameH(ctx : Context, v : => BVisitor) : VisitorFunction = {
    case o : Identifier =>
      val (sloc, name, refUri, typeUri) = ctx.getName(o)

      val nu = ctx.addResourceUri(NameUser(name), refUri)
      this.addprop(nu, URIS.REF_URI, refUri)
      this.addprop(nu, URIS.TYPE_URI, typeUri)

      val ne = this.addprop(NameExp(nu), URIS.TYPE_URI, typeUri)
      ctx.pushResult(ne, sloc)
      false
    case o : DefiningIdentifier =>
      val (sloc, name, refUri, typUri) = ctx.getName(o)

      val nu = ctx.addResourceUri(NameUser(name), refUri)
      this.addprop(nu, URIS.REF_URI, refUri)
      this.addprop(nu, URIS.TYPE_URI, typUri)

      ctx.pushResult(NameExp(nu), sloc)
      false
    case o @ SelectedComponentEx(sloc, prefix, selector, theType) =>

      v(prefix.getExpression())
      val p = ctx.popResult.asInstanceOf[Exp]

      val (_, sname, suri, _) = ctx.getName(selector)

      // TODO: need to type prefix to determine if this is a 
      // AccessExp, field lookup, etc...
      var ret : Option[Exp] = None
      p match {
        case NameExp(ns) =>
          ret = Some(NameExp(NameUser(ns.name + "::" + sname)))
        case x : IndexingExp =>
          ret = Some(AccessExp(x, NameUser(sname)))
        case q =>
          if (DEBUG) println("what to do with " + q)
          assert(false)
      }
      assert(ret.isDefined)

      ctx.pushResult(ret.get, sloc)
      false
    case o @ (
      NameClassEx(_) |
      DefiningNameClassEx(_) |
      DefiningExpandedNameEx(_)
      ) =>
      if (DEBUG) println("nameH: need to handle: " + o.getClass().getSimpleName())
      true
  }

  def statementH(ctx : Context, v : => BVisitor) : VisitorFunction = {
    case o @ AssignmentStatementEx(sloc, labelName, assignmentVariableName, assignmentExpression) =>

      v(assignmentVariableName)
      val lhs = ctx.popResult.asInstanceOf[Exp]

      v(assignmentExpression)
      val rhs = ctx.popResult.asInstanceOf[Exp]

      ctx.createPushAssignmentLocation(lhs, rhs, TranslatorUtil.emptyAnnot, sloc)
      false
    case o @ IfStatementEx(sloc, labelNames, statementPaths) =>
      val isSingle = statementPaths.getPaths.size == 1
      val endLoc = ctx.newLocLabel(sloc)
      var gotoLoc = if (isSingle) endLoc else ctx.newLocLabel(sloc)

        def render(sloc : SourceLocation, condExp : ExpressionClass, statements : StatementList, isIfElse : Boolean) = {
          if (isIfElse) {
            // #<gotoLoc>.
            ctx.pushLocation(ctx.createEmptyLocation(gotoLoc, TranslatorUtil.emptyAnnot))
            gotoLoc = ctx.newLocLabel(sloc)
          }

          v(condExp)

          // #l0. if(!resultVar) then goto <nextSlot>;
          val ne = UnaryExp(PilarAstUtil.NOT_UNOP, ctx.popResult.asInstanceOf[Exp])
          addprop(ne, URIS.TYPE_URI, StandardURIs.boolURI)
          val itj = IfThenJump(ne, TranslatorUtil.emptyAnnot, gotoLoc)
          val ij = IfJump(TranslatorUtil.emptyAnnot, ivector(itj), None)
          val jl = JumpLocation(Some(ctx.newLocLabel(sloc)), TranslatorUtil.emptyAnnot, ij)
          ctx.pushLocation(jl)

          // ... eval body statements
          v(statements)

          if (!isSingle) {
            // # goto endLoc;
            val gl = ctx.createGotoJumpLocation(endLoc, TranslatorUtil.emptyAnnot, sloc)
            ctx.pushLocation(gl)
          }
        }

      statementPaths.getPaths().foreach {
        case IfPathEx(sloc, condExp, statements) =>
          render(sloc, condExp, statements, false)
        case ElsifPathEx(sloc, condExp, statements) =>
          render(sloc, condExp, statements, true)
        case ElsePathEx(sloc, statements) =>
          // #<gotoLoc>.
          ctx.pushLocation(ctx.createEmptyLocation(gotoLoc, TranslatorUtil.emptyAnnot))

          v(statements)

        case x =>
          throw new RuntimeException("Not expecting " + x)
      }

      ctx.pushLocation(ctx.createEmptyLocation(endLoc))

      false
    case o @ CaseStatementEx(sloc, labelnames, caseExpression, statementPaths) =>
      if (DEBUG) println(o.getClass().getSimpleName())
      true
    case o @ LoopStatementEx(sloc, labelNames, statementIdentifier, loopStatements) =>
      assert(labelNames.getDefiningNames().isEmpty())

      // TODO: currently ignoring statementIdentifier
      
      // #loopStart.
      val loopStart = ctx.pushLocation(ctx.createEmptyLocation(ctx.newLocLabel(sloc)))

      val endLoc = ctx.createEmptyLocation(ctx.newLocLabel(sloc), TranslatorUtil.emptyAnnot)
      ctx.pushExitLocation(endLoc)

      v(loopStatements)
      
       // # goto loopStart
      val gl = ctx.pushLocation(ctx.createGotoJumpLocation(loopStart.name.get, TranslatorUtil.emptyAnnot, sloc))

      ctx.pushLocation(endLoc)
      
      val _exit = ctx.popExitLocation
      assert(_exit == endLoc)
      
      false
    case o @ WhileLoopStatementEx(sloc, labelNames, statementIdentifier,
      whileCondition, loopStatements) =>
      if (DEBUG) println(o.getClass().getSimpleName())

      val endLoc = ctx.createEmptyLocation(ctx.newLocLabel(sloc), TranslatorUtil.emptyAnnot)
      ctx.pushExitLocation(endLoc)

      // #loopStart.
      val loopStart = ctx.pushLocation(ctx.createEmptyLocation(ctx.newLocLabel(sloc)))

      v(whileCondition)

      // # if (!loopCond) goto endLocLabel;
      val ne = UnaryExp(PilarAstUtil.NOT_UNOP, ctx.popResult.asInstanceOf[Exp])
      addprop(ne, URIS.TYPE_URI, StandardURIs.boolURI)
      val itj = IfThenJump(ne, TranslatorUtil.emptyAnnot, endLoc.name.get)
      val ij = IfJump(TranslatorUtil.emptyAnnot, ivector(itj), None)
      val jl = JumpLocation(Some(ctx.newLocLabel(sloc)), TranslatorUtil.emptyAnnot, ij)
      ctx.pushLocation(jl)

      v(loopStatements)

      // # goto loopStart
      val gl = ctx.pushLocation(ctx.createGotoJumpLocation(loopStart.name.get, TranslatorUtil.emptyAnnot, sloc))

      ctx.pushLocation(endLoc)
      val _exit = ctx.popExitLocation
      assert(_exit == endLoc)
      
      false
    case o @ ForLoopStatementEx(sloc, labelnames, statementIdentifier,
      forLoopParameterSpecification, loopStatements) =>
      assert(ctx.isEmpty(statementIdentifier.getDefiningName))
      assert(labelnames.getDefiningNames.isEmpty)

      forLoopParameterSpecification.getDeclaration match {
        case lps @ LoopParameterSpecificationEx(sloc, names, hasRev, range) =>
          assert(names.getDefiningNames.size == 1)

          def unique(s : String, i : Int = -1) : String = {
            if(ctx.locals.find(e => (i == -1 && e.name.name == s) || e.name.name == s + i).isDefined)
              unique(s, i + 1)
            else if(i == -1) s  else s + i
          }
          
          v(names.getDefiningNames().head)
          var iterNE = ctx.popResult.asInstanceOf[NameExp]

          val uiter = unique(iterNE.name.name)
          if(uiter != iterNE.name.name){
            iterNE = ctx.copyPropertyMap(iterNE, 
                NameExp(ctx.copyPropertyMap(iterNE.name, NameUser(uiter))))
          }
          
          val isRev = !ctx.isEmpty(hasRev.getHasReverse())

          val endLoc = ctx.createEmptyLocation(ctx.newLocLabel(sloc), TranslatorUtil.emptyAnnot)
          ctx.pushExitLocation(endLoc)
          
          range.getDiscreteSubtypeDefinition match {
            case DiscreteSubtypeIndicationAsSubtypeDefinitionEx(rsloc, mark, constraint) =>

              v(mark)
              val markNE = ctx.popResult.asInstanceOf[NameExp]
              val markURI : String = markNE.name(URIS.REF_URI)

              // introduce a local variable for iterVar
              val typeSpec = Some(NamedTypeSpec(markNE.name, ivectorEmpty[TypeSpec]))
              val lvd = LocalVarDecl(typeSpec, iterNE.name, TranslatorUtil.emptyAnnot)
              ctx.localsPush(lvd)

              val (lowBound, highBound) =
                if (!ctx.isEmpty(constraint.getConstraint())) {
                  constraint.getConstraint match {
                    case SimpleExpressionRangeEx(rsloc, low, high) =>
                      v(low)
                      val lb = ctx.popResult.asInstanceOf[Exp]

                      v(high)
                      val hb = ctx.popResult.asInstanceOf[Exp]

                      (lb, hb)
                    case RangeAttributeReferenceEx(rsloc, rangeAttribute) =>
                      (null, null)
                  }
                } else {
                  // $First ^Mark .. $Last ^Mark
                  (null, null)
                }

              // assign low and high bound to temp variables.
              // NOTE: in ADA the loop bounds are fixed by the initial values of the
              //       low and high ranges assigned to the iter var.
              val lowtemp = ctx.genTempVar(markNE.name.name, markURI)
              ctx.createPushAssignmentLocation(lowtemp, lowBound, TranslatorUtil.emptyAnnot, sloc)
              val hightemp = ctx.genTempVar(markNE.name.name, markURI)
              ctx.createPushAssignmentLocation(hightemp, highBound, TranslatorUtil.emptyAnnot, sloc)
              
              // null range check
              val be = ctx.handleBE(sloc, PilarAstUtil.GT_BINOP, lowtemp, hightemp, StandardURIs.boolURI)
              val itj = IfThenJump(be, TranslatorUtil.emptyAnnot, endLoc.name.get)
              val ij = IfJump(TranslatorUtil.emptyAnnot, ivector(itj), None)
              val nullCheck = JumpLocation(Some(ctx.newLocLabel(sloc)), TranslatorUtil.emptyAnnot, ij)
              ctx.pushLocation(nullCheck)

              // initialize iter var
              ctx.createPushAssignmentLocation(iterNE,
                if (isRev) hightemp else lowtemp, TranslatorUtil.emptyAnnot, sloc)

              val loopStart = ctx.createEmptyLocation(ctx.newLocLabel(sloc), TranslatorUtil.emptyAnnot)
              ctx.pushLocation(loopStart)

              v(loopStatements)

              // end of loop check
              val endbe = ctx.handleBE(sloc, PilarAstUtil.EQ_BINOP, iterNE, 
                  if(isRev) lowtemp else hightemp, markURI)
              val enditj = IfThenJump(endbe, TranslatorUtil.emptyAnnot, endLoc.name.get)
              val endij = IfJump(TranslatorUtil.emptyAnnot, ivector(enditj), None)
              val endCheck = JumpLocation(Some(ctx.newLocLabel(sloc)), TranslatorUtil.emptyAnnot, endij)
              ctx.pushLocation(endCheck)

              // increment/decrement iter var
              val incbe = ctx.handleBE(sloc, if (isRev) PilarAstUtil.SUB_BINOP else PilarAstUtil.PLUS_UNOP,
                iterNE, LiteralExp(LiteralType.INTEGER, BigInt(1), "1ii"), StandardURIs.boolURI)
              ctx.createPushAssignmentLocation(iterNE, incbe, TranslatorUtil.emptyAnnot, sloc)

              // goto start
              ctx.pushLocation(ctx.createGotoJumpLocation(loopStart.name.get, TranslatorUtil.emptyAnnot, sloc))

              // push end location
              ctx.pushLocation(endLoc)
              val _exitLoc = ctx.popExitLocation
              assert(_exitLoc == endLoc)
          }
      }
      false
    case o @ ReturnStatementEx(sloc, labelNames, returnExp) =>
      assert(labelNames == null || labelNames.getDefiningNames().isEmpty())

      v(returnExp)

      val rj = ReturnJump(TranslatorUtil.emptyAnnot, Some(ctx.popResult.asInstanceOf[Exp]))
      val jl = JumpLocation(Some(ctx.newLocLabel(sloc)), TranslatorUtil.emptyAnnot, rj)

      ctx.pushLocation(jl)
      false
    case o @ ProcedureCallStatementEx(sloc, labelNames, calledName, params, isPrefixNotation) =>
      assert(ctx.isEmpty(isPrefixNotation.getIsPrefixNotation))
      val (nloc, name, nameUri, typ) = ctx.getName(calledName)

      val plist = mlistEmpty[Exp]
      for (p <- params.getAssociations) {
        v(p)
        plist += ctx.popResult.asInstanceOf[Exp]
      }

      val ce = CallExp(NameExp(ctx.addResourceUri(NameUser(name), nameUri)), TupleExp(plist.toList))
      val cj = CallJump(TranslatorUtil.emptyAnnot, ivectorEmpty, ce, None)
      val jl = JumpLocation(Some(ctx.newLocLabel(sloc)), TranslatorUtil.emptyAnnot, cj)

      ctx.pushLocation(jl)
      false
    case o @ ExitStatementEx(sloc, labelNames, exitLoopName, exitCond) =>
      assert(labelNames.getDefiningNames().isEmpty())

      // TODO: currently ignoring exitLoopName
      
      if(!ctx.isEmpty(exitCond.getExpression())) {
        v(exitCond)
        val c = ctx.popResult.asInstanceOf[Exp]
        
        val exitItj = IfThenJump(c, TranslatorUtil.emptyAnnot, ctx.peekExitLocation.name.get)
        val exitIj = IfJump(TranslatorUtil.emptyAnnot, ivector(exitItj), None)
        val exitJl = JumpLocation(Some(ctx.newLocLabel(sloc)), TranslatorUtil.emptyAnnot, exitIj)
        ctx.pushLocation(exitJl)
        
      } else {
        ctx.pushLocation(ctx.createGotoJumpLocation(ctx.peekExitLocation.name.get, TranslatorUtil.emptyAnnot, sloc))
      }
      false 
    case o @ (NullStatementEx(_) |
      BlockStatementEx(_) |
      BlockStatementEx(_) |
      GotoStatementEx(_) |
      AcceptStatementEx(_) |
      ExtendedReturnStatementEx(_) |
      EntryCallStatementEx(_) |
      RequeueStatementEx(_) |
      RequeueStatementWithAbortEx(_) |
      DelayUntilStatementEx(_) |
      DelayRelativeStatementEx(_) |
      TerminateAlternativeStatementEx(_) |
      SelectiveAcceptStatementEx(_) |
      TimedEntryCallStatementEx(_) |
      ConditionalEntryCallStatementEx(_) |
      AsynchronousSelectStatementEx(_) |
      AbortStatementEx(_) |
      RaiseStatementEx(_) |
      CodeStatementEx(_)
      ) =>
      if (DEBUG) println("statementH: need to handle " + o.getClass().getSimpleName())
      true
  }

  def expressionH(ctx : Context, v : => BVisitor) : VisitorFunction = {
    case o @ FunctionCallEx(sloc, prefix, functionCallParameters, isPrefixCall, isPrefixNotation, callExpType) =>
      import collection.JavaConversions._

      if (!ctx.isEmpty(isPrefixCall.getIsPrefixCall()))
        if (DEBUG) Console.err.println("Need to handle prefix calls")

      if (!ctx.isEmpty(isPrefixNotation.getIsPrefixNotation()))
        if (DEBUG) Console.err.println("Need to handle prefix notation")

      val plist = mlistEmpty[Exp]
      for (a <- functionCallParameters.getAssociations) {
        // TODO: these maybe associations in which case the arg order may not 
        //       match the declared formal param order
        v(a)
        plist += ctx.popResult.asInstanceOf[Exp]
      }

      if (ctx.isBinaryOp(prefix)) {
        assert(plist.length == 2)
        val be = ctx.handleBE(sloc, ctx.getBinaryOp(prefix).get, plist(0), plist(1), callExpType)
        ctx.pushResult(be, sloc)
      } else if (ctx.isUnaryOp(prefix)) {
        assert(plist.length == 1)
        val ue = ctx.handleUnaryExp(sloc, ctx.getUnaryOp(prefix).get, plist(0), callExpType)
        ctx.pushResult(ue, sloc)
      } else {
        v(prefix)
        val mname = ctx.popResult match {
          case ne @ NameExp(nu) =>
            // the name of the method is an identifier and has no type
            if (!(ne ? URIS.TYPE_URI)) addprop(ne, URIS.TYPE_URI, callExpType, true)
            ne
          case _ => throw new RuntimeException("Unexpected")
        }

        val ce = CallExp(mname, TupleExp(plist.toList))
        this.addprop(ce, URIS.TYPE_URI, callExpType, true)

        val tempVar = ctx.genTempVar("FIXME", callExpType)
        val lhss = ivector(tempVar)
        val cj = CallJump(TranslatorUtil.emptyAnnot, lhss, ce, None)
        val jl = JumpLocation(Some(ctx.newLocLabel(sloc)), TranslatorUtil.emptyAnnot, cj)
        ctx.pushLocation(jl)

        ctx.pushResult(ctx.handleExp(tempVar), sloc)
      }

      false
    case IntegerLiteralEx(sloc, litVal, typUri) =>
      val v = litVal.replaceAll("_", "") // e.g. 3_500
      val le = LiteralExp(LiteralType.INTEGER, BigInt(v), v + "ii")
      le(URIS.TYPE_URI) = typUri match {
        case "universal integer" => StandardURIs.universalIntURI
        case x                   => x
      }
      ctx.pushResult(le, sloc)
      false
    case o @ EnumerationLiteralEx(sloc, refName, ref, typ) =>
      if (typ == StandardURIs.boolURI) {
        val v = refName.toLowerCase() == "true"
        val le = LiteralExp(LiteralType.BOOLEAN, v, refName.toLowerCase())
        addprop(le, URIS.TYPE_URI, StandardURIs.boolURI)
        ctx.pushResult(le, sloc)
      } else {
        if (DEBUG) Console.err.println("Not handling enumeration lit %s %s".format(typ, refName))
      }
      false
    case o @ AndThenShortCircuitEx(sloc, lhs, rhs, theType) =>
      ctx.pushResult(
        ctx.handleBE(v, sloc, PilarAstUtil.LOGICAL_AND_BINOP, lhs, rhs, theType), sloc)
      false
    case o @ OrElseShortCircuitEx(sloc, lhs, rhs, theType) =>
      ctx.pushResult(
        ctx.handleBE(v, sloc, PilarAstUtil.LOGICAL_OR_BINOP, lhs, rhs, theType), sloc)
      false
    case o @ IfExpressionEx(_) =>
      if (DEBUG) println("expressionH: need to handle: " + o.getClass.getSimpleName)
      true
    case o @ IndexedComponentEx(sloc, prefix, indexExp, theType) =>
      v(prefix)
      val pprefix = ctx.popResult.asInstanceOf[Exp]

      val indices = mlistEmpty[Exp]
      indexExp.getExpressions().foreach { e =>
        v(e)
        indices += ctx.popResult.asInstanceOf[Exp]
      }

      val ie = IndexingExp(pprefix, indices.toList)
      addprop(ie, URIS.TYPE_URI, theType, true)

      ctx.pushResult(ie, sloc)
      false
    case o @ SelectedComponentEx(sloc, prefix, selector, typUri) =>
      v(prefix)
      val e = ctx.popResult.asInstanceOf[Exp]

      val (selsloc, selname, seluri, styp) = ctx.getName(selector)
      val attr = NameUser(selname)
      ctx.addResourceUri(attr, seluri)
      addprop(attr, URIS.REF_URI, seluri)
      addprop(attr, URIS.TYPE_URI, styp)

      val ae = AccessExp(e, attr)
      this.addprop(ae, URIS.TYPE_URI, typUri, true)

      ctx.pushResult(ae, sloc)
      false
    case o @ (
      RealLiteralEx(_) |
      //ExpressionClassEx(_) |
      ExpressionListEx(_) |
      DiscreteSimpleExpressionRangeEx(_) |
      StringLiteralEx(_) |
      CharacterLiteralEx(_) |
      FunctionCallEx(_) |
      NullLiteralEx(_) |
      QualifiedExpressionEx(_) |
      ForAllQuantifiedExpressionEx(_) |
      ForSomeQuantifiedExpressionEx(_)
      ) =>
      if (DEBUG) println("expressionH: need to handle: " + o.getClass.getSimpleName)
      true
  }

  def contractsH(ctx : Context, v : => BVisitor) : VisitorFunction = {
    case o @ AssertPragmaEx(sloc, pragmaArgumentAssociations, pragmaName) =>
      for (a <- pragmaArgumentAssociations.getAssociations()) {
        v(a)
        val r = ctx.popResult.asInstanceOf[Exp]
        val aa = AssertAction(TranslatorUtil.emptyAnnot, r, None)
        ctx.createPushLocation(aa, TranslatorUtil.emptyAnnot, sloc)
      }
      false
    case o @ ImplementationDefinedPragmaEx(sloc, pragmaArgAssociations, pragmaName) if (pragmaName.toLowerCase == "assume") =>
      for (a <- pragmaArgAssociations.getAssociations()) {
        v(a)
        val r = ctx.popResult.asInstanceOf[Exp]
        val aa = AssumeAction(TranslatorUtil.emptyAnnot, r)
        ctx.createPushLocation(aa, TranslatorUtil.emptyAnnot, sloc)
      }
      false
  }

  def everythingElseH(ctx : Context, v : => BVisitor) : VisitorFunction = {
    case o if (o != null) =>
      ctx.unhandledSet += o.getClass.getSimpleName()
      true
    case null =>
      if (DEBUG) println("everythingElseH: it is null")
      assert(false)
      false
  }

  def theVisitor : BVisitor = b
  val ctx = new Context {
    this.stackLocationList.push(mlistEmpty[LocationDecl])
  }

  ctx.regression = this.regression

  val b = Visitor.build(
    Visitor.first(
      ivector(
        packageH(ctx, theVisitor),
        methodH(ctx, theVisitor),
        statementH(ctx, theVisitor),
        expressionH(ctx, theVisitor),
        contractsH(ctx, theVisitor),
        nameH(ctx, theVisitor),
        everythingElseH(ctx, theVisitor)
      )))

  this.parseGnat2XMLresults.foreach {
    case (fileUri, value) => {
      ctx.fileUri = fileUri
      b(value)
    }
  }

  if (DEBUG) println("Not handling: " + ctx.unhandledSet.toList.sorted)

  this.models_=(ctx.models.toList)
}
