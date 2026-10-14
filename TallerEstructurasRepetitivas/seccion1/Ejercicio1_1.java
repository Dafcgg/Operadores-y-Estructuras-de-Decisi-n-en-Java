package org.example.TallerEstructurasRepetitivas.seccion1;

import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int acumulador = 0;
        int contador = 0;

        System.out.print("Ingrese un número entero (-99 para terminar): ");
        int numero = entrada.nextInt();

        while (numero != -99) {
            acumulador += numero;
            contador++;
            System.out.print("Ingrese un número entero (-99 para terminar): ");
            numero = entrada.nextInt();
        }

        System.out.println("Total acumulado: " + acumulador);
        System.out.println("Cantidad de números ingresados: " + contador);
    }
}
