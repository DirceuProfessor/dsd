import unip.dsd.rmi.Mensageiro;

import java.rmi.Naming;

/**
 * Created by dirceu on 8/17/14.
 */
public class ServidorMensageiro {

    public ServidorMensageiro() {
        try {
            Mensageiro m = new Mensageiro();
            Naming.rebind("rmi://localhost:1099/ServicoMensageiro", m);
        }
        catch( Exception e ) {
            System.out.println( "Trouble: " + e );
        }
    }

    public static void main(String[] args) {
        new ServidorMensageiro();
    }
}