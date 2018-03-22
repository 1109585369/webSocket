import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @Created with IntelliJ IDEA.
 * @author: Administrator
 * @Date: 2018/3/21
 * @Time: 19:41
 * To change this template use File | Settings | File Templates.
 */
public class Client {


    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",8080);

        //创建读取服务器的返回的BufferReader
        BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //创建向服务器写入流的PrintWriter
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);

        out.print("hello");
        out.flush();
        if(in.readLine()!=null){
            System.out.println(in.readLine());
        }
    }

    
}
