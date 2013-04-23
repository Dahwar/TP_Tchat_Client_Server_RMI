package ensisa.techcomprmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Florent
 */
public class TchatServer extends UnicastRemoteObject implements ITchatServeur{
    
    public ArrayList<ITchatClient> clients = new ArrayList<>();
    
    public TchatServer() throws RemoteException{
        
    }
    
    @Override
    public void register(ITchatClient c) throws RemoteException {
        this.clients.add(c);
    }
    
    @Override
    public void dispatch(String msg) throws RemoteException {
        Iterator it = this.clients.iterator();
        while(it.hasNext()){
            ITchatClient c = (ITchatClient) it.next();
            c.receive(msg);
        }
    }
    
    public static void main(){

    }
}
