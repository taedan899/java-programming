import javax.swing.*;
import java.awt.*;

class BorderLayoutButtonsNull extends JFrame {
    public BorderLayoutButtonsNull(){
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(null);

        contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
        contentPane.add(new JButton("add"),BorderLayout.NORTH);
        contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
        contentPane.add(new JButton("mul"),BorderLayout.EAST);
        contentPane.add(new JButton("div"),BorderLayout.WEST);

        setSize(300,200);
        setVisible(true);

    }



}



public class BorderMainNull extends JFrame{
    public static void main(String[] args) {
        new BorderLayoutButtons();
    }    
}






