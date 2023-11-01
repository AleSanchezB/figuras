package figurasgeometricas.eventos;

import java.awt.event.WindowEvent;

public class EscuchadorVentana implements java.awt.event.WindowListener{

    public void windowClose(WindowEvent e){
        
    }

    public void windowActivated(WindowEvent e){}
    public void	windowClosed(WindowEvent e){}
    public void	windowClosing(WindowEvent e){
        javax.swing.JOptionPane.showMessageDialog(null, "Autor: Braulio Alessandro Sanchez Bermudez", "a222203834@unison.mx | Ciencias de la Computación", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    public void	windowDeactivated(WindowEvent e){}
    public void	windowDeiconified(WindowEvent e){}
    public void	windowIconified(WindowEvent e){}
    public void	windowOpened(WindowEvent e){}
}
