package org.sireum.bakar.xml

import org.sireum.util._

object CharacterLiteralEx {
  def unapply(o : org.sireum.bakar.xml.CharacterLiteral) = {
    Some(
      o.getSloc(),
      o.getRefName(),
      o.getRef(),
      o.getType(),
      o.getChecks()
    )
  }
}