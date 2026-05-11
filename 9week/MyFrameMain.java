import javax.swing.*;
import java.awt.*;

class  MyFrameContentEx extends JFrame{
    public MyFrameContentEx()
    {
        setTitle("ContentPane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));
        contentPane.add(new JButton("Tom"));
        contentPane.add(new JButton("John"));
        contentPane.add(new JButton("Jane"));
        contentPane.add(new JButton("Arthur"));
        contentPane.add(new JButton("Son"));

        setSize(300,150);
        setVisible(true);

    }

}
public class MyFrameMain extends JFrame{
        public static void main(String[] args) {
            new MyFrameContentEx();
        }
}
