package org.sireum.bakar.xml

import org.sireum.util._

object IsPrefixNotationEx {
  def unapply(o : org.sireum.bakar.xml.IsPrefixNotation) = {
    Some(
      o.getSloc(),
      o.getChecks()
    )
  }
}