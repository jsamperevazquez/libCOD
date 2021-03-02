package libreriaCOD;

import java.util.Scanner;

/**
 * Creado por @autor: angel
 * El  02 de mar. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class InConsola implements InterfaceMetodosComunes{

    @Override
    public void visualizar(String mensaje) {

    }

    @Override
    public void introducirDatos() {
        System.out.println("Por favor, introduzca datos");
        Scanner sc = new Scanner(System.in);
        String entrada="";
        entrada=sc.nextLine();

    }
}
