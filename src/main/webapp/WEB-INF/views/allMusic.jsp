<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Music List</title>
</head>
<body>
<%@ include file="header.jsp"%>
Music:
<table border="1">
    <th>ID</th>
    <th>Artist</th>
    <th>Title</th>
    <th>Format</th>
    <th>Label</th>
    <th>Year</th>
    <th>Genre</th>
    <th>Music style</th>
    <c:forEach items="${allMusic}" var="music">
    <tr>
        <td><c:out value="${music.id}"/></td>
        <td><c:out value="${music.artist.name}"/></td>
        <td><c:out value="${music.title}"/></td>
        <td><c:out value="${music.format}"/></td>
        <td><c:out value="${music.label}"/></td>
        <td><c:out value="${music.year}"/></td>
        <td><c:out value="${music.genre}"/></td>
        <td><c:out value="${music.musicStyle}"/></td>
        <td><a href="<c:out value="/music/delete/${music.id}"/>">Delete</a></td>
        <td><a href="<c:out value="/music/update/${music.id}"/>">Update</a></td>
        <td><a href="<c:out value="/music/show/${music.id}"/>">Show details</a></td>
    </tr>
    </c:forEach>


</table>

<a href="<c:out value="/music/add"/>">Add album</a>
<%@include file="footer.jsp"%>
</body>
</html>
