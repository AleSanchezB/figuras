package figurasgeometricas.eventos;

import figurasgeometricas.guis.MenuPanel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class EscuchadorDibujo implements ActionListener, MouseListener{

    private java.awt.Point p1, p2;
    private MenuPanel v;
    private boolean clicked = false;
    public EscuchadorDibujo(MenuPanel v){
        this.v = v;
        p1 = new java.awt.Point();
        p2 = new java.awt.Point();
    }
    public void actionPerformed(ActionEvent e){
        
    }

    public void mouseClicked(MouseEvent e){
        if(!clicked)
        {
            this.p2.x = e.getX();
            this.p2.y = e.getY();
            System.out.println("x2: " + p2.x + " y2: " + p2.y);
            v.crearFigura(p1, p2);
            clicked = false;
        }
        else
            clicked = true;
    }

    public void mouseEntered(MouseEvent e){
        
    }

    public void mouseExited(MouseEvent e){
    }

    public void mousePressed(MouseEvent e){
        
    }

    public void mouseReleased(MouseEvent e){
        this.p1.x = e.getX();
        this.p1.y = e.getY();
       System.out.println("x: " + p1.x + " y: " + p1.y);
    }
}
