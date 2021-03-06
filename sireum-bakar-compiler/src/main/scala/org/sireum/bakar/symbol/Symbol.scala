package org.sireum.bakar.symbol

import org.sireum.util._
import org.sireum.pilar.ast._

trait Type

/**
 * **************************************************************************
 * Constraint classes
 * **************************************************************************
 */

trait Constraint extends Type

case class IndexConstraint(
  val subTypes : ISeq[ResourceUri]) extends Constraint

trait RangeConstraint extends Constraint

case class RangeAttributeReferenceConstraint() extends RangeConstraint

case class SimpleRangeConstraint(
  val lower : Exp,
  val upper : Exp) extends RangeConstraint

/**
 * **************************************************************************
 * Type Declarations
 * **************************************************************************
 */

trait SparkTypeDecl extends Type {
  val id : String
  val uri : String
}

trait TypeDecl extends SparkTypeDecl

case class SubTypeDecl(
  val id : String,
  val uri : String,
  val parentUri : String,
  val cons : Option[Constraint]) extends TypeDecl
  
case class FullTypeDecl(
  val id : String,
  val uri : String,
  val typeDef : TypeDef) extends TypeDecl

case class PrivateExtensionDecl(
  val id : String,
  val uri : String) extends TypeDecl

case class PrivateTypeDecl(
  val id : String,
  val uri : String,
  val isTagged : Boolean,
  val isLimited : Boolean,
  val fullDeclartionUri : ResourceUri) extends TypeDecl

/**
 * **************************************************************************
 * Type Definitions
 * **************************************************************************
 */

trait TypeDef extends Type

case class AbstractTypeDef() extends TypeDef

trait CompositeTypeDef extends TypeDef

trait ArrayTypeDef extends CompositeTypeDef {
  val dim : Int
  val componentSubtype : ResourceUri
}

case class ConstrainedArrayDef(
  val dim : Int,
  val componentSubtype : ResourceUri,
  val discreteSubtypes : ISeq[ResourceUri]) extends ArrayTypeDef

case class UnconstrainedArrayDef(
  val dim : Int,
  val componentSubtype : ResourceUri,
  val indexSubtypes : ISeq[ResourceUri]) extends ArrayTypeDef

trait RecordDef extends CompositeTypeDef {
  val isTagged : Boolean
}

case class NullRecordTypeDef(
  val isTagged : Boolean) extends RecordDef

case class ComponentDef(
  val refUri : ResourceUri,
  val typeName : String,
  val typeUri : ResourceUri,
  val loc : Location)

case class RecordTypeDef(
  val isTagged : Boolean,
  val components : IMap[String, ComponentDef]) extends RecordDef

trait ScalarTypeDef extends TypeDef

trait DiscreteTypeDef extends ScalarTypeDef

case class EnumerationTypeDef(
  val elems : ISeq[(String, ResourceUri)]) extends DiscreteTypeDef

trait IntegerTypeDef extends ScalarTypeDef

case class ModularTypeDef(
  val modExp : Exp) extends IntegerTypeDef

case class SignedIntegerTypeDef(
  val lowRangeExp : Option[Exp],
  val highRangeExp : Option[Exp]) extends IntegerTypeDef

trait RealTypeDef extends ScalarTypeDef

case class DerivedTypeDef(
  val parentUri : String,    
  val constraint : Option[Constraint]) extends TypeDef
  
// TODO : finish this
