package main.java.abstractfactory;

public class UsuarioFactory implements AbstractFactory{
    public InterfaceUI crearInterfaceUI() {
        return new UsuarioUI();
    }

    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioNormal();
    }
}
