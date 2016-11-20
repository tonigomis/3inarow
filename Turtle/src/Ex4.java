/**
 * Created by toni on 13/10/16.
 */
public class Ex4 {

    static int canvas = 800;
    static Turtle t = new Turtle(canvas,canvas);
    static int posX = -40;
    static int posY = -280;
    static int ampleFulla = 100;
    static int altTronc = 50;
    static int altFulla = 100;
    static int angle = 90;
    static int numFulles = 4;
    static int hipotenusa = (int) Math.sqrt(altFulla*altFulla+ampleFulla*ampleFulla);

    public static void main(String[] args) {
        t.goTo(posX,posY);
        esquerra();
        capell();
        dreta();
        t.show();
    }

    static void esquerra() {
        t.forward(altTronc);
        t.turnLeft(angle);
        for (int i = 0; i < numFulles; i++) {
            t.forward(ampleFulla);
            t.turnRight(angle + (angle / 2));
            t.forward(hipotenusa);
            t.turnLeft(angle + angle/2);
        }
    }

    static void capell() {
        int altFulla = 125;
        int hipoCapell = (int) Math.sqrt(altFulla*altFulla+altFulla*altFulla);
        t.forward(ampleFulla);
        t.turnRight(angle + angle/2);
        t.forward(hipoCapell);
        t.turnRight(angle);
        t.forward(hipoCapell);
    }

    static void dreta() {
        for (int i = 0; i < numFulles; i++) {
            t.turnRight(angle + (angle / 2));
            t.forward(ampleFulla);
            t.turnLeft(angle + angle / 2);
            t.forward(hipotenusa);
        }
        t.turnRight(angle + angle/2);
        t.forward(ampleFulla);
        t.turnLeft(angle);
        t.forward(altTronc);
    }
}
