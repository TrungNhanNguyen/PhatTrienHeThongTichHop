import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcInterface extends Remote {
    public String reverse(String str) throws RemoteException;

}