<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Rent update</title>
</head>
<body>
<%@ include file="header.jsp"%>
<c:url var="update_url" value="/rental/update"/>
<form:form method="post" modelAttribute="rent" action="${update_url}">
    <form:hidden path="id"/>
        Album: <form:select itemValue="id" itemLabel="title" path="music.id" items="${albums}"/><br/>
        Date: <form:input path="date"/>
        <form:errors path="date"/><br/>
        User: <form:input path="fullName"/>
        <form:errors path="fullName"/><br/>
        <input type="submit" value="Save">
    </form:form>
<%@include file="footer.jsp"%>
</body>
</html>
