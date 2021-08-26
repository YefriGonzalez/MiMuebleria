/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miMuebleria;

import java.time.LocalDate;

/**
 *
 * @author yefri
 */
public class EnsambleMueble {
    
    Mueble mueble;
    Usuario usuario;
    LocalDate fecha;

    public EnsambleMueble(Mueble mueble, Usuario usuario, LocalDate fecha) {
        this.mueble = mueble;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public Mueble getMueble() {
        return mueble;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
