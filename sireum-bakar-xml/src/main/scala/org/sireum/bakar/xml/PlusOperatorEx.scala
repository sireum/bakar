package org.sireum.bakar.xml

import org.sireum.util._

object PlusOperatorEx {
  def unapply(o : org.sireum.bakar.xml.PlusOperator) = {
    Some(
      o.getSloc(),
      o.getRefName(),
      o.getRef(),
      o.getType(),
      o.getChecks()
    )
  }
}