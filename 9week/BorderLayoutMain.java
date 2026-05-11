import javax.swing.*;
import java.awt.*;

class BorderLayoutEx extends JFrame{
    public BorderLayoutEx(){
        setTitle("BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(new JButton("OK"));
        contentPane.add(p);

        setSize(300,150);
        setVisible(true);

}
}



public class BorderLayoutMain extends JFrame{
    public static void main(String[] args) {
        new BorderLayoutEx();
    }
    
}
