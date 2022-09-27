package square_window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
    private int borderX, borderY;


    // starting point of square
    private int QuadX = 10, QuadY = 10;

    // size of the square
    private int seitenlaenge = 100;
    private int abstandX = 0, abstandY = 0;
    private boolean inBound = false;

    public MyPanel() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        // takes the values of the underlying JFrame
        borderX = this.getWidth();
        borderY = this.getHeight();

        if (QuadX > borderX - seitenlaenge) {
            QuadX = borderX - seitenlaenge;
        }

        if (QuadY > borderY - seitenlaenge) {
            QuadY = borderY - seitenlaenge;
        }

        if (QuadX < 0) {
            QuadX = 0;
        }

        if (QuadY < 0) {
            QuadY = 0;
        }

        g.fillRect(QuadX, QuadY, seitenlaenge, seitenlaenge);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if ((mouseEvent.getX() > QuadX && mouseEvent.getX() < QuadX + seitenlaenge) &&
                (mouseEvent.getY() > QuadY && mouseEvent.getY() < QuadY + seitenlaenge)) {
            abstandX = mouseEvent.getX() - QuadX;
            abstandY = mouseEvent.getY() - QuadY;
            inBound = true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        inBound = false;
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        if (inBound) {
            QuadX = mouseEvent.getX() - abstandX;
            QuadY = mouseEvent.getY() - abstandY;
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
