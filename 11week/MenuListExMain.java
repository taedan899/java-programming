import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MenuListEx extends JFrame {
    private JLabel imgLabel = new JLabel();

    public MenuListEx() {
        setTitle("Menu에 Action 리스너 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createMenu();

        getContentPane().add(imgLabel, BorderLayout.CENTER);

        setSize(250, 200);
        setVisible(true);
    }

    public void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenuItem[] menuItems = new JMenuItem[4];

        String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
        JMenu screenMenu = new JMenu("Screen");

        MenuActionListener listener = new MenuActionListener();

        for (int i = 0; i < menuItems.length; i++) {
            menuItems[i] = new JMenuItem(itemTitle[i]);
            menuItems[i].addActionListener(listener);
            screenMenu.add(menuItems[i]);
        }

        mb.add(screenMenu);
        setJMenuBar(mb);
    }

    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();

            switch (cmd) {
                case "Load":
                    if (imgLabel.getIcon() != null) return;
                    imgLabel.setIcon(new ImageIcon("images/img.jpg"));
                    break;

                case "Hide":
                    imgLabel.setVisible(false);
                    break;

                case "ReShow":
                    imgLabel.setVisible(true);
                    break;

                case "Exit":
                    System.exit(0);
                    break;
            }
        }
    }
}

public class MenuListExMain {
    public static void main(String[] args) {
        new MenuListEx();
    }
}