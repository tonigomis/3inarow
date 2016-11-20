import java.util.Scanner;

/**
 * Created by toni on 25/10/16.
 */
public class RombeE6 {
    static Scanner s = new Scanner(System.in);
    static int nRombes;
    static int nEspais;
    static int nEstrelles;

    public static void main(String[] args) {
        entrada();
        calculaEspais();
        dibuixaDiagonalSup(nRombes);
        dibuixaDiagonalInf(nRombes);
    }

    static void entrada() {
        try {
            do {
                System.out.println("Introdueix el número (senar) de rombes de la diagonal: ");
                nRombes = s.nextInt();
            } while (nRombes % 2 == 0);
        } catch (Exception e) {
            System.out.println("S'ha produït un error!");
        }
    }

    static void calculaEspais() {
        nEspais = nRombes/2;
        nEstrelles = nRombes / (nEspais * 2);
    }

    static void dibuixaEspais() {
        for (int i = 0; i < nEspais; i++) {
            System.out.print(" ");
        }
    }

    static void dibuixaEstrelles() {
        for (int i = 0; i < nEstrelles; i++) {
            System.out.print("*");
        }
    }

    static void dibuixaEstrella() {
        dibuixaEspais();
        dibuixaEstrelles();
        dibuixaEspais();
    }

    static void dibuixaDiagonalSup(int nRombes) {
        for (int i = 0; i < nRombes/2; i++) {
            dibuixaEstrella();
            nEspais--;
            nEstrelles += 2;
            System.out.println();
        }
    }

    static void dibuixaDiagonalInf(int nRombes) {
        for (int i = 0; i <= nRombes/2+1 ; i++) {
            dibuixaEstrella();
            nEspais++;
            nEstrelles -= 2;
            System.out.println();
        }
    }
}
