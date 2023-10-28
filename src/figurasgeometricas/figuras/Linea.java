package figurasgeometricas.figuras;

import java.awt.Point;
import java.awt.Color;

public class Linea extends Figura{

    private Point point1, point2;
    private Color color;
    private int grosor;

    public Linea(Point point1, Point point2, Color color, int grosor){
        this.point1 = point1;
        this.point2 = point2;
        this.color = color;
        this.grosor = grosor;
    }
    @Override
    public void pintar(java.awt.Graphics g){
        //g.drawLine(point1.x, point1.y, point2.x, point2.y);
        java.awt.Graphics2D g2d = (java.awt.Graphics2D) g;
        g2d.setStroke(new java.awt.BasicStroke(grosor)); // 5 es el grosor en píxeles

        g2d.setColor(color);
        // Dibuja una línea con el grosor especificado
        g2d.draw(new java.awt.geom.Line2D.Double(point1.x, point1.y, point2.x, point2.y));

    }
}
