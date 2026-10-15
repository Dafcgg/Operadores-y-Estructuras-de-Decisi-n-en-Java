package com.educacion.ahorcado;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static String[] palabras = {"JAVA", "VARIABLE", "COMPILADOR", "ARREGLO", "OPERADOR", "CONSOLA", "BUCLE", "CLASE", "OBJETO", "METODO"};

    static int partidasJugadas = 0;
    static int partidasGanadas = 0;
    static int aciertosTotales = 0;
    static int intentosTotales = 0;
    static double puntajeAcumulado = 0;

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println();
            System.out.println("===== AHORCADO DE CONSOLA =====");
            System.out.println("1. Jugar");
            System.out.println("2. Ver Estadísticas");
            System.out.println("3. Salir");
            opcion = leerEntero("Elige una opción: ");

            switch (opcion) {
                case 1:
                    jugar();
                    break;
                case 2:
                    mostrarEstadisticas();
                    break;
                case 3:
                    System.out.println("Gracias por jugar. Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción no válida. Elige 1, 2 o 3.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    static int leerEntero(String mensaje) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();
            try {
                numero = Integer.parseInt(entrada.trim());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Escribe un número entero.");
            }
        }

        return numero;
    }

    static String leerNombre() {
        String nombre = "";

        while (true) {
            System.out.print("Ingresa tu nombre: ");
            nombre = scanner.nextLine().trim().toUpperCase();

            if (nombre.length() > 0) {
                break;
            }
            System.out.println("El nombre no puede estar vacío.");
        }

        return nombre;
    }

    static void jugar() {
        final int MAX_INTENTOS = 6;
        int intentosRestantes = MAX_INTENTOS;
        double puntaje = 0;
        boolean juegoGanado = false;
        char ultimaLetra = ' ';
        String nombreJugador = leerNombre();

        String palabraSecreta = palabras[random.nextInt(palabras.length)];

        StringBuilder mascara = new StringBuilder();
        for (int i = 0; i < palabraSecreta.length(); i++) {
            mascara.append("_ ");
        }

        StringBuilder letrasUsadas = new StringBuilder();
        int aciertos = 0;
        int fallos = 0;

        System.out.println();
        System.out.println("Bienvenido, " + nombreJugador + ". Adivina la palabra secreta.");

        while (intentosRestantes > 0 && !juegoGanado) {
            System.out.println();
            System.out.println("Palabra: " + mascara);
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.println("Letras usadas: " + (letrasUsadas.length() == 0 ? "ninguna" : letrasUsadas));
            System.out.print("Escribe una letra (o la palabra completa): ");
            String entrada = scanner.nextLine().trim();

            if (entrada.length() == 0) {
                System.out.println("No escribiste nada.");
                continue;
            }

            if (entrada.length() > 1) {
                if (entrada.equalsIgnoreCase(palabraSecreta)) {
                    mascara = new StringBuilder();
                    for (int i = 0; i < palabraSecreta.length(); i++) {
                        mascara.append(palabraSecreta.charAt(i)).append(" ");
                    }
                    aciertos++;
                    juegoGanado = true;
                    break;
                } else {
                    intentosRestantes--;
                    fallos++;
                    System.out.println("Esa no es la palabra.");
                    continue;
                }
            }

            ultimaLetra = Character.toUpperCase(entrada.charAt(0));

            if (!Character.isLetter(ultimaLetra)) {
                System.out.println("Solo se permiten letras.");
                continue;
            }

            if (letrasUsadas.indexOf(String.valueOf(ultimaLetra)) >= 0) {
                System.out.println("Ya usaste la letra " + ultimaLetra + ".");
                continue;
            }

            letrasUsadas.append(ultimaLetra).append(" ");

            boolean encontrada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == ultimaLetra) {
                    mascara.setCharAt(i * 2, ultimaLetra);
                    encontrada = true;
                }
            }

            System.out.println(encontrada ? "¡Bien! La letra " + ultimaLetra + " está en la palabra." : "¡Fallaste! La letra " + ultimaLetra + " no está.");

            if (encontrada) {
                aciertos++;
            } else {
                intentosRestantes--;
                fallos++;
            }

            if (mascara.indexOf("_") < 0) {
                juegoGanado = true;
            }
        }

        puntaje = aciertos * 10;
        if (juegoGanado) {
            puntaje = puntaje + intentosRestantes * 5;
        }

        int totalJugadas = aciertos + fallos;
        double porcentajeAciertos = 0;
        if (totalJugadas > 0) {
            porcentajeAciertos = (double) aciertos / totalJugadas * 100;
        }

        partidasJugadas++;
        if (juegoGanado) {
            partidasGanadas++;
        }
        aciertosTotales += aciertos;
        intentosTotales += totalJugadas;
        puntajeAcumulado += puntaje;

        System.out.printf("\n===== REPORTE FINAL =====\n");
        System.out.printf("Jugador: %s\n", nombreJugador);
        System.out.printf("Palabra secreta: %s\n", palabraSecreta);
        System.out.printf("Resultado: %s\n", juegoGanado ? "GANASTE" : "PERDISTE");
        System.out.printf("Aciertos: %d\n", aciertos);
        System.out.printf("Fallos: %d\n", fallos);
        System.out.printf("Intentos restantes: %d\n", intentosRestantes);
        System.out.printf("Porcentaje de aciertos: %.2f%s\n", porcentajeAciertos, "%");
        System.out.printf("Puntaje: %.2f\n", puntaje);
    }

    static void mostrarEstadisticas() {
        System.out.println();
        System.out.println("===== ESTADÍSTICAS =====");

        if (partidasJugadas == 0) {
            System.out.println("Aún no has jugado ninguna partida.");
            return;
        }

        double porcentajeGlobal = (double) aciertosTotales / intentosTotales * 100;
        double porcentajeVictorias = (double) partidasGanadas / partidasJugadas * 100;

        System.out.printf("Partidas jugadas: %d\n", partidasJugadas);
        System.out.printf("Partidas ganadas: %d\n", partidasGanadas);
        System.out.printf("Porcentaje de victorias: %.2f%s\n", porcentajeVictorias, "%");
        System.out.printf("Porcentaje global de aciertos: %.2f%s\n", porcentajeGlobal, "%");
        System.out.printf("Puntaje acumulado: %.2f\n", puntajeAcumulado);
    }
}
