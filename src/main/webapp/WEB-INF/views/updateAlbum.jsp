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
<form:form method="post" action="/music/update/${id}" modelAttribute="album">
    Artist: <form:input path="artist" type="text" class="form-control" placeholder="${album.artist}"/>
    <form:errors path="artist"/><br/>
    Title: <form:input path="title" placeholder="${album.title}"/>
    <form:errors path="title"/><br/>
    Format: <form:input path="format" placeholder="${album.format}"/>
    <form:errors path="format"/><br/>
    Label: <form:input path="label" placeholder="${album.label}"/>
    <form:errors path="label"/><br/>
    Year: <form:input path="year" placeholder="${album.year}"/>
    <form:errors path="year"/><br/>
    Genre: <form:input path="genre" placeholder="${album.genre}"/>
    <form:errors path="genre"/><br/>
    Music style: <form:input path="musicStyle" placeholder="${album.musicStyle}"/>
    <form:errors path="musicStyle"/><br/>
    <input type="submit" value="Save">
</form:form>
<%@include file="footer.jsp"%>
</body>
</html>
