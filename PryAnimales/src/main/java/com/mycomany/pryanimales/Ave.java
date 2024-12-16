package com.mycomany.pryanimales;

public class Ave extends Animal {

    double envergaduraAlas;

    public Ave(double envergaduraAlas, String nombre, int edad) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }

    public void Volar() {
        System.out.println(nombre + " esta volando con una envergadura de " + envergaduraAlas);
    }
}
