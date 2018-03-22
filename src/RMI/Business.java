package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Created with IntelliJ IDEA.
 * @author: Administrator
 * @Date: 2018/3/22
 * @Time: 10:06
 * To change this template use File | Settings | File Templates.
 */
public interface Business extends Remote {



    public  String  echo(String message) throws RemoteException;
    
    

    
}
