
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
                    <h4>Agregar Nuevo Registro</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombre</label>
                        <input type="text" name="name" class="form-control">
                        <label>Id Room</label>
                        <input type="number" name="idRoom" class="form-control">
                        <label>Is Indispensable</label>
                        <input type="text" name="isIndispensable" class="form-control">                                           
                        <label>Brand</label>
                        <input type="text" name="brand" class="form-control">
                        <label>Model</label>
                        <input type="text" name="model" class="form-control">
                        <label>Wifi</label>
                        <input type="text" name="wifiBuiltIn" class="form-control">
                        <label>Bluetooth</label>
                        <input type="text" name="bluetoothWifiBuiltIn" class="form-control">
                        
                        <input type="submit" value="Add" class="btn btn-success">
                        <a href="index.htm">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
