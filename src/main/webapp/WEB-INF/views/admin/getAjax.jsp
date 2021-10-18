<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

	 <c:forEach var="item" items="${ajax }">
	 	<h3>${item }</h3>
	 </c:forEach> 
</body>
</html>