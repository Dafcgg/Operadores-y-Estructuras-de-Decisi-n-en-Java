package org.example.seccion4;

import java.util.Locale;

public class Seccion4RetoIntegrador {
    public static void main(String[] args) {
        System.out.println("Caso de prueba A");
        calcularTotal(3, "VIP", "PROMO1 año");
        System.out.println();
        System.out.println("Caso de prueba B");
        calcularTotal(1, "NUEVO", "PROMO1 año");
    }

    public static void calcularTotal(int cantidad, String tipoCliente, String cupon) {
        double subtotalBase = cantidad * 250.00;
        double porcentajeDescuento;

        switch (tipoCliente) {
            case "VIP":
                porcentajeDescuento = 0.20;
                break;
            case "REGULAR":
                porcentajeDescuento = 0.10;
                break;
            case "NUEVO":
                porcentajeDescuento = 0.05;
                break;
            default:
                porcentajeDescuento = 0.0;
                break;
        }

        double descuentoCliente = subtotalBase * porcentajeDescuento;
        double subtotalConDescuento = subtotalBase - descuentoCliente;

        double descuentoCupon;
        if (cupon.equals("PROMO1 año") && subtotalConDescuento >= 500.00) {
            descuentoCupon = 50.00;
        } else {
            descuentoCupon = 0.00;
        }

        double baseImponible = subtotalConDescuento - descuentoCupon;
        double iva = baseImponible * 0.16;
        double totalFinal = baseImponible + iva;

        System.out.printf(Locale.US, "Subtotal base: $%.2f%n", subtotalBase);
        System.out.printf(Locale.US, "Descuento cliente: -$%.2f%n", descuentoCliente);
        System.out.printf(Locale.US, "Subtotal con descuento: $%.2f%n", subtotalConDescuento);
        System.out.printf(Locale.US, "Descuento cupon: -$%.2f%n", descuentoCupon);
        System.out.printf(Locale.US, "Base imponible: $%.2f%n", baseImponible);
        System.out.printf(Locale.US, "IVA 16%%: $%.2f%n", iva);
        System.out.printf(Locale.US, "Total a pagar = $%.2f%n", totalFinal);
    }
}
