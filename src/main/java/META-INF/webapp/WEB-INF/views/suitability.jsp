<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <body>
    <p>
    <form:form method="post" action="/suitabilityDecision" modelAttribute="suitabilityModel">
    <spring:message code="question3"/>
    <form:checkbox path="suitable1" />
    <br />
    <spring:message code="question4"/>
    <form:checkbox path="suitable2" />
    <br />
    <spring:message code="question5"/>
    <form:checkbox path="suitable3" />
    <input type="submit" value="Submit"/>
    </form:form>
    </p>
  </body>
</html>