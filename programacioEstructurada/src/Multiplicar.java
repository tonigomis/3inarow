import java.util.Scanner;

/**
 * Created by toni on 05/10/16.
 */
public class Multiplicar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix el número del qual vols saber la taula: ");
        int numero = s.nextInt();
        System.out.println("Has demanat conèixer la taula del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }
}
