package org.example.seccion2;

public class Seccion2Reto1 {
    public static void main(String[] args) {
        clasificar(10);
        clasificar(15);
        clasificar(28);
        clasificar(68);
    }

    public static void clasificar(int edadUsuario) {
        String categoria;
        String perfil;

        if (edadUsuario < 12) {
            categoria = "Infante";
            perfil = "Requiere tutor de cuenta";
        } else if (edadUsuario <= 17) {
            categoria = "Adolescente";
            perfil = "Acceso restringido a foros comunitarios";
        } else if (edadUsuario <= 64) {
            categoria = "Adulto";
            perfil = "Acceso a funcionalidades estandar";
        } else {
            categoria = "Adulto Mayor";
            perfil = "Acceso con interfaz adaptada";
        }

        System.out.println("Edad: " + edadUsuario);
        System.out.println("Categoria: " + categoria);
        System.out.println("Perfil de acceso: " + perfil);
        System.out.println();
    }
}
