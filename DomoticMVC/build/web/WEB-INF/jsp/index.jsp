<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <div class="container mt-4">
            <div class="card border-info">
                 <div class="card-header bg-info text-white">
                     <a class="btn btn-plight" href="register.htm">Nuevo Registro</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRE</th>
                                <th>ID ROOM</th>
                                <th>IS INDISPENSABLE</th>
                                <th>ID SPECS</th>
                                
                                <th>BRAND</th>
                                <th>MODEL</th>
                                <th>WIFI</th>
                                <th>BLUETOOTH</th>
                                
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="datoDevice" items="${listaDevice}">
                            <tr>
                                <td>${datoDevice.id}</td>
                                <td>${datoDevice.name}</td>
                                <td>${datoDevice.id_room}</td>
                                <td>${datoDevice.is_indispensable}</td>
                                <td>${datoDevice.id_specs}</td>
                                                                      
                                <c:forEach var="datoSpecs" items="${listaSpecs}">
                                    <c:if test="${datoDevice.id_specs == datoSpecs.id }">
                                        <td>${datoSpecs.brand}</td>
                                        <td>${datoSpecs.model}</td>
                                        <td>${datoSpecs.wifi_built_in}</td>
                                        <td>${datoSpecs.bluetooth_built_in}</td>                             
                                    </c:if>
                                </c:forEach>    
                                                                
                                <td>
                                    <a href="edit.htm?id=${datoDevice.id}" class="btn btn-warning">Update</a>
                                    <a href="delete.htm?id=${datoDevice.id}" class="btn btn-danger">Delete</a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>     
        </div>
    </body>
</html>
