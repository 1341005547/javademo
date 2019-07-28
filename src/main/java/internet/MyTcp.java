package internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2018/9/25.
 */
public class MyTcp  {

    private ServerSocket server;
    private Socket socket;
    private BufferedReader reader;
    void getServer(){
        try {
            server = new ServerSocket(8998);
            System.out.println("服务器套接字已经创建成功");
            while (true){
                System.out.println("等待客户机的连接");
                socket = server.accept();
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                while (true){
                    System.out.println("客户端："+reader.readLine());
                    if ( reader != null){
                        reader.close();
                    }
                    if (socket != null){
                        socket.close();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MyTcp myTcp = new MyTcp();
        myTcp.getServer();
    }
}
