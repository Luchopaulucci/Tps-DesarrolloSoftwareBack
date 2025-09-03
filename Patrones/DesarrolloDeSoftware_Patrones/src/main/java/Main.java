package main.java;

import main.java.abstractfactory.*;
import main.java.builder.Usuario;
import main.java.factory.Libro;
import main.java.factory.LibroFactory;
import main.java.prototype.Prestamo;
import main.java.singleton.Database;

public class Main {
    public static void main(String[] args) {
        System.out.println("TP Patrones Creacionales");

        //Prueba Singleton
        System.out.println("---------------Prueba patron Singleton---------------------");
        Database conexion1 = Database.getInstance();
        Database conexion2 = Database.getInstance();
        System.out.println("Probando patron singleton, veremos si las 2 instancias de la conxion1 y conexion2 son iguales:  " + (conexion1 == conexion2));

        //Prueba Factory
        System.out.println("---------------Prueba patron Factory-----------------------");
        Libro libro1 = LibroFactory.crearLibro("fisico");
        Libro libro2 = LibroFactory.crearLibro("digital");
        libro2.entregar();
        libro1.entregar();

        //Prueba AbstractFactory
        System.out.println("---------------Prueba patron AbstractFactory---------------");
        System.out.println("---Con el Admin---");
        AbstractFactory factory = new AdminFactory();
        InterfaceUI ui = factory.crearInterfaceUI();
        MetodoEnvio envio = factory.crearMetodoEnvio();
        ui.render();
        envio.enviarLibro("El Raton Perez");

        System.out.println("---Con el Usuario---"); //utilizo la misma factory, ui y envio que declare arriba
        factory = new UsuarioFactory();
        ui = factory.crearInterfaceUI();
        envio = factory.crearMetodoEnvio();

        ui.render();
        envio.enviarLibro("El Raton Perez");

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
        Prestamo original = new Prestamo("El Raton Perez", "Pepito", "2024-11-12", "2025-02-20");
        Prestamo copia = original.clone();
        copia.mostrar();

    }
}

