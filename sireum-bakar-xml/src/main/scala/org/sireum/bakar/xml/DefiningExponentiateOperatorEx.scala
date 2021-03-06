package org.sireum.bakar.xml

import org.sireum.util._

object DefiningExponentiateOperatorEx {
  def unapply(o : org.sireum.bakar.xml.DefiningExponentiateOperator) = {
    Some(
      o.getSloc(),
      o.getDefName(),
      o.getDef(),
      o.getType(),
      o.getChecks()
    )
  }
}