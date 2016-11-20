/**
 * Created by toni on 16/10/16.
 */
public class Ex7 {
    static int canvas = 800;
    static Turtle t = new Turtle(canvas, canvas);
    static int posX = 0;
    static int posY = 0;
    static int salt = 10;
    static int angleInici = 0;
    static int tangent = 100;

    public static void main(String[] args) {

        t.goTo(posX,posY);
        pintaFulla();
        t.show();
    }

    static void pintaFulla() {
        for (int i = 0; i < tangent; i++) {
            t.forward(salt);
            for (int j = 0; j < tangent/2; j++) {
                t.goTo(posX, posY);
                posX--;
                posY++;
                t.turnRight(salt);
            }
        }
    }

    static void curva() {

    }
}
