<!DOCTYPE html>
<html>
    <head>
        <title>Recoleccion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
    <body>   
        <h1 class="w3-center">Recoleccion</h1>   

        <form action="recolectafin" method="post"> 
            <p>Fecha</p>
            <input class="contact" type="text" name="fecha" value="" />
            <p>Recolector</p>
            <input class="contact" type="text" name="recolector" value="" />
            <p>Colmena</p>
            <input class="contact" type="text" name="colmena" value="" />
            <p>Kilos de miel</p>          
            <input class="contact" type="text" name="cantidadMiel" value="" />
            <br>
            <input type="submit" name="crear"  value="insertar" onClick="value = 1">
        </form>
        <br>
        <a href="Listado.jsp">Listar Todo</a>


    </body>
</html>

