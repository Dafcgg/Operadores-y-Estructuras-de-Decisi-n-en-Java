package org.example.seccion3;

import java.util.Scanner;

public class Seccion3SwitchTradicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero del dia (1 a 7): ");
        int dia = entrada.nextInt();

        String jornada;

        switch (dia) {
            case 1:
                jornada = "Lunes - Jornada laboral";
                break;
            case 2:
                jornada = "Martes - Jornada laboral";
                break;
            case 3:
                jornada = "Miercoles - Jornada laboral";
                break;
            case 4:
                jornada = "Jueves - Jornada laboral";
                break;
            case 5:
                jornada = "Viernes - Jornada laboral";
                break;
            case 6:
                jornada = "Sabado - Media jornada";
                break;
            case 7:
                jornada = "Domingo - Descanso";
                break;
            default:
                jornada = "Dia no valido";
                break;
        }

        System.out.println(jornada);
        entrada.close();
    }
}
