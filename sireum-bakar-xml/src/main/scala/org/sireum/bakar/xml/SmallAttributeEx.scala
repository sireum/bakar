package org.sireum.bakar.xml

import org.sireum.util._

object SmallAttributeEx {
  def unapply(o : org.sireum.bakar.xml.SmallAttribute) = {
    Some(
      o.getSloc(),
      o.getPrefixQ(),
      o.getAttributeDesignatorIdentifierQ(),
      o.getType(),
      o.getChecks()
    )
  }
}