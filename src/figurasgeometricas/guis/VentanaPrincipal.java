package figurasgeometricas.guis;

import figurasgeometricas.eventos.EscuchadorDibujo;

public class VentanaPrincipal extends javax.swing.JFrame{

    MenuPanel menupanel;
    DibujoPanel dibujopanel;
    
    public VentanaPrincipal(){
        this.setTitle("Dibujo de Braulio Sanchez");
        this.setBounds(0, 0, 800, 600);
        this.setLocationRelativeTo(this);
        this.setLayout(new java.awt.BorderLayout());
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        dibujopanel = new DibujoPanel();
        menupanel = new MenuPanel(dibujopanel);

        dibujopanel.addMouseListener(new EscuchadorDibujo(menupanel));
        getContentPane().add(menupanel, java.awt.BorderLayout.WEST);
        getContentPane().add(dibujopanel, java.awt.BorderLayout.CENTER);
        //this.pack();
        this.setVisible(true);
    }
}
