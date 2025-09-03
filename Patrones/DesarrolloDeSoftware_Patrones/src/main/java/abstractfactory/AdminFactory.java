package main.java.abstractfactory;

public class AdminFactory implements AbstractFactory{
    public InterfaceUI crearInterfaceUI() {
        return new AdminUI();
    }
    public MetodoEnvio crearMetodoEnvio() {
        return new EnvioExpress();
    }
}
