package org.sireum.bakar.xml

import org.sireum.util._

object ListPragmaEx {
  def unapply(o : org.sireum.bakar.xml.ListPragma) = {
    Some(
      o.getSloc(),
      o.getPragmaArgumentAssociationsQl(),
      o.getPragmaName(),
      o.getChecks()
    )
  }
}