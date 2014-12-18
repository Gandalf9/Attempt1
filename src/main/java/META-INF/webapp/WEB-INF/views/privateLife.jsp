<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <body>
    <p>
    <form:form method="post" action="/privateLifeDecision" modelAttribute="privateLifeModel">
    <spring:message code="questionPrivateLife"/>
    
    <form:checkbox path="privateLife" />
    <input type="submit" value="Submit"/>
    </form:form>
    </p>
  </body>
</html>