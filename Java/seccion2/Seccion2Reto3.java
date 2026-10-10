package org.example.seccion2;

public class Seccion2Reto3 {
    public static void main(String[] args) {
        calcularPrecio("VIP");
        calcularPrecio("ESTUDIANTE");
        calcularPrecio("ADULTO_MAYOR");
        calcularPrecio("GENERAL");
    }

    public static void calcularPrecio(String tipoEntrada) {
        double precioBase = 100.0;
        double precioFinal;

        if (tipoEntrada.equals("VIP")) {
            precioFinal = precioBase + precioBase * 0.10;
        } else if (tipoEntrada.equals("ESTUDIANTE")) {
            precioFinal = precioBase - precioBase * 0.50;
        } else if (tipoEntrada.equals("ADULTO_MAYOR")) {
            precioFinal = precioBase - precioBase * 0.40;
        } else {
            precioFinal = precioBase;
        }

        System.out.println("Tipo de entrada: " + tipoEntrada);
        System.out.println("Monto final a pagar: $" + precioFinal);
        System.out.println();
    }
}
