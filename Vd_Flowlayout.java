
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vd_Flowlayout  extends JFrame{
    public Vd_Flowlayout(){
        this.setTitle("VD Flowlayout");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);

        FlowLayout fl =new FlowLayout();
        FlowLayout fl1 =new FlowLayout(FlowLayout.RIGHT);
        FlowLayout fl2 =new FlowLayout(FlowLayout.CENTER,50,50);

        //this.setLayout(fl);
        //this.setLayout(fl1); 
        this.setLayout(fl2);
       
         JButton jb1= new JButton("A");
         JButton jb2= new JButton("B");
         JButton jb3= new JButton("C");
         this.add(jb1);
         this.add(jb2);
         this.add(jb3);

         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        

}
    public static void main(String[] args) {
        new Vd_Flowlayout();
    }
}