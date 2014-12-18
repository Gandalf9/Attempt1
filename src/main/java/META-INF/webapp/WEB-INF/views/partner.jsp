<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <body>
    <p>
    <form:form method="post" action="/partnerDecision" modelAttribute="partnerModel">
    <spring:message code="questionPartner"/>
    
    <form:checkbox path="partner" />
    <input type="submit" value="Submit"/>
    </form:form>
    </p>
  </body>
</html>