/**
 * Created by toni on 15/10/16.
 */
public class Ex6 {
    static Turtle t = new Turtle(800,800);

    public static void main(String[] args) {
        int costat = 60;
        int nCostats = 8;
        int angle = 45;
        int nVoltes = 8;
        int increment = costat/3;
        int posX = -100;
        int posY = 0;

        t.goTo(posX, posY);

        volta(nVoltes,costat, angle, nCostats, increment);

        t.show();
    }

    static void dibuixaFigura(int costat, int angle, int nCostats) {
        for (int i = 0; i < (nCostats/2) -1; i++) {
            t.forward(costat);
            t.turnRight(angle);
        }
    }

    static void volta(int nVoltes, int costat, int angle, int nCostats, int increment) {
        for (int i = 0; i < nVoltes; i++) {

            dibuixaFigura(costat, angle, nCostats);
            costat += increment;
        }
    }
}
