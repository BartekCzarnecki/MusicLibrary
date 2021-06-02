<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Album</title>
</head>
<body>
<table border="1">
    <thead>
    <th>artist</th>
    <th>title</th>
    <th>format</th>
    </thead>
    <tbody>
    <tr>

        <td><c:out value="${album.artist}"/></td>
        <td><c:out value="${album.title}"/></td>
        <td><c:out value="${album.format}"/></td>

    </tr>

    </tbody>
</table>
</body>
</html>
