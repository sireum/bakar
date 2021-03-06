package org.sireum.bakar.xml

import org.sireum.util._

object FunctionBodyDeclarationEx {
  def unapply(o : org.sireum.bakar.xml.FunctionBodyDeclaration) = {
    Some(
      o.getSloc(),
      o.getIsOverridingDeclarationQ(),
      o.getIsNotOverridingDeclarationQ(),
      o.getNamesQl(),
      o.getParameterProfileQl(),
      o.getIsNotNullReturnQ(),
      o.getResultProfileQ(),
      o.getAspectSpecificationsQl(),
      o.getBodyDeclarativeItemsQl(),
      o.getBodyStatementsQl(),
      o.getBodyExceptionHandlersQl(),
      o.getChecks()
    )
  }
}