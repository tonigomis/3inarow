/**
 * Created by toni on 16/10/16.
 */
public class Ex8 {
    static Turtle t = new Turtle(800, 800);

    public static void main(String[] args) {
        t.turnRight(30);
        pintaFigura();
        t.show();
    }

    static void pintaTriangle() {
        for (int i = 0; i < 3; i++) {
            t.forward(150);
            t.turnLeft(120);
        }
        t.turnRight(90);
    }

    static void pintaFigura() {
        for (int i = 0; i < 4; i++) {
            pintaTriangle();
        }
    }
}
