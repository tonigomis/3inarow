/**
 * Created by toni on 12/10/16.
 */
public class Ex3 {
    // Cream objecte Turtle, declaram i inicialitzam les variables de classe que farem servir al programa
    static Turtle t = new Turtle(800, 800);

    // Determinam la mida del costat, per poder-la canviar fàcilment
    static int costat = 100;

    // Definim el tamany de la retícula
    static int vertical = 7;
    static int horitzontal = 4;

    // Establim l'angle sobre el que treballarem en els girs
    static int angle = 90;

    // Declaram la posició inicial de la retícula sobre el tauler
    static int posX = -200;
    static int posY = 350;

    public static void main(String[] args) {
        // Enviam la tortuga a la posició d'inici
        t.goTo(posX, posY);

        // Dibuixam la primera filera de quadres
        xRow();

        // Posicionam per a la següent, i executam un bucle que ens dibuixi el nº de fileres cridant la funció anterior
        yRow();

        // Mostram el canvas
        t.show();
    }

    static void xRow() {
        t.turnRight(angle);
        for (int j = 0; j < horitzontal; j++) {
            for (int i = 0; i < 4; i++) {
                t.forward(costat);
                t.turnRight(angle);
            }
            t.penDown = false;
            t.forward(costat);
            t.penDown = true;
        }
    }

    static void yRow() {
        for (int i = 0; i < vertical; i++) {
            t.goTo(posX, posY);
            t.turnLeft(angle);
            xRow();
            posY -= costat;
        }
    }
}