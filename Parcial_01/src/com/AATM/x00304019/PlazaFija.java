package com.AATM.x00304019;

import java.util.ArrayList;
import java.util.List;

public class PlazaFija extends Empleado {
    private int extension;

    public PlazaFija(int extension) {
        this.extension = extension;
    }

    public PlazaFija(String nombre, String puesto, double salario, ArrayList<Documento> documentos, int extension) {
        super(nombre, puesto, salario, documentos);
        this.extension = extension;
    }

    public PlazaFija() {

    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
