package Refactorizar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();  // Limpiar buffer

                    Producto nuevo = new Producto(nombre, cantidad, precio);
                    inventario.agregarProducto(nuevo);
                    break;
                case 2:
                    inventario.mostrarProductos();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
