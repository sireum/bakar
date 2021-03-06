package org.sireum.bakar.xml

import org.sireum.util._

object AdjacentAttributeEx {
  def unapply(o : org.sireum.bakar.xml.AdjacentAttribute) = {
    Some(
      o.getSloc(),
      o.getPrefixQ(),
      o.getAttributeDesignatorIdentifierQ(),
      o.getType(),
      o.getChecks()
    )
  }
}