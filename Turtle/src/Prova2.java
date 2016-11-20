/**
 * Created by toni on 16/10/16.
 */
public class Prova2 {
    static Turtle t = new Turtle(800,800);
    static int radius = 600;
    static int arc = 60;
    static double circumferencia = 2 * Math.PI * radius;
    static double corda = circumferencia / arc;
    static int avanç = (int) corda / arc;

    public static void main(String[] args) {
        multiplicaArcs();
        t.show();
    }

    static void pintaArc() {
        for (int i = 0; i < arc; i++) {
            t.forward(avanç);
            t.turnRight(avanç);
        }
        arc += arc/2;
        t.goTo(0,0);
    }

    static void multiplicaArcs() {
        for (int i = 0; i < 15; i++) {
            pintaArc();
        }
    }
}
