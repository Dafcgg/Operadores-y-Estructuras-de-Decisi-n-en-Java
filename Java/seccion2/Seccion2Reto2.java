package org.example.seccion2;

public class Seccion2Reto2 {
    public static void main(String[] args) {
        evaluar(85.0, 90, false);
        evaluar(65.0, 70, true);
        evaluar(55.0, 95, true);
        evaluar(50.0, 60, false);
    }

    public static void evaluar(double calificacionFinal, int porcentajeAsistencia, boolean entregoProyectoFinal) {
        String estado;

        if (calificacionFinal >= 70.0 && porcentajeAsistencia >= 80) {
            estado = "Aprobado";
        } else if (entregoProyectoFinal && calificacionFinal >= 60.0) {
            estado = "Pendiente de Examen Extraordinario";
        } else {
            estado = "Reprobado";
        }

        System.out.println("Calificacion: " + calificacionFinal);
        System.out.println("Asistencia: " + porcentajeAsistencia + "%");
        System.out.println("Entrego proyecto final: " + entregoProyectoFinal);
        System.out.println("Dictamen: " + estado);
        System.out.println();
    }
}
