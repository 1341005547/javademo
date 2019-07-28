import javax.swing.*;
import java.awt.*;
import java.net.URI;
import java.net.URL;

/**
 * Created by Administrator on 2018/9/25.
 */
public class ThreadDemo extends JFrame{
    private JLabel jLabel = new JLabel();
    private static Thread t;
    private int count = 0;
    private Container container = getContentPane();

    public ThreadDemo(){
        setBounds(300,200,250,100);
        container.setLayout(null);
        URL url = ThreadDemo.class.getResource("1.jpg");
        Icon icon = new ImageIcon(url);
        jLabel.setIcon(icon);
        jLabel.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel.setBounds(10,10,200,50);
        jLabel.setOpaque(true);
        t = new Thread(new Runnable() {
            public void run() {
                while (count <= 200){
                    jLabel.setBounds(count,10,200,50);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count+=4;
                    if (count == 200){
                        count = 10;
                    }
                }
            }
        });
        t.start();
        container.add(jLabel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ThreadDemo();
    }

}
