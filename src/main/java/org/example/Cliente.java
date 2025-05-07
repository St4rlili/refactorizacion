package org.example;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String apellido, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }

    public String toString() {
        return "Cliente:\n" + "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Dirección: " + direccion + "\n" + "Teléfono: " + telefono;
    }
}
