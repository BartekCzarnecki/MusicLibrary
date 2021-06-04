<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Artist</title>
</head>
<body>

<%@ include file="header.jsp" %>

<form:form method="post" modelAttribute="artist">
    Artist: <form:input path="name"/>
    <form:errors path="name"/><br/>
    <input type="submit" value="Save">
</form:form>

<%@ include file="footer.jsp" %>

</body>
</html>
