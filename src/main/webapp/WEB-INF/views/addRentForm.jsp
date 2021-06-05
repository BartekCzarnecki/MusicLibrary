<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title>Rent</title>
</head>
<body>

<%@ include file="header.jsp" %>

<form:form method="post" modelAttribute="rental">
  Album: <form:select itemValue="id" itemLabel="title" path="music.id" items="${albums}"/>
  <form:errors path="music"/> <br/>
  Date: <form:input path="date"/>
  <form:errors path="date"/><br/>
  User: <form:input path="fullName"/>
  <form:errors path="fullName"/><br/>
  <input type="submit" value="Save">
</form:form>

<%@ include file="footer.jsp" %>

</body>
</html>
