package main.java.abstractfactory;

public class EnvioExpress implements MetodoEnvio{
    @Override
    public void enviarLibro(String tituloLibro) {
        System.out.println("El libro se envio Express");
    }
}
