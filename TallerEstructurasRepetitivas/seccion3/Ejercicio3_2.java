package org.example.TallerEstructurasRepetitivas.seccion3;

import java.util.Scanner;
public class Ejercicio3_2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        int n;
        do {
            System.out.print("Ingrese un número entero positivo (1 a 20): ");
            n = entrada.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("Error: el número debe estar entre 1 y 20");
            }
        } while (n < 1 || n > 20);

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);

        System.out.println("----- Patrón triangular -----");
        for (int fila = 1; fila <= n; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }
}
