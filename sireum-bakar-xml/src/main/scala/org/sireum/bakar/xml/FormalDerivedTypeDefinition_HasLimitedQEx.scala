package org.sireum.bakar.xml

import org.sireum.util._

object FormalDerivedTypeDefinition_HasLimitedQEx {
  def unapply(o : org.sireum.bakar.xml.FormalDerivedTypeDefinition.HasLimitedQ) = {
    Some(
      o.getHasLimited()
    )
  }
}