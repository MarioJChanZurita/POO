<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar</title>
</head>
<body>
	<div class="container mt-4 col-lg-4">
		<div class="card border-info">
			<div class="card-header bg-info">
				<h4>Registrar nuevo dispositivo</h4>
			</div>
			<div class="card-body">
				<form method="POST">
				
					<h2>Device</h2>
					<label>Nombre</label>
					<input type="text" name="deviceName" class="form-control">
					<label>IdRoom</label>
					<input type="number" name="idRoom" class="form-control">
					<label>IsIndispensable</label>
						<select name="isIndispensable" style="border: 1px solid #04467E; color: #2D4167; width: 200px; ">
							<option value="0">Select</option>
							<option value="true">Yes</option>
							<option value="false">No</option>
						</select>
					<label>DeviceSpecsId</label>
					<input type="number" name="deviceSpecsId" class="form-control">
					
					<h2>Specs</h2>
					<label>Specs Id</label>
					<input type="number" name="specsId" class="form-control">
					<label>Brand</label>
						<select name="brand">
							<option value="0">Select</option>
							<option value="LG">LG</option>
							<option value="Panasonic">Panasonic</option>
							<option value="Sony">Sony</option>
							<option value="Daewo">Daewo</option>
							<option value="Carrier">Carrier</option>
							<option value="York">York</option>
						</select>
					<label>Model</label>
					<input type="text" name="isIndispensable" class="form-control">
					<label>Wifi</label>
						<select name="wifi">
							<option value="0">Select</option>
							<option value="true">Yes</option>
							<option value="false">No</option>
						</select>
					<label>Bluetooth</label>
						<select name="bluetooth">
							<option value="0">Select</option>
							<option value="true">Yes</option>
							<option value="false">No</option>
						</select>
					<input type="submit" value="registrar" class="btn btn-success">
					<a href="irMenu.html">Regresar</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>