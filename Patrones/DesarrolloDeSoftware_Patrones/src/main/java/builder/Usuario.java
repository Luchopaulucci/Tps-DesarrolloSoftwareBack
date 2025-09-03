package main.java.builder;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;

    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.email = builder.email;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
        this.fechaNacimiento = builder.fechaNacimiento;
    }

    public static class Builder {
        private String nombre;
        private String email;
        private String direccion;
        private String telefono;
        private String fechaNacimiento;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder fechaNacimiento(String fecha) {
            this.fechaNacimiento = fecha;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    public void mostrar() {
        System.out.println("Usuario con nombre " + nombre + ", email " + email + ", direccion en " + direccion + ", telefono " + telefono + ", fecha de Nacimiento " + fechaNacimiento);
    }

}
