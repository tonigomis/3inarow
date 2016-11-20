import java.util.Scanner;

/**
 * Created by toni on 09/10/16.
 */
public class Notes {

    static int nota;

    public static void main(String[] args) {
        entrada();
        quinaNota();
    }

    static void entrada() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix la nota obtinguda: ");
        nota = s.nextInt();
    }

    static void quinaNota() {
        if (nota >= 0 && nota <= 10) {
            switch (nota) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Insuficient");
                    break;
                case 5:
                    System.out.println("Suficient");
                    break;
                case 6:
                    System.out.println("Bé");
                    break;
                case 7:
                case 8:
                    System.out.println("Notable");
                    break;
                case 9:
                case 10:
                    System.out.println("Excel·lent");
                    break;
            }
        } else {
            System.out.println("Has d'introduïr una nota vàlida!");
        }
    }
}