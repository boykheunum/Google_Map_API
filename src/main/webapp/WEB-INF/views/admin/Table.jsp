<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>Dia Chi</th>
			<th>Mo ta</th>
			<th>The loai</th>
			<th>So dien thoai</th>
			<th>lat</th>
			<th>log</th>
			<th></th>
		</tr>
		<c:forEach var="items" items="${list }">
			<tr>
				<td>${items.getId() }</td>
				<td>${items.getDiaChi() }</td>
				<td>${items.getMoTa() }</td>
				<td>${items.getTheLoai() }</td>
				<td>${items.getSdt() }</td>
				<td>${items.getLat() }</td>
				<td>${items.getLog() }</td>
				<td><a href="deleteDiaChi/${items.getId() }">Delete</a>|<a
					href="updateDiaChi?id=${items.getId() }">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>