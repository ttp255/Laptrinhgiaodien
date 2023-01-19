import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;


import java.awt.BorderLayout;
import java.awt.GridLayout;

public class MyCaculator extends JFrame {

    public MyCaculator() {
        this.setTitle("My caculator");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);

        JTextField jtf = new JTextField(50);
        JPanel jp1 =new JPanel();
        jp1.setLayout(new BorderLayout());
        jp1.add(jtf,BorderLayout.CENTER);

        JPanel jp2 =new JPanel();
        jp2.setLayout(new GridLayout(5,3));
        for (int i=0;i<10;i++){
            JButton jb =new JButton(i+"");
            jp2.add(jb);
        }
        JButton jb_cong= new JButton("+");
        JButton jb_tru= new JButton("-");
        JButton jb_nhan= new JButton("*");
        JButton jb_chia= new JButton("/");
        JButton jb_bang= new JButton("=");

        jp2.add(jb_cong);
        jp2.add(jb_tru);
        jp2.add(jb_nhan);
        jp2.add(jb_chia);
        jp2.add(jb_bang);

        this.setLayout(new BorderLayout());
        this.add(jp1,BorderLayout.NORTH);
        this.add(jp2,BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);




    }
    public static void main(String[] args) {

        try {

           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         //  UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
         //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");

            new MyCaculator();
        }catch(Exception ex){
            ex.printStackTrace();
        }
       
       
    }
}    