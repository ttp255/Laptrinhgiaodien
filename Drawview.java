import javax.swing.JFrame;

import java.awt.BorderLayout;
public class Drawview extends JFrame{
    public Drawview(){
        this.setTitle("Draw EXample");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        DrawEx drawEx=new DrawEx();
        this.setLayout(new BorderLayout());
        this.add(drawEx,BorderLayout.CENTER);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Drawview();
    }
}
