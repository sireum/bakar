package org.sireum.bakar.xml

import org.sireum.util._

object FunctionBodyDeclaration_IsOverridingDeclarationQEx {
  def unapply(o : org.sireum.bakar.xml.FunctionBodyDeclaration.IsOverridingDeclarationQ) = {
    Some(
      o.getIsOverriding()
    )
  }
}