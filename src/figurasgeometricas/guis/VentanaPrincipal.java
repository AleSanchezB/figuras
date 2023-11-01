package figurasgeometricas.guis;

import figurasgeometricas.eventos.EscuchadorDibujo;
import figurasgeometricas.eventos.EscuchadorVentana;

public class VentanaPrincipal extends javax.swing.JFrame {

    private MenuPanel menupanel;
    private DibujoPanel dibujopanel;

    public VentanaPrincipal() {
        this.setTitle("Dibujo de Braulio Sanchez");
        this.setBounds(0, 0, 800, 600);
        this.setLocationRelativeTo(this);
        this.setLayout(new java.awt.BorderLayout());
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        dibujopanel = new DibujoPanel();
        menupanel = new MenuPanel(dibujopanel);

        dibujopanel.addMouseListener(new EscuchadorDibujo(menupanel, dibujopanel));
        getContentPane().add(menupanel, java.awt.BorderLayout.WEST);
        getContentPane().add(dibujopanel, java.awt.BorderLayout.CENTER);
        this.addWindowListener(new EscuchadorVentana());
        this.setResizable(false);
        this.setVisible(true);
    }
}
