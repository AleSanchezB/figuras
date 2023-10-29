package figurasgeometricas.eventos;

import figurasgeometricas.guis.MenuPanel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class EscuchadorDibujo implements ActionListener, MouseListener {

    private MenuPanel v;
    private boolean clicked = false;
    private int x, y;

    public EscuchadorDibujo(MenuPanel v) {
        this.v = v;
        clicked = false;
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void mouseClicked(MouseEvent e) {
        if (clicked) {
            java.awt.Point p1 = new java.awt.Point();
            java.awt.Point p2 = new java.awt.Point();
            p1.x = x;
            p1.y = y;
            p2.x = e.getX();
            p2.y = e.getY();
            v.crearFigura(p1, p2);
            clicked = false;
        } else {
            clicked = true;
            this.x = e.getX();
            this.y = e.getY();
        }
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {
    }
}
