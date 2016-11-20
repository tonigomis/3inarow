/**
 * Created by toni on 17/10/16.
 */


// NO CONCLÒS AMB ÈXIT
public class Ex10 {
    static Turtle t = new Turtle(800,800);
    static int costat = 300;
    static int radi = 90;
    static double circumferencia = 2 * Math.PI * radi;
    static int angle = 360;
    static double avanç = circumferencia/angle;

    public static void main(String[] args) {
        t.goTo(-50, 0);
        pintaRecta();
        dibuixaCircumferencia();
        t.show();
    }

    static void pintaRecta() {
        t.forward(costat);
        t.turnRight(180);
        t.penDown = false;
        t.forward(costat/2);
        t.turnRight(90);
        t.penDown = true;
        t.forward(costat/2);
        t.penDown = false;
        t.turnLeft(180);
        t.forward(costat/2);
        t.penDown = true;
        t.forward(costat/2);
    }

    static void dibuixaCircumferencia() {
        t.turnLeft(90);
        for (int i = 0; i < angle; i++) {
            t.forward((int) avanç);
            t.turnLeft((int) avanç);
        }
    }


}
