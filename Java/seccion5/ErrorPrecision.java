package org.example.seccion5;

public class ErrorPrecision {
    public static void main(String[] args) {
        int tareasCompletadas = 3;
        int tareasTotales = 4;

        double porcentajeAvance = ((double) tareasCompletadas / tareasTotales) * 100;

        System.out.println("El porcentaje de avance es: " + porcentajeAvance + "%");
    }
}
