/**
 * Created by toni on 06/10/16.
 */

import java.util.Scanner;

public class EuclidesFull {

    static int opt = -1;
    static int a, b, t;
    static int registre1, registre2, resultatMcd, resultatMcm;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        while (opt != 0) {
            try {
                System.out.println("Tria una opció: \n1. Calcular el MCD." +
                        "\n2. Calcular el mcm." +
                        "\n0. Sortir.");
                opt = s.nextInt();

                switch (opt) {
                    case 1:
                        entrada();
                        if (!check()) {
                            System.out.println("Introdueix números vàlids!\n");
                            break;
                        }
                        mcd();
                        System.out.println("El M.C.D de " + registre1 + " i " + registre2 + " és " + resultatMcd + ".");
                        System.out.println("\n");
                        break;

                    case 2:
                        entrada();
                        if (!check()) {
                            System.out.println("Introdueix números vàlids!\n");
                            break;
                        }
                        mcm();
                        System.out.println("El m.c.m. de " + registre1 + " i " + registre2 + " és " + resultatMcm + ".");
                        System.out.println("\n");
                        break;

                    case 0:
                        System.out.println("Adéu!");
                        break;

                    default:
                        System.out.println("\nOpció no vàlida!");
                        System.out.println("\n");
                }

            } catch (Exception e) {
                System.out.println("Hi ha hagut un error.");
                System.out.println("\n");
            }
        }
    }

    static void entrada() {
        System.out.println("Introdueix el primer número: ");
        a = s.nextInt();
        registre1 = a;
        System.out.println("Introdueix el segon número: ");
        b = s.nextInt();
        registre2 = b;
        System.out.println("\n");

        if (a < b) {
            t = a;
            a = b;
            b = t;
        }
    }

    static void mcd() {
        while (a > b && b != 0 && a != 0) {
            t = a % b;
            a = b;
            b = t;
        }
        resultatMcd = a;
    }

    static void mcm() {
        mcd();
        resultatMcm = (registre1 * registre2) / resultatMcd;
    }

    static boolean check() {
        return (registre1 != 0 && registre2 != 0);
    }
}