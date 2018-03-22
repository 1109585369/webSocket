package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {


    public static void main(String[] args)throws  Exception {
        int port=9527;

        String name="BusinessDemo";
        Business business=new BusinessImpl();
        UnicastRemoteObject.exportObject(business,port);
        Registry registry= LocateRegistry.createRegistry(1099);
        registry.rebind(name,business);
    }


}
