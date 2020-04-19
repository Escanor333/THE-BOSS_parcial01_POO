package com.AATM.x00304019;

public class Documento {
    private String nombre, numero;

    public Documento(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre +
                ", numero = " + numero ;
    }
}
