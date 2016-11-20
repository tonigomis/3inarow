/**
 * Created by toni on 11/10/16.
 */
public class OhMyTurtle {
    public static void main(String[] args) {

        // Crea objecte Turtle i mostra'l a pantalla
        Turtle t = new Turtle(1024, 768);
        t.show();

        // Anar a posició d'inici
        t.goTo(-450, 200);

        // Escriu T
        t.turnRight(90);
        t.forward(200);
        t.penDown = false;
        t.goTo(-350,200);
        t.penDown = true;
        t.turnRight(90);
        t.forward(200);

        // Canvia de lletra
        t.penDown = false;
        t.turnLeft(90);
        t.forward(150);
        t.penDown = true;

        // Escriu O
        t.forward(180);
        t.turnLeft(90);
        t.forward(200);
        t.turnLeft(90);
        t.forward(180);
        t.turnLeft(90);
        t.forward(200);

        // Canvia de lletra
        t.penDown = false;
        t.turnLeft(90);
        t.forward(240);
        t.penDown = true;

        // Escriu N
        t.turnLeft(90);
        t.forward(200);
        t.turnRight(135);
        t.forward(282);
        t.turnLeft(135);
        t.forward(200);

        // Canvia de lletra

        t.penDown = false;
        t.turnRight(90);
        t.forward(50);
        t.turnRight(90);
        t.penDown = true;

        // Escriu I
        t.forward(200);
    }
}
