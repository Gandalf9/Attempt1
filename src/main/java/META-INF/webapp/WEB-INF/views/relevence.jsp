<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <body>
    <p>
    <form:form method="post" action="/decision1" modelAttribute="yatin">
    <spring:message code="question2"/>
    
    <form:checkbox path="relevence" value="child"/><spring:message code="question2.answer1"/>
	<form:checkbox path="relevence" value="partner"/><spring:message code="question2.answer2"/>
	<form:checkbox path="relevence" value="privateLife"/><spring:message code="question2.answer3"/>
	<input type="submit" value="Submit"/>
    </form:form>
    </p>
  </body>
</html>