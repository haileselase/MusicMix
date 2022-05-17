
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RMIinterface extends Remote{
public void mixingMusic(String Name)throws RemoteException;
    public void mixingMusdic(String music)throws RemoteException;
}
