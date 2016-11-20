/**
 * Created by toni on 11/10/16.
 */
public class Ex2 {
    // Crea l'objecte Turtle i declara i inicialitza les variables de classe
    static Turtle t = new Turtle(800, 800);
    static int x = -250;
    static int y = 200;

/*  Inicialitzam les variables per utilitzar el màxim possible de valors relatius, a fi de poder canviar-ho tot
    modificant poc codi */
    static int alt = 100;
    static int ample = alt / 2;
    static int angle = 90;

    public static void main(String[] args) {
        // Col·locam la tortuga en la posició inicial
        posiciona();
        // Feim el trajecte descendent amb un bucle
        baixa();
        // Avançam i col·locam la tortuga per iniciar la pujada
        avanti();
        // Feim la pujada amb un altre bucle
        puja();
        // Mostra el tauler
        t.show();
    }

    static void posiciona() {
        t.goTo(x, y);
        t.turnRight(angle);
    }

    static void baixa() {
        for (int i = 0; i < 4; i++) {
            t.forward(ample);
            t.turnRight(angle);
            t.forward(alt);
            t.turnLeft(angle);
        }
    }

    static void avanti() {
        t.forward(ample * 2);
        t.turnLeft(angle);
    }

    static void puja() {
        for (int i = 0; i < 4; i++) {
            t.forward(alt);
            t.turnRight(angle);
            t.forward(ample);
            t.turnLeft(angle);
        }
    }
}
