package figurasgeometricas.guis;

import java.awt.Color;
import java.awt.Point;

import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import java.util.Enumeration;
import figurasgeometricas.guis.DibujoPanel;
import figurasgeometricas.figuras.Linea;
import figurasgeometricas.figuras.Ovalo;
import figurasgeometricas.figuras.Rectangulo;

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
        this.setPreferredSize(new java.awt.Dimension(150, 600));
        String labelsColores[] = { "Negro", "Azul", "Rojo", "Verde", "Naranja", "Rosa" };
        String figuras[] = { "Linea", "Rectangulo", "Ovalo" };

        radioButtons = new JRadioButton[3];
        buttonGroup = new javax.swing.ButtonGroup();
        spinner = new javax.swing.JSpinner();
        list = new javax.swing.JComboBox<String>();

        spinner.setPreferredSize(new java.awt.Dimension(80, 24));
        spinner.addChangeListener(new EscuchadorSpinner(spinner));
        for (int i = 0; i < figuras.length; i++) {
            radioButtons[i] = new JRadioButton(figuras[i]);
            buttonGroup.add(radioButtons[i]);
            this.add(radioButtons[i]);
        }
        this.add(list);
        this.add(spinner);
        this.radioButtons[0].setSelected(true);
        for (int i = 0; i < labelsColores.length; i++) {
            list.addItem(labelsColores[i]);
        }
    }

    public void crearFigura(Point p1, Point p2) {

        // Luego, para obtener el botón seleccionado y su etiqueta:
        JRadioButton selectedButton = null;

        // Iterar a través de los botones del grupo para encontrar el seleccionado
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                selectedButton = (JRadioButton) button;
                break;
            }
        }

        String fig = selectedButton.getText();

        switch (fig) {
            case "Linea":
                dp.agregarFigura(
                        new Linea(p1, p2, obtenerColor(list.getSelectedItem().toString()), (int) spinner.getValue()));
                break;
            case "Rectangulo":
                dp.agregarFigura(
                        new Rectangulo(p1, p2, obtenerColor(list.getSelectedItem().toString()),
                                (int) spinner.getValue()));
                break;
            case "Ovalo":
                dp.agregarFigura(
                        new Ovalo(p1, p2, obtenerColor(list.getSelectedItem().toString()), (int) spinner.getValue()));
                break;
            default:
                break;
        }
    }

    private Color obtenerColor(String item) {
        Color color = null;
        switch (item) {
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

class EscuchadorSpinner implements javax.swing.event.ChangeListener {

    private javax.swing.JSpinner spinner;

    public EscuchadorSpinner(javax.swing.JSpinner spinner) {
        this.spinner = spinner;
    }

    @Override
    public void stateChanged(javax.swing.event.ChangeEvent e) {
        int valor = (int) spinner.getValue();
        if (valor < 0) {
            spinner.setValue(0); // Establecer el valor mínimo si es menor que 10
        } else if (valor > 50) {
            spinner.setValue(50); // Establecer el valor máximo si es mayor que 50
        }
    }
}
