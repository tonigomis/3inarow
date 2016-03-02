/**
 * Created by toni on 23/11/15.
 */
public class abtortuga {

    public static void main(String[] args) {
        Turtle turtle = new Turtle(500,400);
        turtle.goTo(-150,-70);
        turtle.forward(150);
        turtle.turnRight(90);
        turtle.forward(100);
        turtle.turnRight(90);
        turtle.forward(150);
        turtle.goTo(-50,25);
        turtle.turnRight(90);
        turtle.forward(100);
        turtle.goTo(140,-70);
        turtle.forward(100);
        turtle.turnRight(90);
        turtle.forward(150);
        turtle.turnRight(90);
        turtle.forward(90);
        turtle.turnRight(90);
        turtle.forward(50);
        turtle.turnRight(90);
        turtle.forward(90);
        turtle.turnRight(-180);
        turtle.penDown = false;
        turtle.forward(80);
        turtle.penDown = true;
        turtle.turnRight(45);
        turtle.forward(28);
        turtle.turnRight(45);
        turtle.forward(80);
        turtle.show();



    }
}
