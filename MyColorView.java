import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;


public class MyColorView extends JFrame{
    private MyColorModel myColorModel;
    private JLabel jl;
    public MyColorView() {
        this.myColorModel= new MyColorModel();
        this.init();
        
    }
    private void init() {
        this.setTitle("My color");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font_text = new Font("Arial",Font.BOLD,100);
        jl = new JLabel("TTP !!!!",JLabel.CENTER);
        MyColorLIstener ac = new MyColorLIstener(this);

        jl.setFont(font_text);
        
        JPanel jp =new JPanel( );
        jp.setLayout(new GridLayout(2,3));
        Font font =new Font("Arial",Font.BOLD,40);
        JButton jb_text_red = new JButton("Red Text");
        jb_text_red.setFont(font);
       jb_text_red.addActionListener(ac);
        jb_text_red.setForeground(Color.RED);

        JButton jb_text_yellow = new JButton("Yellow Text");
        jb_text_yellow.setFont(font);
       jb_text_yellow.addActionListener(ac);
        jb_text_yellow.setForeground(Color.YELLOW);

        JButton jb_text_green = new JButton("Green Text");
        jb_text_green.setFont(font);
       jb_text_green.addActionListener(ac);
        jb_text_green.setForeground(Color.GREEN);

        JButton jb_background_red = new JButton("Red Background");
        jb_background_red.setFont(font);
       jb_background_red.addActionListener(ac);
        jb_background_red.setBackground(Color.RED);
        jb_background_red.setOpaque(true);
        jb_background_red.setBorderPainted(false);

        JButton jb_background_yellow = new JButton("Yellow Background");
        jb_background_yellow.setFont(font);
       jb_background_yellow.addActionListener(ac);
        jb_background_yellow.setBackground(Color.YELLOW);
        jb_background_yellow.setOpaque(true);
        jb_background_yellow.setBorderPainted(false);


        JButton jb_background_green = new JButton("Green Background");
        jb_background_green.setFont(font);
       jb_background_green.addActionListener(ac);
        jb_background_green.setBackground(Color.GREEN);
        jb_background_green.setOpaque(true);
        jb_background_green.setBorderPainted(false);


        jp.add(jb_text_red);
        jp.add(jb_text_yellow);
        jp.add(jb_text_green);
        jp.add(jb_background_red);
        jp.add(jb_background_yellow);
        jp.add(jb_background_green);

        this.setLayout(new BorderLayout());
        this.add(jl,BorderLayout.NORTH);
        this.add(jp,BorderLayout.CENTER);
         this.setVisible(true);




    }
    
    public void ChangeColorBackground(Color color) {
        this.jl.setBackground(color);
        this.jl.setOpaque(true);

    }
    public void ChangeColortext(Color color) {
        this.jl.setForeground(color);
    }
    
    
}