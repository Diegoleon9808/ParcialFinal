
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Recoleccion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body bgcolor="#ffffff" background="fondo.jpg">

    <center>
        <p>&nbsp;</p>    
        <h1>Recoleccion</h1>
    </center>



    <center>
        <table >
            <tr >
                <th><strong>Fecha</strong></th>
                <th><strong>Recolector</strong></th>
                <th><strong>Colmena</strong></th>
                <th><strong>Kilos de miel</strong></th>

            </tr>
            <form action="Recoleccion" method="post"> 
                <tr >

                    <td><input class="contact" type="text" name="fecha" value="" /></td>
                    <td><input class="contact" type="text" name="recolector" value="" /></td>
                    <td><input class="contact" type="text" name="colmena" value="" /></td>
                    <td><input class="contact" type="text" name="cantidadMiel" value="" /></td>
                    <td ><input style="background-color: #ffff33" class="submit" type="submit" name="crear"  value="insertar" onClick="value = 1" > <td> 
                    <td> <input style="background-color: #ffff33" class="submit" type="submit" name="finalizar"  value="cancelar" onClick="value = 2" > <td>
            </form>




            </tr>

        </table>
        
        
        
        <p>&nbsp;</p>


        <table >
            <tr>
                <td> <a  href="listado.jsp" ><input style="background-color: #33ffff"  class="submit" type="submit" name="listar_todo" value="Listar todo" /> </td>
              
            </tr>
        </table>



    </center>







</body>
</html>

