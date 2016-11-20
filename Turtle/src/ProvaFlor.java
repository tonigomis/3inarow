import java.util.Scanner;

/**
 * Created by toni on 18/10/16.
 */
public class ProvaFlor {
    static Turtle t = new Turtle(800,800);
    static int posX = 0;
    static int posY = 0;
    static Scanner s = new Scanner(System.in);
    static int nPetals;
    static double angle;
    static double angleIteracio;

    public static void main(String[] args) {
        System.out.println("Introdueix el número de pètals: ");
        nPetals = s.nextInt();
        angle = 360d/nPetals;
        angleIteracio = angle/4d;
        t.goTo(0,0);
        pintaFlor();
        t.show();
    }

    static void petalDret() {
        t.turnRight((int)angle);
        t.forward(30);
        for (int i = 0; i < 8; i++) {
            t.turnLeft((int)angleIteracio);
            t.forward(30);
        }
        t.goTo(posX,posY);
    }

    static void petalEsq() {
        t.forward(30);
        for (int i = 0; i < 8; i++) {
            t.turnRight((int) angleIteracio);
            t.forward(30);
        }
        t.goTo(posX,posY);

    }

    static void pintaFlor() {
        for (int i = 0; i < nPetals; i++) {
            petalEsq();
            petalDret();
        }
    }


}
