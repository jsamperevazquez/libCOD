package libreriaCOD;

/**
 * Creado por @autor: angel
 * El  26 de feb. de 2021.
 **/
public class FactoriaDeSalidas {
    public static final int CONSOLA=1;
    public static final int VENTANA=2;
    public static final int IMPRESORA=3;

    public static InterfaceMetodosComunes getProductoSalida(int tipo){
        switch (tipo){
            case CONSOLA:
                return new Consola();
            case VENTANA:
                return new Ventana();
            case IMPRESORA:
                return new Impresora();

            default:
                return null;
        }
    }
}
