package com.AATM.x00304019;

import javax.swing.*;

public final class CalculadoraImpuesto {
    private static Double totalRenta = 0.0, totalISSS = 0.03 , totalAFP = 0.0625;

    public CalculadoraImpuesto() {
    }

    public double CalcularPago(Empleado empleado){
        double pago = 0,salario=empleado.getSalario();
        JOptionPane.showMessageDialog(null, "Mostrar salario: " + salario);
        if(empleado instanceof ServicioProfesional){
            totalRenta =salario*0.1;
            pago= salario- totalRenta;
        }else if(empleado instanceof PlazaFija){
            totalISSS = salario* totalISSS;
            totalAFP = salario* totalAFP;
            double restante =  salario - totalISSS - totalAFP;
            if(restante <= 472 && restante >=0.01){
                totalRenta =0.0;
            }else if(restante <= 895.24 && restante >=472.01){
                totalRenta = 0.1*(restante-472)+17.67;
            }else if(restante <= 2038.10 && restante >=895.25){
                totalRenta = 0.2*(restante-895.24)+60;
            }else if(restante >=2038.11)
                pago = restante - totalRenta;
        }
        return pago;
    }
    public String MostrarTotales(){
        return "Descuentos{" +
                " Renta:" + totalRenta +"$"+
                ", ISSS:" + totalISSS +"$"+
                ", AFP:=" + totalAFP +"$"+
                '}';
    }
}

