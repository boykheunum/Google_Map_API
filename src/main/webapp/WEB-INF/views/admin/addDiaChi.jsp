<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
<body>
	<form:form method="POST" action="addDiachi" modelAttribute="Mmap">
		Dia chi:<form:input path="DiaChi" />
		<br />
		Mo ta:<form:input path="MoTa" />
		<br />
		So dien thoai:<form:input path="Sdt" />
		<br />
		The loai:<form:input path="TheLoai" />
		<br />
		Lat:<form:input path="lat" />
		<br />
		Log:<form:input path="log" />
		<br />
		<button type=submit>Dong y</button>
	</form:form>
</body>
</html>