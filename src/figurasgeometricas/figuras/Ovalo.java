package figurasgeometricas.figuras;

import java.awt.Point;
import java.awt.Color;

public class Ovalo extends Figura{

    public Ovalo(Point point1, Point point2, Color color, int grosor){
        this.point1 = point1;
        this.point2 = point2;
        this.color = color;
        this.grosor = new java.awt.BasicStroke(grosor); 
    }
    @Override
    public void pintar(java.awt.Graphics g){
        java.awt.Graphics2D g2d = (java.awt.Graphics2D) g;
        g2d.setStroke(grosor); 


        g2d.setColor(color);
        verificar();
        g2d.drawOval(this.point1.x, this.point1.y, Math.abs(this.point1.x - this.point2.x), Math.abs(this.point1.y - this.point2.y));
    }
}
