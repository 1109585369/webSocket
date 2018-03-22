package RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Created with IntelliJ IDEA.
 * @author: Administrator
 * @Date: 2018/3/22
 * @Time: 10:22
 * To change this template use File | Settings | File Templates.
 */
public class Client {


    public static void main(String[] args) throws RemoteException {
        Registry registry= LocateRegistry.getRegistry("localhost");
        String name="BusinessDemo";
        try {
            Business business= (Business) registry.lookup(name);
            business.echo("你好");
        } catch (NotBoundException e) {
            e.printStackTrace();
        }

    }
}
