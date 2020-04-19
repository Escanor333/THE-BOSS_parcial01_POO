package com.AATM.x00304019;

import javax.swing.*;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public Empresa(String empresa) {
        nombre = empresa;
    }


    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleado(Empleado persona){
        empleados.add(persona);
    }

    public void quitEmpleados(String eliminar) {
            for (int i = 0; i < empleados.size(); i++) {
                if (empleados.get(i).getNombre().equalsIgnoreCase(eliminar)) {

                    JOptionPane.showMessageDialog(null, "Empleado a despedir:\n" + empleados.remove(i));
                } else
                    JOptionPane.showMessageDialog(null, "No se encontro el empleado.");
            }
        /*for (int i = 0; i < empleados.size(); i++){
            if ()
        }
        empleados.remove(eliminar);
        JOptionPane.showMessageDialog(null, "Se borro esa vaina");
    }*/
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}

