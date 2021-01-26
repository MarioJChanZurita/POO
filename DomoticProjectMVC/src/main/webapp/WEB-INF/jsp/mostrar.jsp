<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dispositivos</title>
</head>
<h1 align="center">Lista de dispositivos</h1>
<body>

	<table>
		<tbody>
			<c:forEach var="device" items="${devicesList}">
			<c:forEach var="specs" items="${specsList}">
			<tr>
				<td>${device.id}</td>
				<td>${device.name}</td>
				<td>${device.id_room}</td>
				<td>${device.is_indispensable}</td>
				<td>${device.id_specs}</td>
				
				<c:if test="${device.id_specs == specs.id }">
					<td>${specs.id}</td>				
					<td>${specs.brand}</td>
					<td>${specs.model}</td>
					<td>${specs.wifi_built_in}</td>
					<td>${specs.bluetooth_built_in}</td>
				</c:if>

				<td>
					<a href="irEditar.html?id=${device.id }" class="btn btn-warning">Editar</a>
					<a href="eliminar.html?id=${device.id }" class="btn btn-danger">Eliminar</a>
				</td>
			</tr>
			</c:forEach>
			</c:forEach>
		</tbody>
	</table>	
	<a href="irMenu">Regresar</a>

</body>
</html>