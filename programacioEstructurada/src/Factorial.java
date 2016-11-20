/**
 * Created by toni on 06/10/16.
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix el valor del qual vols el factorial:\n");
        long m = 1;
        long n = s.nextLong();
        long intro = n;
        if (n < 0) {
            System.out.println("No és possible");
            return;
        }
        if (n == 0 || n == 1) {
            System.out.println("El resultat és 1");
            return;
        }
        while (n >= 2) {
            m = m * n;
            n = n - 1;
        }
        System.out.println("El factorial de " + intro + " és " + m);
    }
}

/* PERE NEGRE'S WAY */
class FactorialPere {
    public static void main(String[] args) {
        System.out.println("Dona'm un número: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int resultat = factorial(n);
        System.out.println("El factorial de " + n + " és " + resultat);
    }

    static int factorial(int numero) {
        if (numero==1) {
            return numero;
        }
        return numero * factorial(numero-1);
    }
}