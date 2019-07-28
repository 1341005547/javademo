package internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2018/9/20.
 */
public class Address {
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            ip.getHostName();
            ip.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
