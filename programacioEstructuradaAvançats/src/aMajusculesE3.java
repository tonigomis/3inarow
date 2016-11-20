import java.util.Scanner;

/**
 * Created by toni on 20/10/16.
 */
public class aMajusculesE3 {
    static Scanner s = new Scanner(System.in);
    static String frase = "";
    static char punter;
    static String solucio = "";

    public static void main(String[] args) {
        entrada();
        aMajuscules();
    }

    static void entrada() {
        System.out.println("Introdueix la frase que vols passar a majúscules: ");
        frase = s.nextLine();
    }

    static void aMajuscules() {
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= 65 && frase.charAt(i) <= 90 || frase.charAt(i) == 32) {
                punter = frase.charAt(i);
            } else if (frase.charAt(i) >= 97 && frase.charAt(i) <= 122) {
                punter = (char) (frase.charAt(i) - 32);
            } else {
                punter = frase.charAt(i);
            }
            solucio += punter;
        }
        System.out.println(solucio);
    }
}
