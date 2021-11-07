import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws NotBoundException {
        Registry reg;
        try {
            reg = LocateRegistry.getRegistry(7070);
            CalcInterface cItf = (CalcInterface) reg.lookup("Calculation");
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.print("Nhap chuoi: ");
                try
                {
                String str = BR.readLine();
                System.out.println("Chuoi sau dao nguoc: " + cItf.reverse(str));
                }
                catch( IOException e )
                {
                   System.out.println("Error!");
                }
                

            } while (true);
            
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}