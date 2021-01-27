
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">                
        <title>JSP Page</title>
    </head>
    <body>
         <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Actualizar Registro</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombre</label>
                        <input type="text" name="name" class="form-control" value="${listaDevice[0].name}">
                        <label>Id Room</label>
                        <input type="number" name="idRoom" class="form-control" value="${listaDevice[0].id_room}">
                        <label>Is Indispensable</label>
                        <input type="text" name="isIndispensable" class="form-control" value="${listaDevice[0].is_indispensable}">                                           
                        <label>Brand</label>
                        <input type="text" name="brand" class="form-control" value="${listaSpecs[0].brand}">
                        <label>Model</label>
                        <input type="text" name="model" class="form-control" value="${listaSpecs[0].model}">
                        <label>Wifi</label>
                        <input type="text" name="wifiBuiltIn" class="form-control" value="${listaSpecs[0].wifi_built_in}">
                        <label>Bluetooth</label>
                        <input type="text" name="bluetoothWifiBuiltIn" class="form-control" value="${listaSpecs[0].bluetooth_built_in}">
                        
                        <input type="submit" value="Update" class="btn btn-success">
                        <a href="index.htm">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
