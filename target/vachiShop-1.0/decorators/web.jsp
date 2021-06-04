<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Ogani Template">
<meta name="keywords" content="Ogani, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>VaChiShop</title>

<!-- Google Font -->
<!-- <link
	href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap"
	rel="stylesheet"> -->

<!-- Css Styles -->
<link rel="stylesheet" href="<c:url value='/template/css/bootstrap.min.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/font-awesome.min.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/elegant-icons.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/nice-select.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/jquery-ui.min.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/owl.carousel.min.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/slicknav.min.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='/template/css/style.css'/>" type="text/css">

</head>

<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>


	<!-- header -->
	<%@ include file="/common/web/header.jsp"%>

	<dec:body />

	<!-- Footer -->
	<%@ include file="/common/web/footer.jsp"%>

	<!-- Js Plugins -->
	<script src="<c:url value='/template/js/jquery-3.3.1.min.js'/>"></script>
	<script src="<c:url value='/template/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='/template/js/jquery.nice-select.min.js'/>"></script>
	<script src="<c:url value='/template/js/jquery-ui.min.js'/>"></script>
	<script src="<c:url value='/template/js/jquery.slicknav.js'/>"></script>
	<script src="<c:url value='/template/js/mixitup.min.js'/>"></script>
	<script src="<c:url value='/template/js/owl.carousel.min.js'/>"></script>
	<script src="<c:url value='/template/js/main.js'/>"></script>



</body>

</html>