package figurasgeometricas.figuras;

public abstract class Figura{

    protected java.awt.Point point1, point2;
    protected java.awt.Color color;
    protected java.awt.BasicStroke grosor;

    public abstract void pintar(java.awt.Graphics G);

    public void verificar(){
        if (point1.x < point2.x && point1.y > point2.y){
            int y = point1.y;
            point1.y = point2.y;
            point2.y = y;
        }
        else if (point1.x > point2.x && point1.y > point2.y) {
            int y = point1.y;
            point1.y = point2.y;
            point2.y = y;

            int x = point1.x;
            point1.x = point2.x;
            point2.x = x;
        }
        else if (point1.x > point2.x){
            int x = point1.x;
            point1.x = point2.x;
            point2.x = x;
        }
    }
}
