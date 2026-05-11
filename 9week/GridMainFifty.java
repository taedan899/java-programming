import javax.swing.*;
import java.awt.*;

class GridLayoutFifty extends JFrame {
    public GridLayoutFifty(){
        super("GridRayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(5,10));
         for(int i=0; i < 5; i++)
            for(int j=0; j< 10; j++){
                String text = Integer.toString(i*10 + j + 1);
                JButton button = new JButton(text);
                contentPane.add(button);
            }
        setSize(500,200);
        setVisible(true);
    }
}

public class GridMainFifty extends JFrame{
    public static void main(String[] args) {
        new GridLayoutFifty();
    }
}
