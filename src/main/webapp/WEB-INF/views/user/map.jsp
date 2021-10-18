<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<!DOCTYPE html>
<html>
<body>
	<div id="map"></div>
	<script>
		$.ajax({
			method : "GET",
			url : "./admin/getAjax",
			dataType : 'json',
			success : function(data) {
				initMap(data);
			}
		});
	</script>
</body>


</html>