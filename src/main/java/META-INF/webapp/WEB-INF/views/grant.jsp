<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <body>
    <p>
    <form:form method="post" action="/grantDecision" modelAttribute="grantModel">
    <spring:message code="question1"/>
    
    <form:checkbox path="grant" />
    <input type="submit" value="Submit"/>
    </form:form>
    </p>
  </body>
</html>