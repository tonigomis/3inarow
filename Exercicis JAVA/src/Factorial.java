/**
 * Created by toni on 21/09/16.
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