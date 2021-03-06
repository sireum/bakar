package org.sireum.bakar.xml

import org.sireum.util._

object CopySignAttributeEx {
  def unapply(o : org.sireum.bakar.xml.CopySignAttribute) = {
    Some(
      o.getSloc(),
      o.getPrefixQ(),
      o.getAttributeDesignatorIdentifierQ(),
      o.getType(),
      o.getChecks()
    )
  }
}