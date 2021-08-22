<%-- 
    Document   : indexlogin
    Created on : 21/08/2021, 20:02:38
    Author     : yefri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi Muebleria|Login</title>
        <link href="css/estiloLogin.css" rel="stylesheet" type="text/css"/>
        <link href="css/fontello.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="contenedor1">
            <h1>Sign in</h1>
            <form class="form1">
                <img src="Imagenes/icono.png"/>
                <input type="text" name="" placeholder="Username" required/>
                <hr>
                <img src="Imagenes/icono.png"/>
                <input type="password" name="" placeholder="Password" required/>
                <hr>
                <input type="submit" value="Sign In"/>
            </form>
        </div>
        <div class="contenedor2"> 
            <form class="form2">
                <input type="submit" value="Create Account"/>
            </form>
            <div class="referencias">
                <a href="">Term Of Use</a>
                <a href="">Privacy Police</a>
            </div>
        </div>
        <div class="MasOpciones">
            <input type="checkbox" id="btn-mas">
            <div class="redes">
                <a href="" class="icon-twitter"></a>
                <a href="" class="icon-facebook"></a>
                <a href="" class="icon-youtube-play"></a>
            </div>
            <div class="btn-mas">
                <label for="btn-mas" class="icon-plus"></label>
            </div>
        </div>    
        <footer class="pie">
            <h1> Mi Muebleria © Todos los Derechos Reservados 2021.</h1>
        </footer>
    </body>
</html>