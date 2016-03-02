import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by pnegre on 23/11/15.
 */
public class Turtle {
    private int SIZEX;
    private int SIZEY;
    private MyFrame frame;
    private double x = 0, y = 0;
    private double angle = 0;
    public boolean penDown = true;

    static class MyFrame extends JFrame {
        BufferStrategy bufferStrategy;
        Canvas canvas;

        public MyFrame(int sx, int sy) {
            super("Turtle");
            canvas = new Canvas();
            canvas.setIgnoreRepaint(true);
            canvas.setSize(sx, sy);
            this.add(canvas);
            this.pack();
            this.setIgnoreRepaint(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            canvas.createBufferStrategy(2);
            bufferStrategy = canvas.getBufferStrategy();
            this.setFocusable(true);
            canvas.setFocusable(false);
        }

        Graphics getTheGraphics() {
            return bufferStrategy.getDrawGraphics();
        }

        void flip() {
            bufferStrategy.show();
            bufferStrategy.getDrawGraphics().dispose();
        }
    }

    public Turtle(int sx, int sy) {
        SIZEX = sx; SIZEY = sy;
        frame = new MyFrame(sx, sy);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public void reset() {
        penDown = true;
        x = y = 0;
        angle = 0d;
        Graphics g = frame.getTheGraphics();
        g.clearRect(0,0,SIZEX,SIZEY);
    }

    private int transformX(double xx) {
        return SIZEX/2 + (int) Math.round(xx);
    }

    private int transformY(double yy) {
        return SIZEY/2 - (int) Math.round(yy);
    }

    public void turnRight(int howMuch) {
        angle -= howMuch;
    }

    public void turnLeft(int howMuch) {
        angle += howMuch;
    }

    public void forward(int howMuch) {
        Graphics g = frame.getTheGraphics();
        double realAngle = (angle + 90) * Math.PI / 180d;
        double newx = (x + ((double) howMuch) * Math.cos(realAngle));
        double newy = (y + ((double) howMuch) * Math.sin(realAngle));

//        System.err.printf("Angle: %f; Pos: %d %d --> %d %d\n", realAngle, x, y, newx, newy);

        if (penDown)
            g.drawLine(
                    transformX(x), transformY(y), transformX(newx), transformY(newy)
            );

        x = newx; y = newy;
        frame.flip();
    }

    public void goTo(int xx, int yy) {
        x = xx;
        y = yy;
    }
}
