package main.java.abstractfactory;

public class EnvioExpress implements MetodoEnvio{
    public void enviarLibro(String tituloLibro) {
        System.out.println("El libro se envio express");
    }
}
