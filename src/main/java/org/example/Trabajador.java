package org.example;

public class Trabajador {
    public String nombre;
    public String apellido;
    public String direccion;
    public String telefono;
    public Tienda tienda;

    public Trabajador(String nombre, String apellido, String direccion, String telefono, Tienda tienda) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tienda = tienda;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public Tienda getTienda() { return tienda; }

    public String toString() {
        return "Trabajador:\n" + "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Dirección: " + direccion + "\n" + "Teléfono: " + telefono + "\n" + "Tienda: " + tienda.getDireccion() + "\n" + "Teléfono tienda: " + tienda.getTelefono();
    }
}