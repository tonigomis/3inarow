import java.util.Scanner;

/**
 * Created by toni on 26/10/16.
 */
public class RombeBuitE7 {

    // Declaram les variables necessàries i cream un objecte Scanner per capturar l'entrada de l'usuari
    static Scanner s = new Scanner(System.in);
    static int nEspaisInt;
    static int nEspaisExt;
    static int diagonal;

    // Executam les dues funcions principals d'aquest programa: l'entrada de dades i el dibuix de la figura
    public static void main(String[] args) {
        entrada();
        pintaRombe();
    }

    // Amb aquest mètode cream un menú d'entrada de dades, definim un rang vàlid de valors i informam si hi ha un error
    static void entrada() {
        try {
            do {
                System.out.println("Introdueix el número (senar) de rombes de la diagonal: ");
                diagonal = s.nextInt();
            } while (diagonal % 2 == 0 || diagonal < 0);
        } catch (Exception e) {
            System.out.println("S'ha produït un error!");
        }
        // Definim el valor dels espais exteriors amb la part entera de la meitat de la diagonal
        nEspaisExt = diagonal / 2;
    }

    // Aquest mètode dibuixa un espai sense salt de línia
    static void pintaEspai() {
        System.out.print(" ");
    }

    // Aquest mètode dibuixa un asterisc sense salt de línia
    static void pintaEstrella() {
        System.out.print("*");
    }

    // Amb aquest mètode pintam un asterisc centrat en relació a la diagonal donada, amb espais a banda i banda
    static void pintaCap() {
        for (int i = 0; i < diagonal - 1; i++) {
            pintaEspai();
            if (i == nEspaisExt - 1) {
                pintaEstrella();
            }
        }
        // Amb el salt de línia i els decrement/increment inicials de les variables deixam a punt la següent funció
        System.out.println();
        nEspaisExt--;
        nEspaisInt++;
    }

    // Aquest mètode dibuixa espais o estrelles segons el valor de les dues variables que feim servir per controlar els espais
    static void pintaLinia() {
        for (int i = 0; i < diagonal; i++) {
            if (i < nEspaisExt) {
                pintaEspai();
            } else if ((i == nEspaisExt) || i == nEspaisExt + nEspaisInt + 1) {
                pintaEstrella();
            } else if (i > nEspaisExt) {
                pintaEspai();
            }
        }
        System.out.println();
    }

    // Amb aquesta funció principal feim el dibuix complet, incloses les excepcions
    static void pintaRombe() {
        // Pintam la primera estrella
        pintaCap();

        // Amb aquest bucle feim la resta de les línies d'estrelles, fins a aconseguir la figura desitjada
        for (int i = 0; i < diagonal / 2; i++) {
            pintaLinia();
            nEspaisExt--;
            nEspaisInt += 2;

            // Quan arribam al punt mig del rombe, canviam el bucle per invertir els increments de les variables.
            if (nEspaisExt == 0) {
                for (int j = 0; j < (diagonal / 2); j++) {
                    pintaLinia();
                    nEspaisInt -= 2;
                    nEspaisExt++;
                }
            }
        }

        // Reset de valors per pintar la darrera estrella i consideració d'excepcions a l'algoritme
        nEspaisExt = diagonal / 2;
        nEspaisInt = 0;
        if (diagonal == 1) System.out.println("*");
        if (diagonal == 3) {
            pintaCap();
        }
    }
}