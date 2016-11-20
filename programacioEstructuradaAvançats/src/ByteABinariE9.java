import java.util.Scanner;

/**
 * Created by toni on 02/11/16.
 */
public class ByteABinariE9 {
    static Scanner s = new Scanner(System.in);
    static int numero, digit, input;
    static int exponent = 0;
    static double binari = 0;

    public static void main(String[] args) {
        entrada();
        opera();
    }

    static void entrada() {
        try {
            do {
                System.out.println("Introdueix un número enter major o igual a zero: ");
                numero = s.nextInt();
                input = numero;
            } while (numero < 0);
        } catch (Exception e) {
            System.out.println("Has d'introduïr un número enter!");
        }
    }

    static void opera() {
        while (numero !=0) {
            digit = numero % 2;
            binari += digit * Math.pow(10,exponent);
            exponent++;
            numero = numero / 2;
        }
        System.out.printf("El número " + input + " és %08.0f en binari.", binari);
    }
}
