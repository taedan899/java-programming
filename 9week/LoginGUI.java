import javax.swing.*;
import java.awt.*;

class  LoginEx extends JFrame {
    public LoginEx(){
        setTitle("로그인");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JLabel("유저이름: "));
        contentPane.add(new JTextField(15));
        contentPane.add(new JLabel("비밀번호: "));
        contentPane.add(new JTextField(15));
        
        contentPane.add(new JButton("로그인"));
        contentPane.add(new JButton("취소"));
        setSize(270,140);
        setVisible(true);
    }
}

public class LoginGUI {
    
    public static void main(String[] args) {
        LoginEx mf = new LoginEx();
    }
}
