import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by toni on 25/09/16.
 */
public class Polinomi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix el grau del polinomi: ");
        int grau = s.nextInt();
        int llistaNova [] = new int[grau];
        String llista = "";
        for (int i = llistaNova.length-1; i > 0; i--) {
            llistaNova[i] = i;
        }
        System.out.println(Arrays.toString(llistaNova));


        //System.out.println("Introdueix el polinomi (Format: 3x³-4x²+3x+6)");
        //String entrada = s.nextLine();
    }
}
