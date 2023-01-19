import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;


public class vd_BoderLayout extends JFrame {

   

    public vd_BoderLayout() {
        this.setTitle("Vd BoderLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);

      BorderLayout bl1=new BorderLayout();
      BorderLayout bl2= new BorderLayout(15,15);

      JButton jb1 =new JButton("1");
      JButton jb2 =new JButton("2");
      JButton jb3 =new JButton("3");
      JButton jb4 =new JButton("4");
      JButton jb5 =new JButton("5");
    
        this.setLayout(bl1);
        this.add(jb1, BorderLayout.NORTH);
      this.add(jb2, BorderLayout.SOUTH);
      this.add(jb3, BorderLayout.WEST);
      this.add(jb4, BorderLayout.EAST);
      this.add(jb5, BorderLayout.CENTER);
   



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);





    }
    
    public static void main(String[] args) {
            new vd_BoderLayout();
    }


}
