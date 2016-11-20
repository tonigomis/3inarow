/**
 * Created by toni on 11/10/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pnegre on 23/11/15.

 Exemple:

 // Create Turtle object
 Turtle t = new Turtle(500,500);

 // Movements
 t.goTo(-100,-100);
 t.forward(200);
 t.turnRight(90);
 t.forward(200);
 t.turnRight(90);
 t.forward(200);
 t.turnRight(90);
 t.forward(200);

 // Show canvas
 t.show();

 */

public class Turtle {
    private int SIZEX;
    private int SIZEY;
    private MyFrame frame;
    private double x = 0, y = 0;
    private double angle = 0;
    public boolean penDown = true;


    private static class Line {
        int x1,y1,x2,y2;
        public Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1; this.y1 = y1;
            this.x2 = x2; this.y2 = y2;
        }
    }

    private static class MyPanel extends JPanel {
        List<Line> lineList = new ArrayList<Line>();

        public void paintComponent(Graphics g) {
            if (lineList != null)
                for(Line l: lineList) {
                    g.drawLine(l.x1, l.y1, l.x2, l.y2);
                }
        }
    }


    private static class MyFrame extends JFrame {
        MyPanel panel;

        public MyFrame(int sx, int sy) {
            super("Turtle");
            panel = new MyPanel();
            panel.setPreferredSize(new Dimension(sx, sy));
            this.add(panel);
            this.pack();
            //this.setIgnoreRepaint(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setFocusable(true);

            this.addComponentListener(new ComponentListener() {
                @Override
                public void componentResized(ComponentEvent e) {
                    int h = e.getComponent().getHeight();
                    int w = e.getComponent().getWidth();
                    System.err.printf("%d %d\n", h, w);
                }

                @Override
                public void componentMoved(ComponentEvent e) {

                }

                @Override
                public void componentShown(ComponentEvent e) {

                }

                @Override
                public void componentHidden(ComponentEvent e) {

                }
            });
        }

        void addLine(Line l) {
            panel.lineList.add(l);
        }
    }

    public Turtle(int sx, int sy) {
        SIZEX = sx; SIZEY = sy;
        frame = new MyFrame(sx, sy);
    }

    public void show() {
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
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
        double realAngle = (angle + 90) * Math.PI / 180d;
        double newx = (x + ((double) howMuch) * Math.cos(realAngle));
        double newy = (y + ((double) howMuch) * Math.sin(realAngle));

        if (penDown) {
            int x1 = transformX(x), y1 = transformY(y);
            int x2 = transformX(newx), y2 = transformY(newy);
            frame.addLine(new Line(x1,y1,x2,y2));
        }

        x = newx; y = newy;
    }

    public void resetAngle() {
        angle = 0d;
    }


    public void goTo(int xx, int yy) {
        x = xx;
        y = yy;
    }
}