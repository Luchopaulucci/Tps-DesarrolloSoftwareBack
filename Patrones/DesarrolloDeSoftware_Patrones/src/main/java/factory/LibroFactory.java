package main.java.factory;

public class LibroFactory {
    public static Libro crearLibro(String tipoLibro) {
        if (tipoLibro.equals("fisico")) {
            System.out.println("Se creo un libro Fisico");
            return new LibroFisico();
        } else {
            System.out.println("Se creo un libro Digital");
            return new LibroDigital();
        }
    }
}
