package Controlador;

import Dao.crud_Recoleccionfamilia;
import Vo.recoleccionfamilia;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class recolectafin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {

            int crear;
            int finalizar;

            if (request.getParameter("crear") == null) {
                crear = 0;
            } else {
                crear = Integer.parseInt(request.getParameter("crear"));

            }

            if (request.getParameter("finalizar") == null) {
                finalizar = 0;
            } else {
                finalizar = Integer.parseInt(request.getParameter("finalizar"));
            }

            String fecha = request.getParameter("fecha");
            String recolector = request.getParameter("recolector");
            String colmena = request.getParameter("colmena");
            String cantidadMiel = request.getParameter("cantidadMiel");
            int temp = Integer.parseInt(cantidadMiel);

            if (crear == 1) {
                recoleccionfamilia final1 = new recoleccionfamilia(fecha, recolector, colmena, temp);
                crud_Recoleccionfamilia cr1 = new crud_Recoleccionfamilia();

                try {
                    cr1.insert(final1);
                } catch (SQLException ex) {
                    Logger.getLogger(recolectafin.class.getName()).log(Level.SEVERE, null, ex);
                }
                request.getRequestDispatcher("recolecta1.jsp").forward(request, response);

            }

            if (finalizar == 2) {

                request.getRequestDispatcher("recolecta1.jsp").forward(request, response);

            }

        }
    }
}
