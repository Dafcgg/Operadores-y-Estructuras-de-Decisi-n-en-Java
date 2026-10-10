package org.example.seccion2;

public class Seccion2Ternario {
    public static void main(String[] args) {
        boolean cookieSesionActiva = true;

        String estadoConexion = cookieSesionActiva == true ? "ACTIVA" : "INACTIVA";

        System.out.println("Estado de conexion: " + estadoConexion);
    }
}
