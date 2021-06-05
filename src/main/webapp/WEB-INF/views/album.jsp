<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Album</title>
</head>
<body>
<%@ include file="header.jsp"%>
<table border="1">
    <thead>
    <th>ID</th>
    <th>Artist</th>
    <th>Title</th>
    <th>Format</th>
    <th>Label</th>
    <th>Year</th>
    <th>Genre</th>
    <th>Music style</th>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${music.id}"/></td>
        <td><c:out value="${music.artist.name}"/></td>
        <td><c:out value="${music.title}"/></td>
        <td><c:out value="${music.format}"/></td>
        <td><c:out value="${music.label}"/></td>
        <td><c:out value="${music.year}"/></td>
        <td><c:out value="${music.genre}"/></td>
        <td><c:out value="${music.musicStyle}"/></td>
    </tr>

    </tbody>
</table>
<a href="<c:out value="/rental/add"/>">Rent</a>
<%@include file="footer.jsp"%>
</body>
</html>
