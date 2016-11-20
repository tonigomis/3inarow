import java.util.Scanner;

/**
 * Created by toni on 01/11/16.
 */
public class Prova2E7 {
    static Scanner s = new Scanner(System.in);
    static int nEspaisInt = 0;
    static int nEspaisExt;
    static int diagonal, aux;


    public static void main(String[] args) {
        System.out.println("Introdueix la diagonal del rombe: ");
        diagonal = s.nextInt();
        nEspaisExt = diagonal / 2;
        aux = nEspaisExt;
        pintaCap();
        pintaRombe();
        nEspaisExt = diagonal / 2;
        nEspaisInt = 0;
        pintaCap();
    }

    static void pintaEspai() {
        System.out.print(" ");
    }

    static void pintaEstrella() {
        System.out.print("*");
    }

    static void pintaCap() {
        for (int i = 0; i < diagonal - 1; i++) {
            pintaEspai();
            if (i == nEspaisExt - 1) {
                pintaEstrella();
            }
        }
        System.out.println();
        nEspaisExt--;
        nEspaisInt++;
    }

    static void pintaLinia() {
        for (int i = 0; i < diagonal; i++) {
            if (i < nEspaisExt) {
                pintaEspai();
            } else if ((i == nEspaisExt) || i == nEspaisExt+nEspaisInt+1){
                pintaEstrella();
            } else if (i > nEspaisExt) {
                pintaEspai();
            }
        }
        System.out.println();
    }

    static void pintaRombe() {
        for (int i = 0; i < diagonal/2; i++) {
            pintaLinia();
            nEspaisExt--;
            nEspaisInt+=2;
            if (nEspaisExt == 0) {
                for (int j = 0; j < (diagonal/2)-1; j++) {
                    pintaLinia();
                    nEspaisInt-=2;
                    nEspaisExt++;
                }
            }
        }
    }
}
