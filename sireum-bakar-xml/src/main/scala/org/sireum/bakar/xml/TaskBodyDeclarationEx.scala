package org.sireum.bakar.xml

import org.sireum.util._

object TaskBodyDeclarationEx {
  def unapply(o : org.sireum.bakar.xml.TaskBodyDeclaration) = {
    Some(
      o.getSloc(),
      o.getNamesQl(),
      o.getAspectSpecificationsQl(),
      o.getBodyDeclarativeItemsQl(),
      o.getBodyStatementsQl(),
      o.getBodyExceptionHandlersQl(),
      o.getChecks()
    )
  }
}