package org.sireum.bakar.xml

import org.sireum.util._

object AccessToProtectedFunctionEx {
  def unapply(o : org.sireum.bakar.xml.AccessToProtectedFunction) = {
    Some(
      o.getSloc(),
      o.getHasNullExclusionQ(),
      o.getAccessToSubprogramParameterProfileQl(),
      o.getIsNotNullReturnQ(),
      o.getAccessToFunctionResultProfileQ(),
      o.getChecks()
    )
  }
}