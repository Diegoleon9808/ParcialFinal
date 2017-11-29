/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Vo.recoleccionfamilia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class crud_Recoleccionfamilia {

    public List<recoleccionfamilia> findAll() throws SQLException {
        List<recoleccionfamilia> departamentos = null;
        String query = "SELECT * FROM recoleccionfamilia";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            String Fecha;
            String Recolector;
            String Colmena;
            int CantidadMiel;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<recoleccionfamilia>();
                }

                recoleccionfamilia registro = new recoleccionfamilia();

                Fecha = rs.getString("Fecha");
                registro.setFecha(Fecha);

                Recolector = rs.getString("Recolector");
                registro.setRecolector(Recolector);

                Colmena = rs.getString("Colmena");
                registro.setColmena(Colmena);

                CantidadMiel = rs.getInt("CantidadMiel");
                registro.setCantidadMiel(CantidadMiel);
                
                departamentos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return departamentos;
    }

    public boolean insert(recoleccionfamilia t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into recoleccionfamilia (Fecha,Recolector,Colmena,CantidadMiel) " + "values (?,?,?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getFecha());
            preparedStmt.setString(2, t.getRecolector());
            preparedStmt.setString(3, t.getColmena());
            preparedStmt.setInt(4, t.getCantidadMiel());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


}
