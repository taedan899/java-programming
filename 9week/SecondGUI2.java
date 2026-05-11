import javax.swing.*;
import java.awt.*;

class ContentPaneEx extends JFrame{
    public ContentPaneEx(){
        setTitle("ContentPane과 JFrame예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300,300);
        setVisible(true);
    }

}


public class SecondGUI2 {
    public static void main(String[] args){
        new ContentPaneEx();
    }
}
