package figurasgeometricas.guis;

import java.util.Vector;
import figurasgeometricas.figuras.Figura;

public class DibujoPanel extends javax.swing.JPanel{

    private Vector<Figura>figuras;
    private javax.swing.border.Border borde;
    public DibujoPanel(){
        figuras = new Vector<Figura>();
        this.setLayout(new java.awt.FlowLayout());
        borde = javax.swing.BorderFactory.createTitledBorder("Dibujo");
        this.setBorder(borde);
    }
    public void agregarFigura(Figura figura){
        figuras.addElement(figura);
        repaint();
    }
    
    @Override
    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < figuras.size(); i++){
            figuras.get(i).pintar(g);
        }
    }
}
