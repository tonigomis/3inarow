import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by toni on 10/02/16.
 */
public class QuadratMagic {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Introdueix la dimensió X de l'array: ");
        int dimx = S.nextInt();
        System.out.println("Introdueix la dimensió Y de l'array: ");
        int dimy = S.nextInt();
        System.out.println("Has triat fer un quadre màgic de "+ dimx +" per " + dimy +" caselles");

        int [][]primera = new int[dimx][dimy];

        for (int i = 0; i < primera.length; i++) {
            for (int j = 0; j < primera.length; j++)

        System.out.print(primera[i][j]);
        }

    }


    void imprimeix(int n) {

    }
}
