/**
 * Created by toni on 16/10/16.
 */
public class Prova3 {
    static Turtle t = new Turtle(800,800);
    static int altura = 260;
    static int posX = 0;
    static int posY = -200;
    static int nPetals = 15;

    // Això és una prova

/*    static double radi = 600;
    static double arc = 60;
    static double corda = (2 * Math.PI * radi * arc)/360;
    static double avanç = corda/arc;
    static int head = (int) avanç;*/

    public static void main(String[] args) {
        t.goTo(posX,posY);
        dibuixa();
        //curva();
        petalEsq();
        t.show();
    }

    static void petalEsq() {
        t.turnRight(24);
        t.forward(30);
        for (int i = 0; i < 8; i++) {
            t.turnLeft(6);
            t.forward(30);
        }
        t.goTo(posX,posY);
    }

    static void dibuixa() {
        for (int i = 0; i < nPetals * 2; i++) {
            t.forward(altura);
            t.turnRight(180);
            if (i % 2 == 0) {
                t.turnRight(24);
            }
        }
    }

/*    static int curva() {
        for (int i = 0; i < nPetals * 2; i++) {

            t.forward(head);
            t.turnLeft(head);
        }

        return 0;
    }*/
}
