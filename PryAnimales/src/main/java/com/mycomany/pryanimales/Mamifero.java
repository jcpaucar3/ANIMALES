package com.mycomany.pryanimales;

public class Mamifero extends Animal {

    String tipoPelaje;

    public Mamifero(String tipoPelaje, String nombre, int edad) {
        super(nombre, edad);
        this.tipoPelaje = tipoPelaje;
    }

    public void amamantarCrias() {
        System.out.println(nombre + " esta amamantando a sus crias");
    }
}
