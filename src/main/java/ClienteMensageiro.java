import unip.dsd.rmi.MensageiroCon;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;

/**
 * Created by dirceu on 8/17/14.
 */
public class ClienteMensageiro{

    public static void main( String args[] ) {
        try {
            MensageiroCon m = (MensageiroCon) Naming.lookup( "rmi://localhost/MensageiroService" );
            System.out.println( m.lerMensagem() );
            m.enviarMensagem( "Hello World!" );
        }
        catch( MalformedURLException e ) {
            System.out.println();
            System.out.println( "MalformedURLException: " + e.toString() );
        }
        catch( RemoteException e ) {
            System.out.println();
            System.out.println( "RemoteException: " + e.toString() );
        }
        catch( NotBoundException e ) {
            System.out.println();
            System.out.println( "NotBoundException: " + e.toString() );
        }
        catch( Exception e ) {
            System.out.println();
            System.out.println( "Exception: " + e.toString() );
        }
    }
}