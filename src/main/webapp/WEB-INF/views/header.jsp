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

<header>
    <!-- header inner -->
    <div class="header">
        <div class="container">
            <div class="row">
                <div class="col-xl-2 col-lg-2 col-md-2 col-sm-2 col logo_section">
                    <div class="full">
                        <div class="center-desk">
                            <div class="logo">
                                <a href="/home"><img src="/static/images/logo.jpg" alt="logo" /></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xl-8 col-lg-8 col-md-10 col-sm-10">
                    <div class="menu-area">
                        <div class="limit-box">
                            <nav class="main-menu">
                                <ul class="menu-area-main">
                                    <li class="active"> <a href="/home">Home</a> </li>
                                    <li> <a href="/about">About</a> </li>
                                    <li> <a href="/artist/all">Artist</a> </li>
                                    <li> <a href="/music/all">Albums</a> </li>
                                    <li> <a href="/rental/all">Rent</a> </li>
                                    <li> <a href="/user/login">Login</a> </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
                <div class="col-xl-2 col-lg-2 col-md-2 col-sm-2">

                </div>
            </div>
        </div>
    </div>
        <!-- end header inner -->
</header>

</body>
</html>
