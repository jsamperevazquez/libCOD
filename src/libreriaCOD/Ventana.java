package libreriaCOD;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  23 de feb. de 2021.
 **/
public class Ventana {
    public void visualiza(String mensaje){

        JOptionPane.showMessageDialog(null,mensaje);
    }

    public void visualizaConfirmacion(String mensaje){
        int respuesta = JOptionPane.showConfirmDialog(null,mensaje);
    }

    public void visualizaError(String mensaje){
        int respuesta= JOptionPane.showConfirmDialog(null,mensaje,"Alerta",JOptionPane.YES_OPTION,JOptionPane.ERROR_MESSAGE);
        if (respuesta==0){
            JOptionPane.showMessageDialog(null,"Programa cerrado");
            System.out.println("Exit");

        }else if (respuesta==1){
            JOptionPane.showMessageDialog(null,"Continua Programa");
        }

    }
}
