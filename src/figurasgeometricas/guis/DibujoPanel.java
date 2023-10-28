package figurasgeometricas.guis;

import java.util.Vector;
import figurasgeometricas.figuras.Figura;

public class DibujoPanel extends javax.swing.JPanel{

    Vector<Figura>figuras;

    public DibujoPanel(){
        figuras = new Vector<Figura>();
    }
    public void agregarFigura(Figura figura){
        figuras.addElement(figura);
    }

    public void dibujarFiguras(java.awt.Graphics g){
        for(int i = 0; i < figuras.size(); i++){
            figuras.get(i).pintar(g);
        }
    }
    @Override
    public void paint(java.awt.Graphics g){
        System.out.println("paint");
        for(int i = 0; i < figuras.size(); i++){
            figuras.get(i).pintar(g);
        }
    }
}
