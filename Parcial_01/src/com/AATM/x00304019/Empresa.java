package com.AATM.x00304019;

import java.util.*;

public class Empresa {
    private String nombre;
    ArrayList<Empleado> Emp = new ArrayList<Empleado>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getPlanilla() {
        return Emp;
    }

    public void addEmpleado(){

    }

    public void quitEmpleado(){

    }
}
