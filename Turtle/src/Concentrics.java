/**
 * Created by toni on 15/10/16.
 */
public class Concentrics {
    static Turtle t = new Turtle(800,800);
    static int numQuadres = 10;
    static int costat = 30;
    static int increment = costat;
    static int angle = 90;
    static int x = 0;
    static int y = 0;
    public static void main(String[] args) {
        creixQuadre();
        t.show();
    }

    static void pintaQuadre(){
        for (int i = 0; i < 4; i++) {
            t.forward(costat);
            t.turnLeft(angle);
        }
    }

    static void creixQuadre() {
        for (int i = 0; i < numQuadres; i++) {
            t.goTo(x,y);
            pintaQuadre();
            costat += increment;
            x += increment/2;
            y -= increment/2;

        }
    }
}
