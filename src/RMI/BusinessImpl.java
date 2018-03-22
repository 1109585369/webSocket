package RMI;

import java.rmi.RemoteException;

/**
 * @Created with IntelliJ IDEA.
 * @author: Administrator
 * @Date: 2018/3/22
 * @Time: 10:09
 * To change this template use File | Settings | File Templates.
 */
public class BusinessImpl implements Business {
    @Override
    public String echo(String message) throws RemoteException {
        if("quit".equalsIgnoreCase(message.toString())){
            System.out.println("Server will be shutdown");
            System.exit(0);
        }
        System.out.println("Message from client:"+message);
        return "Server response"+message;
    }
}
