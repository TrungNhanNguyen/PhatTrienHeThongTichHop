import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcImplement extends UnicastRemoteObject implements CalcInterface {

    protected CalcImplement() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    public String reverse(String str) throws RemoteException {
        StringBuilder SB = new StringBuilder(str);
        return SB.reverse().toString();
    }


}