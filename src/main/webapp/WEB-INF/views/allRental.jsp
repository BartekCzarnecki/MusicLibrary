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
    <th>Name</th>
    <th>Album</th>
    <th>Date</th>
    <tr>
        <c:forEach items="${allRental}" var="rent">
            <td><c:out value="${rent.fullName}"/></td>
            <td><c:out value="${rent.music.title}"/></td>
            <td><c:out value="${rent.date}"/></td>
            <td><a href="<c:out value="/rental/delete/${rent.id}"/>">Delete</a></td>
            <td><a href="<c:out value="/rental/update/${rent.id}"/>">Update</a></td>
        </c:forEach>
    </tr>


</table>
<%@include file="footer.jsp"%>
</body>
</html>