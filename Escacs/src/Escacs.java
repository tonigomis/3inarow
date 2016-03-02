import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by toni on 21/12/15.
 */
public class Escacs {
    public static void main(String[] args) {
        char[][] taulell = new char[8][8];
        inicialitzaTaulell(taulell);
        mostraTaulell(taulell);
        ferMoviment(taulell);
        //transformarPosicio();
    }

    static void mostraTaulell(char[][] t) {
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                char c = t[i][j];
                if (c != 0) {
                    System.out.print(c + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    static void inicialitzaTaulell(char[][] t) {
        t[0][0] = t[7][0] = 'R';
        t[1][0] = t[6][0] = 'N';
        t[2][0] = t[5][0] = 'B';
        t[3][0] = 'Q';
        t[4][0] = 'K';
        for (int i = 0; i < 8; i++) t[i][1] = 'P';

        t[0][7] = t[7][7] = 'r';
        t[1][7] = t[6][7] = 'n';
        t[2][7] = t[5][7] = 'b';
        t[3][7] = 'q';
        t[4][7] = 'k';
        for (int i = 0; i < 8; i++) t[i][6] = 'p';
    }

    static void ferMoviment(char[][] t) {
        Scanner S = new Scanner(System.in);
        System.out.print("Moviment blanques: ");
        String tk1 = S.next();
        String tk2 = S.next();
        System.out.printf("Has intentat moure de %s => %s", tk1, tk2);
    }
    public static void transformarPosicio(String token){

        System.out.println();

    }
}
