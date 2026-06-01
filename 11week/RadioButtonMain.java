import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RadioButtonEx extends JFrame {
    public RadioButtonEx() {
        setTitle("라디오버튼 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ButtonGroup g = new ButtonGroup();

        JRadioButton apple = new JRadioButton("사과");
        JRadioButton pear = new JRadioButton("배", true);
        JRadioButton cherry = new JRadioButton("체리");

        g.add(apple);
        g.add(pear);
        g.add(cherry);

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    JRadioButton rb = (JRadioButton) e.getItem();
                    setTitle(rb.getText() + " 선택됨");
                }
            }
        };

        apple.addItemListener(listener);
        pear.addItemListener(listener);
        cherry.addItemListener(listener);

        setSize(400,150);
        setVisible(true);
    }
}


public class RadioButtonMain {
    public static void main(String[] args)
    {
        new RadioButtonEx();
    }    
}
