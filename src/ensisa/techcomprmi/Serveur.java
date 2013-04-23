package ensisa.techcomprmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author Florent
 */
public class Serveur {
    public static void main(String[] args){
        try {
            TchatServer TS = new TchatServer();
            Naming.rebind("TchatServer", TS);
            System.out.println("TchatServer lauch");
            
        } catch (RemoteException | MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
}
