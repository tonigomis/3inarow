import java.util.Scanner;

/**
 * Created by toni on 26/10/16.
 */
public class NumSortE8 {

    // Declaram les variables de classe
    static Scanner s = new Scanner(System.in);
    static int numero;

    public static void main(String[] args) {
        calcula();
    }

    static void entrada() {
        // Demanam l'entrada d'una data de naixement per teclat amb un format concret
        String cadena; //Aquí guardarem el que ens entri l'usuari a través de l'Scanner.
        System.out.println("Introdueix la teva data de naixement: (Format: DD-MM-AAAA)");
        cadena = s.nextLine();

        //Declaram una array per guardar els diferents elements de la data.
        String[] seccio;

        /* Definim el que contindrà cadascuna de les seccions de l'array (un split de la cadena, en aquest cas,
        determinada pel caràcter "-". */
        seccio = cadena.split("-");

        // Declaram i inicialitzam les variables amb les diferents seccions.
        String seccio1 = seccio[0];
        String seccio2 = seccio[1];
        String seccio3 = seccio[2];

        // Definim i inicialitzam una variable per guardar el resultat.
        String resultat = "";
        resultat += seccio1 + seccio2 + seccio3;

        // Convertim el resultat (String) en un número (int) amb la funció Integer.parseInt();
        numero = Integer.parseInt(resultat);
    }

    static void calcula() {
        // Cridam la funció que ens demanarà l'entrada de text i ens convertirà el text en un número.
        entrada();

        // Declaram les variables auxiliars que utilitzarem per calcular el número de la sort.
        int aux = 0, aux2 = 0;

        // Amb aquest primer bucle sumarem els dígits obtinguts en convertir l'entrada String a una variable int.
        while (numero > 0) {
            aux += numero % 10;
            numero = numero / 10;
        }

        // El segon bucle serveix per simplificar el resultat fins que ens quedi només una xifra: El número de la sort.
        while (aux > 0) {
            aux2 += aux % 10;
            aux = aux / 10;
        }
        System.out.println("El teu número de la sort és " + aux2);
    }
}
