package org.sireum.bakar.xml

import org.sireum.util._

object NotOverridingEx {
  def unapply(o : org.sireum.bakar.xml.NotOverriding) = {
    Some(
      o.getSloc(),
      o.getChecks()
    )
  }
}