package org.sireum.bakar.xml

import org.sireum.util._

object ProcedureBodyStub_IsOverridingDeclarationQEx {
  def unapply(o : org.sireum.bakar.xml.ProcedureBodyStub.IsOverridingDeclarationQ) = {
    Some(
      o.getIsOverriding()
    )
  }
}