package org.sireum.bakar.xml

import org.sireum.util._

object FormalSignedIntegerTypeDefinitionEx {
  def unapply(o : org.sireum.bakar.xml.FormalSignedIntegerTypeDefinition) = {
    Some(
      o.getSloc(),
      o.getChecks()
    )
  }
}