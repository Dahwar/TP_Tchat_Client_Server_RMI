package ensisa.techcomprmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Florent
 */
interface ITchatClient extends Remote{
    public void connect(String srv) throws RemoteException;
    public void send(String msg) throws RemoteException;
    public void receive(String msg) throws RemoteException;
}
