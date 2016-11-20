import java.util.Scanner;

/**
 * Created by toni on 25/10/16.
 */
public class InverteixE10 {
    static Scanner s = new Scanner(System.in);
    static String cadena = "";
    static String resultat = "";
    public static void main(String[] args) {
        System.out.println("Introdueix el número que vols invertir: ");
        cadena = s.nextLine();
        inverteix();
    }

    static void inverteix() {
        int llarg = cadena.length();
        for (int i = llarg - 1; i >= 0 ; i--) {
            resultat += cadena.charAt(i);
        }
        System.out.println(resultat);
    }
}
