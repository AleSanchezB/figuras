package figurasgeometricas.figuras;

import java.awt.Point;
import java.awt.Color;
import java.lang.Math;

public class Rectangulo extends Figura {

    public Rectangulo(Point point1, Point point2, Color color, int grosor) {
        this.point1 = point1;
        this.point2 = point2;
        this.color = color;
        this.grosor = new java.awt.BasicStroke(grosor);
    }

    @Override
    public void pintar(java.awt.Graphics g) {
        // g.drawLine(point1.x, point1.y, point2.x, point2.y);
        java.awt.Graphics2D g2d = (java.awt.Graphics2D) g;
        g2d.setStroke(grosor); // 5 es el grosor en píxeles

        g2d.setColor(color);
        // Dibuja una línea con el grosor especificado
        verificar();
        g2d.drawRect(this.point1.x, this.point1.y, Math.abs(this.point1.x - this.point2.x),
                Math.abs(this.point1.y - this.point2.y));
    }


}
