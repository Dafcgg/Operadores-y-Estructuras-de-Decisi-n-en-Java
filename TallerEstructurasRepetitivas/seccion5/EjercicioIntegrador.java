package org.example.TallerEstructurasRepetitivas.seccion5;

import java.util.Scanner;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacidadMaxima = 500;
        int totalUnidades = 0;
        double valorInventario = 0;
        int productosRegistrados = 0;
        int opcion;

        do {
            System.out.println("===== ALMACÉN LOGÍSTICO =====");
            System.out.println("1. Registrar Lote de Productos");
            System.out.println("2. Ver Estado del Almacén");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cantidad de productos del lote: ");
                    int n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {
                        System.out.println("--- Producto " + i + " de " + n + " ---");
                        System.out.print("¿Está descontinuado? (s/n): ");
                        String respuesta = sc.next();

                        if (respuesta.equalsIgnoreCase("s")) {
                            System.out.println("Producto descontinuado, se omite.");
                            continue;
                        }

                        System.out.print("Precio del producto: ");
                        double precio = sc.nextDouble();
                        while (precio <= 0) {
                            System.out.println("El precio debe ser mayor a cero.");
                            System.out.print("Precio del producto: ");
                            precio = sc.nextDouble();
                        }

                        System.out.print("Cantidad en stock: ");
                        int cantidad = sc.nextInt();
                        while (cantidad <= 0) {
                            System.out.println("La cantidad debe ser mayor a cero.");
                            System.out.print("Cantidad en stock: ");
                            cantidad = sc.nextInt();
                        }

                        totalUnidades += cantidad;
                        valorInventario += precio * cantidad;
                        productosRegistrados++;

                        if (totalUnidades > capacidadMaxima) {
                            System.out.println("ALERTA: Sobrecupo del almacén. Se supera la capacidad de " + capacidadMaxima + " unidades.");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("----- ESTADO DEL ALMACÉN -----");
                    System.out.println("Productos registrados: " + productosRegistrados);
                    System.out.println("Unidades totales: " + totalUnidades + " de " + capacidadMaxima);
                    System.out.println("Valor del inventario: $" + valorInventario);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
}
