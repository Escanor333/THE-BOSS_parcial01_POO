package com.AATM.x00304019;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String menu = "1. Agregar Empleado:\n" + "2. Despedir Empleado:\n" + "3. Ver lista de empleado:\n" +
                "4. Calcular Sueldo:\n" + "5. Mostrar Totales\n";

        byte op;

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(null, menu));

            switch (op){
                case 1:
                    String puesto = JOptionPane.showInputDialog(null, "Indique en que puesto esta: ");
                    String nombre = JOptionPane.showInputDialog(null, "Agregar nombre: ");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Agregar salario base: "));




            }

            while ()
        }
    }
}
