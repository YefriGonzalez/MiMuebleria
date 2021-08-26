/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miMuebleria;

/**
 *
 * @author yefri
 */
public class Ensamble_Pieza {
    private Pieza pieza;
    private int cantidad;
    private Mueble mueble;

    public Ensamble_Pieza(Pieza pieza, int cantidad, Mueble mueble) {
        this.pieza = pieza;
        this.cantidad = cantidad;
        this.mueble = mueble;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Mueble getMueble() {
        return mueble;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }
    
}
