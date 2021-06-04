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
<table>
    <th>ID</th>
    <th>Name</th>
    <tr>
        <c:forEach items="${allArtist}" var="artist">
            <td><c:out value="${artist.id}"/></td>
            <td><c:out value="${artist.name}"/></td>
        </c:forEach>
    </tr>


</table>

<a href="<c:out value="/artist/add"/>">Add artist</a>
<%@include file="footer.jsp"%>
</body>
</html>
