import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Created with IntelliJ IDEA.
 * @author: Administrator
 * @Date: 2018/3/21
 * @Time: 19:50
 * To change this template use File | Settings | File Templates.
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8080);
        Socket socket=ss.accept();
        System.out.println("开始监听");
        OutputStream  os = socket.getOutputStream();
        //os.write();

    }
}
