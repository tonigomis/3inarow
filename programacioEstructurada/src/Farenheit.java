import java.util.Scanner;

/**
 * Created by toni on 04/10/16.
 */
public class Farenheit {
    static Scanner s = new Scanner(System.in);
    static int opt = -1;
    static double entrada, F, C;

    public static void main(String[] args) {

        while (opt != 0) {
            try {
                System.out.println("Tria la teva opció: \n1.- De Celsius a Fahrenheit." +
                        "\n2.- De Fahrenheit a Celsius" +
                        "\n0.- Sortir");

                opt = s.nextInt();

                switch (opt) {
                    case 1:
                        entrada();
                        celsius();
                        break;
                    case 2:
                        entrada();
                        fahrenheit();
                        break;
                    case 0:
                        System.out.println("Adéu!");
                        break;
                    default:
                        System.out.println("Opció no vàlida!");
                        System.out.println("\n");
                }

            } catch (Exception e) {
                System.out.println("Hi ha hagut un error");
                System.out.println("\n");
            }
        }
    }

    static void entrada() {
        System.out.println("Introdueix el valor a convertir: ");
        entrada = s.nextDouble();
    }

    static void celsius() {
        F = (entrada * 1.8) + 32;
        System.out.println("La temperatura " + entrada + " ºC introduïda equival a " + F + " Fahrenheit.\n");
    }

    static void fahrenheit() {
        C = ((entrada - 32) / 1.8);
        System.out.println("La temperatura " + entrada + " ºF introduïda equival a " + C + " º Celsius.\n");
    }
}
