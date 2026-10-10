package org.example.seccion1;

public class Seccion1Calentamiento {
    public static void main(String[] args) {
        int x = 7;
        boolean flag = false;

        int seg = 86400 % 3600;
        System.out.println("seg = " + seg);

        x = 5;
        int y = ++x + x++;
        System.out.println("y = " + y);
        System.out.println("x despues = " + x);

        double div1 = 15 / 2;
        double div2 = 15.0 / 2;
        System.out.println("div1 = " + div1);
        System.out.println("div2 = " + div2);

        x = 7;
        boolean res = flag && (++x > 0);
        System.out.println("res = " + res);
        System.out.println("x despues = " + x);
    }
}
