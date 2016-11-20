/**
 * Created by toni on 17/10/16.
 */
public class Ex9 {

    static Turtle t = new Turtle(800,800);
    static int nTriangles = 9;
    static int costat = 176;
    public static void main(String[] args) {
        t.turnRight(200);
        pintaFigura();
        t.show();

    }

    static void pintaTriangle() {
        t.forward(costat);
        t.turnLeft(110);
        t.forward(120);
        t.turnLeft(110);
        t.forward(costat);

    }

    static void pintaFigura() {
        for (int i = 0; i < nTriangles; i++) {
            t.turnRight(20);
            pintaTriangle();

        }
    }
}
