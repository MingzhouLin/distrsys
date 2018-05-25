
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MTLServer extends CenterSystem {
    public MTLServer() throws RemoteException {
        super(1098);
    }

    public static void main(String args[]) throws Exception {

        CenterSystem server = new CenterSystem();
        Registry registry = LocateRegistry.createRegistry(2000);
        registry.bind("MTL", server);
        System.out.printf("MTL is launched");
    }
}
