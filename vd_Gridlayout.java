import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class vd_Gridlayout  extends JFrame{

    public vd_Gridlayout() {
        this.setTitle("Vd GridLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);


       GridLayout gl1=new GridLayout();
       GridLayout gl2=new GridLayout(4,4);
       GridLayout gl3=new GridLayout(4,4,25,25);
       // this.setLayout(gl1);
       // this.setLayout(gl2);
       this.setLayout(gl3);

        for(int i=0;i<16;i++){
            JButton jb=new JButton(i+"");
            this.add(jb);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    public static void main(String[] args) {
        new vd_Gridlayout();
    }
    
}
