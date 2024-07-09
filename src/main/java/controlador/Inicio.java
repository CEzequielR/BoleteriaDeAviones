
package controlador;

import java.util.Random;
import javax.swing.JFrame;
import vista.Autenticacion;


public class Inicio {
    public static void main(String[] args) {
        Autenticacion aute1 = new Autenticacion();
        aute1.setVisible(true);
        aute1.setLocationRelativeTo(null);
        aute1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
}
