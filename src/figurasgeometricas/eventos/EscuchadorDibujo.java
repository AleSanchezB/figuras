package figurasgeometricas.eventos;

import figurasgeometricas.guis.MenuPanel;
import figurasgeometricas.guis.DibujoPanel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class EscuchadorDibujo implements ActionListener, MouseListener {

    private MenuPanel v;
    private DibujoPanel dp;
    private java.awt.Point p3;

    public EscuchadorDibujo(MenuPanel v, DibujoPanel dp) {
        this.v = v;
        this.dp = dp;
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        this.p3 = e.getPoint();
    }

    public void mouseReleased(MouseEvent e) {
        java.awt.Point p1 = new java.awt.Point();
        java.awt.Point p2 = new java.awt.Point();
        p1 = p3;
        p2 = e.getPoint();
        dp.agregarFigura(v.crearFigura(p1, p2));
    }
}
