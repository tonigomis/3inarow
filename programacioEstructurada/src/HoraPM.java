import java.util.Scanner;

/**
 * Created by toni on 06/10/16.
 */
public class HoraPM {

    static String hora, hores, minuts;
    static int horanum, minutnum;

    public static void main(String[] args) {
        try {
            entrada();
            divideix();
            horaValida();
        } catch (Exception e) {
            System.out.println("S'ha produït un error!");
        }
    }

    static void entrada() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix una hora en format 24H (HH:MM): ");
        hora = s.nextLine();
    }

    static void divideix() {
        String[] parts = hora.split(":");
        hores = parts[0];
        horanum = Integer.parseInt(hores);
        minuts = parts[1];
        minutnum = Integer.parseInt(minuts);

     }

    static void horaValida() {
        if (horanum >= 0 && horanum <= 23 && minutnum >= 0 && minutnum <= 59) {
            if (horanum >= 13) {
                horanum = horanum - 12;
                System.out.println(horanum + ":" + minuts + " PM");
            } else if (horanum == 12) {
                System.out.println(horanum + ":" + minuts + " PM");
            } else {
                System.out.println(horanum + ":" + minuts + " AM");
            }
        } else {
            System.out.println("Hora no vàlida!");
        }
    }
}