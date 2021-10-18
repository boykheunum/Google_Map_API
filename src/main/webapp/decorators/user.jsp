<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Admin Map</title>
<script src='<c:url value="/static/js/jquery-3.6.0.min.js"/>'></script>



<link type="text/css" rel="stylesheet"
	href='<c:url value="/static/css/styles.css" />' />
<link type="text/css" rel="stylesheet"
	href='<c:url value="/static/css/test.css" />' />

</head>
<body class="sb-nav-fixed">
	<%@ include file="/CommonProperty/FooterAndHeader/admin/Header.jsp"%>
	<div id="layoutSidenav_content">
		<decorator:body />
		<%@ include file="/CommonProperty/FooterAndHeader/admin/Footer.jsp"%>

		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
			crossorigin="anonymous"></script>
		<script src="<c:url value="/static/js/scripts.js"/>"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"
			crossorigin="anonymous"></script>

		<script src="<c:url value="/static/assets/demo/chart-area-demo.js"/>"></script>
		<script src="<c:url value="/static/assets/demo/chart-bar-demo.js"/>"></script>
</body>
<script src="<c:url value="/static/js/mapAPI.js"/>"></script>
<script
	src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&callback=initialize"></script>
<script
	src="//maps.googleapis.com/maps/api/js?key=YOUR_KEY &callback=initMap&libraries=&v=weekly"
	async defer></script>
</html>


