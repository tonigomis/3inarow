/**
 * Created by toni on 05/10/16.
 */
import java.util.Scanner;
import java.lang.Math;

public class Quadratica {

    /* -b +- \/--- b² - 4.a.c
    ---------------------
             2.a */
    static double a, b, c, discr;

    public static void main(String[] args) {
        entrada();
        calcula();
    }

    static void entrada () {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix el cocient de x²: ");
        a = s.nextDouble();
        System.out.println("Introdueix el cocient de x: ");
        b = s.nextDouble();
        System.out.println("Introdueix el cocient del terme independent: ");
        c = s.nextDouble();
    }

    static void calcula() {
        discr = (Math.pow(b,2)-(4*a*c));
        if (discr < 0) {
            System.out.println("No hi ha solució!");
            return;
        }
        if (discr == 0) {
            System.out.println("Hi ha una solució: " + (-b/(2*a)));
            return;
        }
        double x1= (-b + Math.sqrt(discr))/(2*a);
        double x2= (-b - Math.sqrt(discr))/(2*a);
        System.out.println("El resultat és " + x1 + " o " + x2);
    }
}
