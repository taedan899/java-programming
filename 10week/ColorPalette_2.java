import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EastColorButtonsFrame2 extends JFrame {

    private CenterPanel centerPanel = new CenterPanel();

    public EastColorButtonsFrame2(){
        setTitle("East Color Grid 프레임");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.add(new EastPanel(), BorderLayout.EAST);
        c.add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    class EastPanel extends JPanel {
        private Color [] colorList = {Color.LIGHT_GRAY, Color.BLUE, Color.YELLOW,Color.CYAN, Color.RED, Color.GRAY, Color.PINK, Color.GREEN, Color.ORANGE,Color.MAGENTA};

        public EastPanel() {
            setBackground(Color.LIGHT_GRAY);
            setLayout(new GridLayout(10,1));

            for(int i=0; i<10; i++) {
                JButton b = new JButton("");
                b.setOpaque(true);
                b.setBackground(colorList[i]);

                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e){
                        JButton btn = (JButton)e.getSource();
                        centerPanel.changeTextColor(btn.getBackground());
                    }    
                });
                
                add(b);
            }
        }
    }

    class CenterPanel extends JPanel {
        private JLabel textList[] = new JLabel[10];

        public CenterPanel(){
            setBackground(Color.WHITE);
            setLayout(null);

            for(int i=0; i<textList.length; i++)
            {
                JLabel text = new JLabel(Integer.toString(i));
                textList[i] = text;
                text.setSize(10,10);
                int x = (int)(Math.random()*150 + 50);
                int y = (int)(Math.random()*150 + 50);
                text.setLocation(x,y);
                text.setForeground(Color.BLUE);
                add(text);
            }
        }

        public void changeTextColor(Color c) {
            for(int i=0; i<textList.length; i++){
                textList[i].setForeground(c);
            }
        }
    }
}



public class ColorPalette_2 {
    public static void main(String[] args){
        new EastColorButtonsFrame2();
    }
}
