import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrameEX extends JFrame{
    public MyFrameEX(){
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300);
        setVisible(true);
    }
}


public class FirstGUI2 {
    public static void main(String[] args)
    {
        MyFrameEX mf = new MyFrameEX();
    }
}
