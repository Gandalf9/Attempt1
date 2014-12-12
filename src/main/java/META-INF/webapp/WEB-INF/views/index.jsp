<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <body>
    <p>
    <form:form method="post" action="/decision" modelAttribute="yatin">
    <spring:message code="question1"/>
    
    <form:checkbox path="qualify" />
    <input type="submit" value="Submit"/>
    </form:form>
    </p>
  </body>
</html>