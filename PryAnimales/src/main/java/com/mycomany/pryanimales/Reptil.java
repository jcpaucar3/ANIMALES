package com.mycomany.pryanimales;

public class Reptil extends Animal {

    String tipoEscamas;

    public Reptil(String tipoEscamas, String nombre, int edad) {
        super(nombre, edad);
        this.tipoEscamas = tipoEscamas;
    }

    public void Arrastrarse() {
        System.out.println(nombre + " se esta arrastrando con sus escamas de tipo " + tipoEscamas);
    }
}
