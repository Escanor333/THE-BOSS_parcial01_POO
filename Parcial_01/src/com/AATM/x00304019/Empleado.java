package com.AATM.x00304019;

import javax.print.Doc;
import java.util.*;

public class  Empleado {
    protected String nombre, puesto;
    protected double salario;
    protected ArrayList<Documento> documentos = new ArrayList<>();
    protected int tipo;

    public Empleado(){

    }

    public Empleado(String nombre, String puesto, double salario, ArrayList<Documento> documentos, int tipo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.documentos = documentos;
        this.tipo = tipo;
    }

    public void addDocumento(Documento DUI){
        documentos.add(DUI);
    }

    public void removeDocumento(String a){

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
        return documentos;
    }

    public int getTipo() {
        return tipo;
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
                ", documentos=" + documentos +
                '}';
    }
}