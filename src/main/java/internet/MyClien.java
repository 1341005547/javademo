package internet;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Administrator on 2018/9/25.
 */
public class MyClien extends JFrame {
    private PrintWriter writer;
    Socket socket;
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    Container cc;
    public MyClien(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cc = this.getContentPane();
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        scrollPane.setViewportView(ta);
        cc.add(tf,"South");
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                writer.print(tf.getText());
                ta.append(tf.getText()+'\n');
                ta.setSelectionEnd(ta.getText().length());
                tf.setText("");
            }
        });

    }

    private void connect(){
        ta.append("尝试连接\n");
        try {
            socket = new Socket("127.0.0.1",8998);
            writer = new PrintWriter(socket.getOutputStream(),true);
            ta.append("连接完成\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MyClien myClien = new MyClien("向服务器送数据");
        myClien.setSize(200,200);
        myClien.setVisible(true);
        myClien.connect();
    }
}
