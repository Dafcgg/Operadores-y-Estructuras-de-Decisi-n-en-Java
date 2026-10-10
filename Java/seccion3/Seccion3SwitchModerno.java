package org.example.seccion3;

import java.util.Scanner;

public class Seccion3SwitchModerno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero del dia (1 a 7): ");
        int dia = entrada.nextInt();

        String jornada = switch (dia) {
            case 1 -> "Lunes - Jornada laboral";
            case 2 -> "Martes - Jornada laboral";
            case 3 -> "Miercoles - Jornada laboral";
            case 4 -> "Jueves - Jornada laboral";
            case 5 -> "Viernes - Jornada laboral";
            case 6 -> "Sabado - Media jornada";
            case 7 -> "Domingo - Descanso";
            default -> "Dia no valido";
        };

        System.out.println(jornada);
        entrada.close();
    }
}
