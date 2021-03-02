package libreriaCOD;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  02 de mar. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class InVentana implements InterfaceMetodosComunes{
    @Override
    public void visualizar(String mensaje) {

    }

    @Override
    public void introducirDatos() {
        String entrada=JOptionPane.showInputDialog(null,"Por favor, introduzca los datos de entrada");

    }
}
