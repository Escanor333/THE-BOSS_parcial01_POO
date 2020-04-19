package com.AATM.x00304019;

import java.util.ArrayList;
import java.util.List;

public class ServicioProfesional extends Empleado {
    private int mesesContrato;

    public ServicioProfesional(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public ServicioProfesional(String nombre, String puesto, double salario, ArrayList<Documento> documentos, int tipo, int mesesContrato) {
        super(nombre, puesto, salario, documentos, tipo);
        this.mesesContrato = mesesContrato;
    }

    public ServicioProfesional() {

    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}





