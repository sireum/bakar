package org.sireum.bakar.xml

import org.sireum.util._

object PosAttributeEx {
  def unapply(o : org.sireum.bakar.xml.PosAttribute) = {
    Some(
      o.getSloc(),
      o.getPrefixQ(),
      o.getAttributeDesignatorIdentifierQ(),
      o.getType(),
      o.getChecks()
    )
  }
}