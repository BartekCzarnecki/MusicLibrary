<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <title>Music Library</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <link rel="stylesheet" href="<c:url value="/static/css/bootstrap.min.css"/>">
    <!-- style css -->
    <link rel="stylesheet" href="<c:url value="/static/css/style.css"/>">
    <!-- Responsive-->
    <link rel="stylesheet" href="<c:url value="/static/css/responsive.css"/>">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="<c:url value="/static/css/jquery.mCustomScrollbar.min.css"/>">
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="<c:url value="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"/>">
    <link rel="stylesheet" href="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" />">
    <!--[if lt IE 9]>
    <script src="<c:url value="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"/>"></script>
    <script src="<c:url value="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"/>"></script><![endif]-->
</head>
<body>
<!-- header -->
<%@ include file="header.jsp" %>
The "Music Library" application will allow you to organize your music resources and help you manage the physical carriers of your favorite music.</br>
</br>
How it's working:</br>
1)  Add the artists you have in your collection.</br>
2)  Then you can add the artist's albums that you have in your collection.</br>
3)  After adding albums, you can delete and edit them, moreover, thanks to "Rent" option (after clicking "Show details"),</br>
    if you rent an album, you can add it to the separate list(you will have control where your album is).
<!-- /header -->
<%@ include file="footer.jsp" %>
</body>
</html>
