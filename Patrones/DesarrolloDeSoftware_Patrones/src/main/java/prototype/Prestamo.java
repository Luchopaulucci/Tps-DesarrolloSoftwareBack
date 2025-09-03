package main.java.prototype;

public class Prestamo implements Cloneable{
    private String libro;
    private String usuario;
    private String fechaInicio;
    private String fechaFin;

    public Prestamo(String libro, String usuario, String fechaInicio, String fechaFin) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Prestamo clone() {
        try {
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void mostrar() {
        System.out.println("Prestamo libro: " + libro + ", Usuario: " + usuario + ", Inicio Prestamo: "  + fechaInicio + ", Fin Prestamo: " + fechaFin );
    }
}
