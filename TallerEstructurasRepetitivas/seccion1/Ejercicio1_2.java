package org.example.TallerEstructurasRepetitivas.seccion1;

import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double acumulado = 0;
        boolean procesando = true;
        String causa = "";

        while (procesando) {
            System.out.print("Ingrese el monto de la transacción: ");
            double monto = entrada.nextDouble();

            if (monto < 0) {
                procesando = false;
                causa = "Se ingresó un monto negativo";
            } else {
                acumulado += monto;
                if (acumulado > 1000000) {
                    procesando = false;
                    causa = "Se superó el límite máximo de $1'000.000";
                }
            }
        }

        System.out.println("Saldo final acumulado: $" + acumulado);
        System.out.println("Causa de finalización: " + causa);
    }
}
