package org.example;

import java.util.ArrayList;

public class Datos {
    public ArrayList<Tienda> tiendas;
    public ArrayList<Trabajador> trabajadores;
    public ArrayList<Cliente> clientes;
    public ArrayList<Producto> productos;

    public Datos() {
        crearTiendas();
        crearClientes();
        crearProductos();
        crearTrabajadores();
    }

    public void crearTiendas() {
        tiendas = new ArrayList<>();

        Tienda tienda1 = new Tienda();
        tienda1.setDireccion("Calle 123");
        tienda1.setTelefono("1234567");

        Tienda tienda2 = new Tienda();
        tienda2.setDireccion("Calle 456");
        tienda2.setTelefono("7654321");

        tiendas.add(tienda1);
        tiendas.add(tienda2);
    }

    public void crearTrabajadores() {
        trabajadores = new ArrayList<>();

        Trabajador t1 = new Trabajador("Juan", "Perez", "Calle 123", "1234567", tiendas.get(0));
        Trabajador t2 = new Trabajador("Maria", "Lopez", "Calle 456", "7654321", tiendas.get(0));
        Trabajador t3 = new Trabajador("Pedro", "Gomez", "Calle 789", "4567890", tiendas.get(1));
        Trabajador t4 = new Trabajador("Ana", "Garcia", "Calle 101", "0987654", tiendas.get(1));

        trabajadores.add(t1);
        trabajadores.add(t2);
        trabajadores.add(t3);
        trabajadores.add(t4);
    }

    public void crearClientes() {
        clientes = new ArrayList<>();

        clientes.add(new Cliente("Carlos", "Perez", "Calle 123", "1234567"));
        clientes.add(new Cliente("Ana", "Lopez", "Calle 456", "7654321"));
        clientes.add(new Cliente("Pedro", "Gomez", "Calle 789", "4567890"));
        clientes.add(new Cliente("Maria", "Garcia", "Calle 101", "0987654"));
    }

    public void crearProductos() {
        productos = new ArrayList<>();

        productos.add(new Producto("Patatas", 1.5, 100, "1234"));
        productos.add(new Producto("Manzanas", 2.5, 200, "5678"));
        productos.add(new Producto("Peras", 3.5, 300, "9101"));
        productos.add(new Producto("Uvas", 4.5, 400, "1121"));
        productos.add(new Producto("Fresas", 5.5, 500, "3141"));
        productos.add(new Producto("Platanos", 6.5, 600, "5161"));
        productos.add(new Producto("Naranjas", 7.5, 700, "7181"));
        productos.add(new Producto("Mangos", 8.5, 800, "9201"));
    }

    public ArrayList<Tienda> getTiendas() { return tiendas; }
    public ArrayList<Trabajador> getTrabajadores() { return trabajadores; }
    public ArrayList<Cliente> getClientes() { return clientes; }
    public ArrayList<Producto> getProductos() { return productos; }
}