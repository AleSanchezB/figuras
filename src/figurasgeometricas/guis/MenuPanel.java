package figurasgeometricas.guis;

import java.awt.Color;
import java.awt.Point;

import javax.swing.JRadioButton;
import figurasgeometricas.guis.DibujoPanel;
import figurasgeometricas.figuras.Linea;

public class MenuPanel extends javax.swing.JPanel {

    private JRadioButton radioButtons[];
    private javax.swing.JComboBox<String> list;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JSpinner spinner;
    private DibujoPanel dp;
    
    public MenuPanel(DibujoPanel dp) {
        this.dp = dp;
        this.setBackground(Color.CYAN);
        this.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        this.setPreferredSize(new java.awt.Dimension(150,600));
        String labelsColores[] = {"Negro", "Azul", "Rojo", "Verde", "Naranja", "Rosa"};
        String figuras[] = {"Linea", "Rectangulo", "Óvalo"};
        
        radioButtons = new JRadioButton[3];
        buttonGroup = new javax.swing.ButtonGroup();
        spinner = new javax.swing.JSpinner();
        list = new javax.swing.JComboBox<String>();

        spinner.setPreferredSize(new java.awt.Dimension(80, 24));
        for (int i = 0; i < figuras.length; i++) {
            radioButtons[i] = new JRadioButton(figuras[i]);
            //labels[i] = new javax.swing.JLabel(figuras[i]);
            buttonGroup.add(radioButtons[i]);
            this.add(radioButtons[i]);
        }
        this.add(list);
        this.add(spinner);
        for (int i = 0; i < labelsColores.length; i++) {
            list.addItem(labelsColores[i]);
        }
    }

    public void crearFigura(Point  p1, Point p2){

        String fig = "Linea";
        switch(fig){
        case "Linea":
            dp.agregarFigura(new Linea(p1, p2, obtenerColor(list.getSelectedItem().toString()), (int) spinner.getValue()));
            break;
        }
    }

    private Color obtenerColor(String item){
        Color color = null;
        switch(item){
        case "Negro":
            color = Color.BLACK;
            break;
        case "Azul":
            color = Color.BLUE;
            break;
        case "Rojo":
            color = Color.RED;
            break;
        case "Verde":
            color = Color.GREEN;
            break;
        case "Naranja":
            color = Color.ORANGE;
            break;
        case "Rosa":
            color = Color.PINK;
            break;
        }
        return color;
    }
}
