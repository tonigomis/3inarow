import java.util.Scanner;

/**
 * Created by toni on 20/11/16.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int entrada = -1;
        while (entrada < 0) {
            System.out.println("Escriu un número enter positiu: ");
            entrada = s.nextInt();
        }
        posOrNeg(entrada);
    }

    static void posOrNeg(int entrada) {
        if (entrada == 0) {
            System.out.println("El número introduït és zero");
        } else {
            System.out.println(entrada % 2 == 0 ? "El número és parell" : "El número és imparell");
        }
    }
}
