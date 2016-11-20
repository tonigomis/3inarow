/**
 * Created by toni on 11/10/16.
 */
public class Ex1 {
    // Crea l'objecte Turtle
    static Turtle t = new Turtle(800, 680);

    // Declara les variables de classe
    static int x = -350, y = 200;
    static int quadre = 100;
    static int angle = 90;
    static int increment = quadre + (quadre / 2);

    // Main
    public static void main(String[] args) {
        // Inicialitza posició
        t.goTo(x, y);

        // Pinta la retícula
        canviaPos(x, y);

        // Crea i mostra tauler
        t.show();
    }

    // Crea quadre
    static void pintaQuadre() {
        for (int i = 0; i < 4; i++) {
            t.forward(quadre);
            t.turnRight(angle);
        }
        // Reubica el punter al lloc d'inici del següent quadre
        t.penDown = false;
        t.turnRight(angle);
        t.forward(increment);
        t.turnLeft(angle);
        t.penDown = true;
    }
    //Crea els quadres necessaris per a cada fila (variable i)
    static void pintaFila() {
        for (int i = 0; i < 5; i++) {
            pintaQuadre();
        }
    }

    static void canviaPos(int x, int y) {
        // Dibuixa les files necessàries (variable i)
        for (int i = 0; i < 4; i++) {
            // Defineix la posició que ha d'ocupar cada filera a l'inici de cada iteració
            y = y - increment;
            pintaFila();
            t.goTo(x, y);
        }
    }
}
