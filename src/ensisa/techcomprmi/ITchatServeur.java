package ensisa.techcomprmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Florent
 */
interface ITchatServeur extends Remote{
    public void register(ITchatClient c) throws RemoteException;
    public void dispatch(String msg) throws RemoteException;
}
