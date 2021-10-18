<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<form:form method="POST" action="UpdateDiachi" modelAttribute="Mmap">
		<form:input path="id" value="${id }" type="hidden" />
		Dia chi:<form:input path="DiaChi" value="${modelMap.getDiaChi() }" />
		<br />
		Mo ta:<form:input path="MoTa" value="${modelMap.getMoTa() }" />
		<br />
		So dien thoai:<form:input path="Sdt" value="${modelMap.getSdt() }" />
		<br />
		The loai:<form:input path="TheLoai" value="${modelMap.getTheLoai() }" />
		<br />
		Lat:<form:input path="lat" value="${modelMap.getLat() }" />
		<br />
		Log:<form:input path="log" value="${modelMap.getLog() }" />
		<br />
		<button type=submit>Dong y</button>
	</form:form>
</body>
</html>