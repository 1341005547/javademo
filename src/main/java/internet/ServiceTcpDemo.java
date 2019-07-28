package internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2018/9/20.
 */
public class ServiceTcpDemo {
    private BufferedReader reader;
    private Socket socket;
    private ServerSocket serverSocket;

    void getServer(){
        try {
            serverSocket = new ServerSocket(8080);
            socket = serverSocket.accept();
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            getClientMsg();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取客户端信息
    }

    private void getClientMsg() {
        while (true){
            try {
                System.out.println(reader.readLine());
                if (reader != null){
                    reader.close();
                }
                if (socket != null){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
