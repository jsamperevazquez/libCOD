package libreriaCOD;

/**
 * Creado por @autor: angel
 * El  02 de mar. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class FactoriaDeEntradas {
    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;


    public static InterfaceMetodosComunes getProducto(int tipo) {
        switch (tipo) {
            case CONSOLA:
                return new InConsola();
            case VENTANA:
                return new InVentana();

            default:
                return null;
        }
    }
}