/**
 * Created by toni on 21/09/16.
 */

import java.util.Scanner;

public class Euclides {
    public static void main(String[] args) {
        int t, a, b, registre1, registre2;
        Scanner s = new Scanner(System.in);
        System.out.println("Insereix el primer número: ");
        registre1 = s.nextInt();
        a = registre1;
        System.out.println("Insereix el segon número: ");
        registre2 = s.nextInt();
        b = registre2;

        if (a < b) {
            t = a;
            a = b;
            b = t;
        }

        if (a == 0 || b == 0) {
            System.out.println("Prova amb altres números");
        }

        while (a > b && b != 0 && a != 0){
            t = a % b;
            a = b;
            b = t;
        }
        System.out.println("El M.C.D de "+registre1+" i "+registre2+" és " +a+".");
    }
}
