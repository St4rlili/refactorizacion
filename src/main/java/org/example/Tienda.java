package org.example;

public class Tienda {
    public String direccion;
    public String telefono;

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String toString() {
        return "Tienda:\n" + "Dirección: " + direccion + "\n" + "Teléfono: " + telefono;
    }
}