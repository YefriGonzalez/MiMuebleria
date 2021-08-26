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
public class Cliente {
    private String nombre;
    private Integer NIT;
    private String direccion;
    private String municipio;
    private String departamento;

    public Cliente(String nombre, Integer NIT, String direccion, String municipio, String departamento) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.direccion = direccion;
        this.municipio = municipio;
        this.departamento = departamento;
    }

    public Cliente(String nombre, Integer NIT, String direccion) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNIT() {
        return NIT;
    }

    public void setNIT(Integer NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
