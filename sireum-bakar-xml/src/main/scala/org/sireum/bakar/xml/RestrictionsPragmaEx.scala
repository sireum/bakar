package org.sireum.bakar.xml

import org.sireum.util._

object RestrictionsPragmaEx {
  def unapply(o : org.sireum.bakar.xml.RestrictionsPragma) = {
    Some(
      o.getSloc(),
      o.getPragmaArgumentAssociationsQl(),
      o.getPragmaName(),
      o.getChecks()
    )
  }
}