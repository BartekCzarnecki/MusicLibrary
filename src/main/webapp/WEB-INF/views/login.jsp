<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<%@ include file="header.jsp" %>
<section class="dashboard-section">
  <div class="container pt-4 pb-4">
    <div class="border-dashed view-height">
      <div class="container w-25">
        <form:form class="padding-small text-center" action="/user/login" method="post" modelAttribute="user">
          <p hidden><form:input path="id"/></p>
          <h1 class="text-color-darker">Logowanie</h1>
          <div class="form-group">
            <form:input path="login" type="text" class="form-control" id="login" name="login" placeholder="podaj login" required="true"/>
          </div>
          <div class="form-group">
            <form:input path="password" type="password" class="form-control" id="password" name="password" placeholder="podaj hasło" required="true"/>
          </div>
          <button class="btn btn-color rounded-0" type="submit">Zaloguj</button>
        </form:form>
      </div>
    </div>
  </div>
</section>
<%@ include file="footer.jsp" %>
</body>
</html>
<script src="<c:url value="/static/js/jquery.min.js"/>"></script>
<script src="<c:url value="/static/js/popper.min.js"/>"></script>
<script src="<c:url value="/static/js/bootstrap.bundle.min.js"/>"></script>
<script src="<c:url value="/static/js/jquery-3.0.0.min.js"/>"></script>
<script src="<c:url value="/static/js/plugin.js"/>"></script>
<!-- sidebar -->
<script src="<c:url value="/static/js/jquery.mCustomScrollbar.concat.min.js"/>"></script>
<script src="<c:url value="/static/js/custom.js"/>"></script>
<script src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"/>"></script>
