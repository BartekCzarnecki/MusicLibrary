<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Update album</title>
</head>
<body>
<%@ include file="header.jsp"%>
<c:url var="update_url" value="/music/update"/>
<form:form method="post" modelAttribute="album" action="${update_url}">
    <form:hidden path="id"/>
    <form:input path="artist"/>
    <form:errors path="artist"/><br/>
    <form:input path="title"/>
    <form:errors path="title"/><br/>
    <form:input path="format"/>
    <form:errors path="format"/><br/>
    <form:input path="label"/>
    <form:errors path="label"/><br/>
    <form:input path="year"/>
    <form:errors path="year"/><br/>
    <form:input path="genre"/>
    <form:errors path="genre"/><br/>
    <form:input path="musicStyle"/>
    <form:errors path="musicStyle"/><br/>
    <input type="submit" value="Save">
</form:form>
<%@include file="footer.jsp"%>
</body>
</html>
