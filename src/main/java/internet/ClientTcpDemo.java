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
 * Created by Administrator on 2018/9/20.
 */
public class ClientTcpDemo extends JFrame{
    private PrintWriter printWriter;
    Socket socket;
    private JTextArea jTextArea = new JTextArea();
    private JTextField jTextField = new JTextField();
    Container container;

    public ClientTcpDemo() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //获取画板上的内容
        container = this.getContentPane();
        final JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(jScrollPane,BorderLayout.CENTER);
        jScrollPane.setViewportView(jTextArea);
        container.add(jTextField,"south");
        jTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printWriter.print(jTextField.getText());
                jTextArea.append(jTextField.getText());
                jTextArea.setSelectionEnd(jTextField.getText().length());

            }
        });

    }

    private void connect(){
        try {
            socket = new Socket("127.0.0.1",8080);
             printWriter =  new PrintWriter(socket.getOutputStream(),true);
             if (socket != null){
                 socket.close();
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
