/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vo;

/**
 *
 * @author JCBOT
 */
public class recoleccionfamilia {

    private String Fecha;
    private String Recolector;
    private String Colmena;
    private int CantidadMiel;

    public recoleccionfamilia(String Fecha, String Recolector, String Colmena, int CantidadMiel) {
        this.Fecha = Fecha;
        this.Recolector = Recolector;
        this.Colmena = Colmena;
        this.CantidadMiel = CantidadMiel;
    }

    public recoleccionfamilia() {
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getRecolector() {
        return Recolector;
    }

    public void setRecolector(String Recolector) {
        this.Recolector = Recolector;
    }

    public String getColmena() {
        return Colmena;
    }

    public void setColmena(String Colmena) {
        this.Colmena = Colmena;
    }

    public int getCantidadMiel() {
        return CantidadMiel;
    }

    public void setCantidadMiel(int CantidadMiel) {
        this.CantidadMiel = CantidadMiel;
    }



    
    

}
