import java.util.Scanner;

/**
 * Created by toni on 19/10/16.
 */
public class VocalsE1 {
    // Declaram la variable global "paraula" per contenir l'entrada de teclat.
    static String paraula = "";

    public static void main(String[] args) {
        // Cridam el mètode d'entrada de la cadena a avaluar.
        entrada();
        // Executam l'avaluació i el recompte de vocals en la cadena introduïda.
        comptaVocals();
    }

    static void entrada() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix una paraula: ");
        paraula = s.nextLine();
    }

    static void comptaVocals() {
        // Declaram una variable per a fer-la servir de comptador.
        int cont = 0;
        /* Mitjançant un bucle for recorrem tots els caràcters de la cadena d'entrada i incrementam el comptador cada
        * vegada que es compleixi la condició de l'if. Hem considerat tots els caràcters possibles en el nostre
        * llenguatge que haurien de donar un resultat positiu en aquest mètode. */
        for (int i = 0; i < paraula.length(); i++) {
            if ((paraula.charAt(i) == 'a') || (paraula.charAt(i) == 'ä') || (paraula.charAt(i) == 'à') ||
                    (paraula.charAt(i) == 'á') || (paraula.charAt(i) == 'A') || (paraula.charAt(i) == 'À') ||
                    (paraula.charAt(i) == 'Á') || (paraula.charAt(i) == 'Ä') || (paraula.charAt(i) == 'e') ||
                    (paraula.charAt(i) == 'é') || (paraula.charAt(i) == 'è') || (paraula.charAt(i) == 'ë') ||
                    (paraula.charAt(i) == 'E') || (paraula.charAt(i) == 'Ë') || (paraula.charAt(i) == 'È') ||
                    (paraula.charAt(i) == 'É') || (paraula.charAt(i) == 'i') || (paraula.charAt(i) == 'í') ||
                    (paraula.charAt(i) == 'ï') || (paraula.charAt(i) == 'I') || (paraula.charAt(i) == 'Ï') ||
                    (paraula.charAt(i) == 'o') || (paraula.charAt(i) == 'ó') || (paraula.charAt(i) == 'ö') ||
                    (paraula.charAt(i) == 'ò') || (paraula.charAt(i) == 'Ò') || (paraula.charAt(i) == 'Ó') ||
                    (paraula.charAt(i) == 'O') || (paraula.charAt(i) == 'Ö') || (paraula.charAt(i) == 'u') ||
                    (paraula.charAt(i) == 'ú') || (paraula.charAt(i) == 'ü') || (paraula.charAt(i) == 'U') ||
                    (paraula.charAt(i) == 'Ú') || (paraula.charAt(i) == 'Ü')) {
                cont++;
            }
        }
        /* Imprimim el resultat una vegada conclosa l'avaluació fent servir les dades emmagatzemades en l'entrada i en
        la variable comptador. */
        System.out.println("La paraula " + paraula + " té " + cont + " vocals.");
    }
}
