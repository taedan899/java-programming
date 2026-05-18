import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyPlusMinusFrame extends JFrame {
    public KeyPlusMinusFrame() {
        super("+,- Keypad Control");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel("Love Java");

        

        label.addKeyListener(new KeyAdapter() {
            public void keyPressed (KeyEvent e){
                if(e.getKeyChar() == '+'){
                    JLabel la = (JLabel)e.getSource();
                    Font f = la.getFont();
                    int size = f.getSize();
                    la.setFont(new Font("TimesRoman",Font.PLAIN,size + 5));
                }
                else if(e.getKeyChar() == '-')
                {
                    JLabel la = (JLabel)e.getSource();
                    Font f = la.getFont();
                    int size = f.getSize();
                    if(size <= 5)
                        return;
                    la.setFont(new Font("TimesRoman",Font.PLAIN,size - 5));

                }
            }
            
        });

        c.add(label);
        setSize(250,150);
        setVisible(true);

        label.setFocusable(true);
        label.requestFocus();
    }
    static public void main(String [] args){
        new KeyPlusMinusFrame();
    }
    
}
