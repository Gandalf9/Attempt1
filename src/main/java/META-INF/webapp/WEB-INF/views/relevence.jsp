<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <body>
    <p>
    <spring:message code="question2"/>
    
    <form:checkbox path="yatin.relevence" value="child"/><spring:message code="question2.answer1"/>
	<form:checkbox path="yatin.relevence" value="partner"/><spring:message code="question2.answer2"/>
	<form:checkbox path="yatin.relevence" value="privateLife"/><spring:message code="question2.answer3"/>
    
    </p>
  </body>
</html>