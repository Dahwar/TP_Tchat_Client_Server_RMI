package ensisa.techcomprmi;

import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Florent
 */
public class Client {
    public static void main(String[] args){
        try {
            TchatClient TC = new TchatClient();
            TC.connect("TchatServer");
            
            while(true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Veuillez saisir un mot :");
                TC.send(sc.nextLine());
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
