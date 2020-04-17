package com.AATM.x00304019;

import java.util.*;

public abstract class  Empleado {
    protected String nombre, puesto;
    protected double salario;
    protected ArrayList<Documento> doc = new ArrayList<Documento>();

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void addDocumento(){

    }

    public void removeDocumento(){

    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public List<Documento> getDocumentos() {
        return doc;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                ", doc=" + doc +
                '}';
    }
}
