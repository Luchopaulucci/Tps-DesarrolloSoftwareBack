package main.java.abstractfactory;

public class EnvioNormal implements MetodoEnvio{
    public void enviarLibro(String tituloLibro) {
        System.out.println("El libro se envio normal");
    }
}
