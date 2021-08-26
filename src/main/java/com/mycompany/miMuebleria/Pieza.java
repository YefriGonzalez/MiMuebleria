
package com.mycompany.miMuebleria;

/**
 *
 * @author yefri
 */
public class Pieza {
    private String tipoPieza;
    private double costoPieza;

    public Pieza(String tipoPieza, double costoPieza) {
        this.tipoPieza = tipoPieza;
        this.costoPieza = costoPieza;
    } 

    public String getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    public double getCostoPieza() {
        return costoPieza;
    }

    public void setCostoPieza(double costoPieza) {
        this.costoPieza = costoPieza;
    }
    
    
}
