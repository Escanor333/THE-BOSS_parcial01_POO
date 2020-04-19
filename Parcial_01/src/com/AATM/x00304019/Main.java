package com.AATM.x00304019;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Documento> doc = new ArrayList<>();
        Empresa emp;
        Empleado persona = null;
        PlazaFija pf = new PlazaFija();
        ServicioProfesional sp = new ServicioProfesional();
        String empresa = JOptionPane.showInputDialog(null, "Digite el nombre de la empresa: ");
        emp = new Empresa(empresa);

        JOptionPane.showMessageDialog(null, "Nombre de la empresa: " + emp.getNombre());

        String menu = "1. Agregar Empleado:\n" + "2. Despedir Empleado:\n" + "3. Ver lista de empleado:\n" +
                "4. Calcular Sueldo:\n" + "5. Mostrar Totales\n";



        byte op;

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(null, menu));

            switch (op) {
                case 1:

                    String nombre = JOptionPane.showInputDialog(null, "Nombre del empleado: ");
                     String puesto = JOptionPane.showInputDialog(null, "Puesto: ");
                     double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: "));
                     String nombreDOC = JOptionPane.showInputDialog(null, "Digite el nombre del documento: ");
                     String numeroDOC = JOptionPane.showInputDialog(null, "Digite el numero del documento: ");
                    doc.add(new Documento(nombreDOC, numeroDOC));
                    persona = new Empleado(nombre, puesto, salario, doc);
                    JOptionPane.showMessageDialog(null, "La informacion del empleado: " + persona.getNombre() + ", " + persona.getPuesto() + ", " +
                    persona.getSalario() + ", " + persona.getDocumentos());
                    String[] tipo = {"Plaza Fija", "Servicio Profesional"};
                    int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", null,  +
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]);

                    if (seleccion == 0){
                        pf.setExtension(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la extension: ")));
                        JOptionPane.showMessageDialog(null, "La extension es: " + pf.getExtension());
                    }else{
                        sp.setMesesContrato(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite los meses del contrato: ")));
                        JOptionPane.showMessageDialog(null, "Meses del contrato: " + sp.getMesesContrato());
                    }
                    emp.addEmpleado(persona);
                    JOptionPane.showMessageDialog(null, "" + emp.getNombre() + " " + emp.getEmpleados());

                    break;

                case 2:

                    String buscar = JOptionPane.showInputDialog(null, "Buscar empleado por el nombre del documento: ");
                    emp.quitEmpleados(buscar);

                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, emp + "\n");
                    break;

                case 4:

                    CalculadoraImpuesto ci = new CalculadoraImpuesto();
                    String calcular = JOptionPane.showInputDialog(null, "Digite el nombre del empleado: ");
                    ci.CalcularPago(persona);
                    JOptionPane.showMessageDialog(null, "Mostrar totales" + ci.MostrarTotales());

                    break;

                case 5:
                    break;
            }



        }while (op != 5) ;
    }
}
