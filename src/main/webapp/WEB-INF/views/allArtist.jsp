<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Music List</title>
</head>
<body>
<%@ include file="header.jsp"%>
Artist:
<table border="1">

    <th>Name</th>
    <c:forEach items="${allArtist}" var="artist">
    <tr>
            <td><c:out value="${artist.name}"/></td>
            <td><a href="<c:out value="/artist/delete/${artist.id}"/>">Delete</a></td>
    </tr>
    </c:forEach>
</table>

<a href="<c:out value="/artist/add"/>">Add artist</a>
<%@include file="footer.jsp"%>
</body>
</html>
