/**
 * Created by toni on 16/10/16.
 */
public class Espiral {

    // Declaram el tamany del canvas
    static int canvas = 800;
    // Cream l'onjecte Turtle amb la mida determinada per la variable anterior
    static Turtle t = new Turtle(canvas,canvas);

    // Declaram les variables necessàries per dibuixar la figura
    static int angle = 45;
    static int costat = 60;
    static int increment = costat/3;
    static int nCostats = 8;
    static int nVoltes = 8;
    static int posX = -100;
    static int posY = 0;

    public static void main(String[] args) {
        t.goTo(posX, posY);

        volta();

        t.show();
    }

    static void figura() {
        for (int i = 0; i < (nCostats/2) -1; i++) {
            t.forward(costat);
            t.turnRight(angle);
        }
        costat += increment;
    }

    static void volta() {
        for (int i = 0; i < nVoltes; i++) {
            figura();
        }
    }

}
