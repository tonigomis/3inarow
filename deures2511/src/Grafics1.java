/**
 * Created by toni on 30/11/15.
 */
public class Grafics1 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle(600,500);
        int costat = 50;
        int nqy = 4;
        int nqx = 5;
        int n = -200;
        int f = -200;
        int sep = costat+(costat/2);
        turtle.goTo(n,f);

        for (int i = 0; i < nqx; i++) {
            for (int g = 0; g < nqy; g++) {
                turtle.forward(costat);
                turtle.turnRight(90);
                turtle.forward(costat);
                turtle.turnRight(90);
                turtle.forward(costat);
                turtle.turnRight(90);
                turtle.forward(costat);
                turtle.turnRight(90);

                turtle.penDown=false;
                turtle.forward(costat);
                turtle.forward(costat/2);
                turtle.penDown=true;
            }

            turtle.goTo((sep*i),f);
        }

        turtle.show();

        }

    }