package ensisa.techcomprmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Florent
 */
class TchatClient extends UnicastRemoteObject implements ITchatClient
{
    private ITchatServeur ITS;
    
    public TchatClient() throws RemoteException{
        
    }

    @Override
    public void connect(String srv) throws RemoteException {
        try {
            ITS = (ITchatServeur) Naming.lookup("rmi://localhost/" + srv); // localhost à changer suivant les cas
            ITS.register(this);
        } catch (NotBoundException | MalformedURLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void send(String msg) throws RemoteException {
        ITS.dispatch(msg);
    }

    @Override
    public void receive(String msg) throws RemoteException {
        System.out.println("receive : " + msg);
    }
    
    public static void main(){
        
    }
    
    
}
