<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <body>
    <p>
    <form:form method="post" action="/childDecision" modelAttribute="childModel">
    <spring:message code="questionChild"/>
    
    <form:checkbox path="child" />
    <input type="submit" value="Submit"/>
    </form:form>
    </p>
  </body>
</html>