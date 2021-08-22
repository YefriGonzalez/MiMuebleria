<%-- 
    Document   : fabricajsp
    Created on : 21/08/2021, 22:57:31
    Author     : yefri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area de Fabrica|Mi Muebleria</title>
        <link href="css/estilosFabrica.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>  
        <header>Area de Fabrica</header>
        <div class="menu">
            <ul>
                <li id="f1"><a href="">Crear Pieza</a></li>
                <li class="submenu">
                    <form class="form1" method="POST" action="">
                        <input type="text" name="tipoPieza" placeholder="Tipo de Pieza" required/>
                        <hr>
                        <input type="number" name="costoPieza" placeholder="Costo de Pieza" required/>
                        <hr>
                        <input type="submit" value="Ingresar Pieza"/>
                    </form>
                </li>
                <li>|</li>
                <li><a href="">Eliminar Pieza</a></li>
                <li class="submenu">
                    <form method="POST" action="">
                        <input type="text" name="tipoPieza" placeholder="Tipo de Pieza" required/>
                        <hr>
                        <input type="number" name="costoPieza" placeholder="Cantidad De Piezas" required/>
                        <hr>
                        <input type="submit" value="Eliminar Piezas"/>
                    </form>
                </li>
                <li>|</li>
                <li><a href="">Modificar Pieza</a></li>
                <li class="submenu">
                    <form method="POST" action="">
                        <input type="text" name="tipoPieza" placeholder="Tipo de Pieza actual" required/>
                        <hr>
                        <input type="number" name="costoPieza" placeholder="Costo de Pieza Actual" required/>
                        <hr>
                        <input type="text" name="tipoPieza" placeholder="Tipo de Pieza Nueva" required/>
                        <hr>
                        <input type="number" name="costoPieza" placeholder="Costo Nuevo" required/>
                        <hr>
                        <input type="submit" value="Modificar Piezas"/>
                    </form>
                </li>
                <li>|</li>
                <li><a href="">Ensamblar Mueble A partir de Piezas</a></li>
                <li class="submenu">
                    <form method="POST" action="">
                        <input type="text" name="tipoMueble" placeholder="Tipo de Mueble" required/>
                        <hr>
                        <input type="text" name="usuarioEnsamble" placeholder="Usuario" required/>
                        <hr>
                        <input type="date" name="fechaEnsamble" placeholder="Fecha de Ensamble" required/   >
                        <hr>
                        <input type="submit" value="Ensamblar Mueble"/>
                    </form>
                </li>
                <li>|</li>
                <li><a href="">Consultar Cantidad de Piezas</a></li>
                <li>|</li>
                <li><a href="">Consultar informacion de los Muebles Creados</a></li>
            </ul>
        </div>

    </body>
</html>
