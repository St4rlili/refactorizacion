package org.example;

public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;
    public String sku;

    public Producto(String nombre, double precio, int cantidad, String sku) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.sku = sku;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public String getSku() { return sku; }

    public String toString() {
        return "Producto:\n" + "Nombre: " + nombre + "\n" + "Precio: " + precio + "\n" + "Cantidad: " + cantidad + "\n" + "SKU: " + sku;
    }
}