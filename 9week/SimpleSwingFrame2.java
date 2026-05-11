import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;





public class SimpleSwingFrame2 extends JFrame {
    public SimpleSwingFrame2(){
        super("올해는 꼭 핑크 빛 사랑을....");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,150);
        Container c = getContentPane();
        c.setBackground(Color.PINK);
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new SimpleSwingFrame2();

    }
}
