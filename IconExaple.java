import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import java.awt.Font;
import java.net.URL;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

public class IconExaple extends JFrame{
    private JLabel jLabel;
    private JButton jButton;
    public IconExaple() {
        this.setTitle("Icon");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        URL urlicon=IconExaple.class.getResource("icon_java.png");
        Image img=Toolkit.getDefaultToolkit().createImage(urlicon);
        this.setIconImage(img);

        JMenuBar jMenuBar =new JMenuBar();
        JMenu jMenu =new JMenu("Menu");
        JMenuItem jMenuItem_new=new JMenuItem("New");
        jMenuItem_new.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage("icon_new.png")));
        JMenuItem jMenuItem_save=new JMenuItem("Save");
        jMenuItem_save.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage("icon_save.png")));

        JMenuItem jMenuItem_saveas=new JMenuItem("Save as");
        jMenuItem_saveas.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage("icon_saveas.png")));

        JMenuItem jMenuItem_exit=new JMenuItem("Exit");
        jMenuItem_exit.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage("icon_exit.png")));

        JMenuItem jMenuItem_test=new JMenuItem("Test");
        jMenuItem_test.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage("icon_test.png")));

        JMenu jMenu2=new JMenu("Sub menu");
        jMenu2.add(jMenuItem_exit);
        jMenu2.add(jMenuItem_test);
       jMenu.add(jMenuItem_new);
       jMenu.add(jMenuItem_save);
       jMenu.add(jMenuItem_saveas);
       jMenu.add(jMenu2);
       jMenuBar.add(jMenu);
       this.setJMenuBar(jMenuBar);

        JLabel jLabel=new JLabel();
        jLabel.setFont(new Font("Arial",Font.BOLD,50));


        JButton jButton=new JButton("Test button");
        jButton.setFont(new Font("Arial",Font.BOLD,50));
        jButton.setSize(50, 50);
        jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage("icon_button.png")));
        this.setLayout(new BorderLayout());
        this.add(jLabel,BorderLayout.CENTER);
        this.add(jButton,BorderLayout.SOUTH);
        this.setVisible(true);




    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new IconExaple();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}   
