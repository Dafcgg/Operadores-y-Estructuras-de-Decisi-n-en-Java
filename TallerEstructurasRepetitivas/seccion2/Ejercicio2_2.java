package org.example.TallerEstructurasRepetitivas.seccion2;

import java.util.Scanner;
public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 0;
        int opcion;

        do {
            System.out.println("MENÚ BANCARIO");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Realizar Retiro");
            System.out.println("4. Salir del Sistema");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = entrada.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("El monto debe ser mayor a cero.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = entrada.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("El monto debe ser mayor a cero.");
                    } else if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro realizado. Nuevo saldo: $" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
}

