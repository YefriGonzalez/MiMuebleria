
package com.mycompany.miMuebleria;

/**
 *
 * @author yefri
 */
public class Mueble {
    private String tipoMueble;
    private double precioVenta;

    public Mueble(String tipoMueble, double precioVenta) {
        this.tipoMueble = tipoMueble;
        this.precioVenta = precioVenta;
    }   

    public String getTipoMueble() {
        return tipoMueble;
    }

    public void setTipoMueble(String tipoMueble) {
        this.tipoMueble = tipoMueble;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
}
