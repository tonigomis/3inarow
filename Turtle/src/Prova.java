/**
 * Created by toni on 16/10/16.
 */
public class Prova {
    static Turtle t = new Turtle(800,800);
    static int radi = 600;
    static int arc = 12;
    static int posX = 0;
    static int posY = 0;
    static double corda = (2 * Math.PI * radi * arc)/360;
    static double avanç = corda/arc;
    static int head = (int) avanç;

    public static void main(String[] args) {
        //multi();
        curva();
        t.show();
    }

    static void curva() {
        for (int i = 0; i < arc; i++) {

            t.forward(head);
            t.turnRight(head);
        }
        t.goTo(posX,posY);
    }

    static void multi() {
        for (int i = 0; i < arc; i++) {
            curva();
        }
        //invers();
    }

/*    static void invers() {
        for (int i = 0; i < arc; i++) {
            t.forward(-head);
            t.turnRight(-head);
        }
    }*/
}
