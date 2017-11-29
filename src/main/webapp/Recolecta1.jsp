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
        <table class="w3-table-all">
            <tr>
                <th>Fecha</th>
                <th>Recolector</th>
                <th>Colmena</th>
                <th>Kilos de miel</th>

            </tr>
        </table>
        <form action="recolectafin" method="post"> 

            <input class="contact" type="text" name="fecha" value="" />
            <input class="contact" type="text" name="recolector" value="" />
            <input class="contact" type="text" name="colmena" value="" />
            <input class="contact" type="text" name="cantidadMiel" value="" />
            <input style="background-color: #ffff33" class="submit" type="submit" name="crear"  value="insertar" onClick="value = 1" >
            <input style="background-color: #ffff33" class="submit" type="submit" name="finalizar"  value="cancelar" onClick="value = 2" >


        </form>       


        <table >
            <tr>
                <td> <a  href="Listado.jsp" ><input style="background-color: #33ffff"  class="submit" type="submit" name="listar_todo" value="Listar todo" /> </td>

            </tr>
        </table>  

    </body>
</html>

