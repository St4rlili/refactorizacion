package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Datos datos = new Datos();
        ArrayList<Tienda> tiendas = datos.getTiendas();
        ArrayList<Trabajador> trabajadores = datos.getTrabajadores();
        ArrayList<Cliente> clientes = datos.getClientes();
        ArrayList<Producto> productos = datos.getProductos();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarTiendas(tiendas);
                    break;
                case 2:
                    mostrarTrabajadores(trabajadores);
                    break;
                case 3:
                    mostrarProductos(productos);
                    break;
                case 4:
                    mostrarUltimosProductos(productos);
                    break;
                case 5:
                    comprarProductos(productos, scanner);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n1. Mostrar información de todas las tiendas");
        System.out.println("2. Mostrar información de todos los trabajadores");
        System.out.println("3. Mostrar productos disponibles");
        System.out.println("4. Últimos 3 productos añadidos");
        System.out.println("5. Comprar productos");
        System.out.println("6. Salir");
        System.out.print("Ingrese la opción: ");
    }

    public static void mostrarTiendas(ArrayList<Tienda> tiendas) {
        System.out.println("\n--- INFORMACIÓN DE TIENDAS ---");
        for (Tienda tienda : tiendas) {
            System.out.println(tienda);
            System.out.println("-----------------------------------");
        }
    }

    public static void mostrarTrabajadores(ArrayList<Trabajador> trabajadores) {
        System.out.println("\n--- INFORMACIÓN DE TRABAJADORES ---");
        for (Trabajador trabajador : trabajadores) {
            System.out.println(trabajador);
            System.out.println("-----------------------------------");
        }
    }

    public static void mostrarProductos(ArrayList<Producto> productos) {
        System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.println("-----------------------------------");
        }
    }

    public static void mostrarUltimosProductos(ArrayList<Producto> productos) {
        System.out.println("\n--- ÚLTIMOS 3 PRODUCTOS AÑADIDOS ---");
        int start = Math.max(0, productos.size() - 3);
        for (int i = start; i < productos.size(); i++) {
            System.out.println(productos.get(i));
            System.out.println("-----------------------------------");
        }
    }

    public static void comprarProductos(ArrayList<Producto> productos, Scanner scanner) {
        System.out.println("\n--- COMPRAR PRODUCTOS ---");
        System.out.print("Ingrese el SKU del producto que desea comprar: ");
        String sku = scanner.next();
        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = scanner.nextInt();

        for (Producto producto : productos) {
            if (producto.getSku().equals(sku)) {
                if (producto.getCantidad() >= cantidad) {
                    producto.setCantidad(producto.getCantidad() - cantidad);
                    System.out.println("Compra exitosa!");
                } else {
                    System.out.println("No hay suficiente cantidad de este producto.");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado con SKU: " + sku);
    }
}