package main.java;

import main.java.builder.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("TP Patrones Creacionales");

        //Prueba Singleton
        System.out.println("---------------Prueba patron Singleton---------------------");


        //Prueba Factory
        System.out.println("---------------Prueba patron Factory-----------------------");


        //Prueba AbstractFactory
        System.out.println("---------------Prueba patron AbstractFactory---------------");


        //Prueba Builder
        System.out.println("---------------Prueba patron Builder-----------------------");
        Usuario u1 = new Usuario.Builder()
                .nombre("Juan")
                .email("juan@gmail.com")
                .build();

        Usuario u2 = new Usuario.Builder()
                .nombre("Carlos")
                .direccion("Belgrano 742")
                .telefono("+54 261 1234567")
                .fechaNacimiento("2003-03-03")
                .build();

        u1.mostrar();
        u2.mostrar();

        //Prueba Prototype
        System.out.println("---------------Prueba patron Prototype---------------------");


    }
}

