package org.sireum.bakar.xml

import org.sireum.util._

object DiscriminantAssociationEx {
  def unapply(o : org.sireum.bakar.xml.DiscriminantAssociation) = {
    Some(
      o.getSloc(),
      o.getDiscriminantSelectorNamesQl(),
      o.getDiscriminantExpressionQ(),
      o.getChecks()
    )
  }
}