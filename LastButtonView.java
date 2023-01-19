import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class LastButtonView  extends JFrame{
   private  LastButtonModel lastButtonModel;
   private JLabel jb;

    public LastButtonView() {
        this.lastButtonModel =  new LastButtonModel();
        this.init();
    }

    private void init() {
        this.setTitle("Last Button");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        ActionListener ac =new LastButtonListener(this);
        Font font =new Font("Arial",Font.BOLD,40);
       
        JPanel jp1 =new JPanel();
        jp1.setLayout(new GridLayout(2,2));
        for (int i=1;i<=4;i++){
            JButton j =new JButton(i+"");
            jp1.add(j);
            j.setFont(font);
            j.addActionListener(ac);

        }
        JPanel jp2 =  new JPanel();
        jb = new JLabel("---------");
        jb.setFont(font);
        jp2.add(jb);
        this.setLayout(new BorderLayout());
        this.add(jp1,BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);
        this.setVisible(true);


    }
    public void Changeto_1(){
        this.lastButtonModel.setValue_1();
        jb.setText("Last button "+this.lastButtonModel.getValue()+"");
    }
    public void Changeto_2(){
        this.lastButtonModel.setValue_2();
        jb.setText("Last button "+this.lastButtonModel.getValue()+"");

    }public void Changeto_3(){
        this.lastButtonModel.setValue_3();
        jb.setText("Last button "+this.lastButtonModel.getValue()+"");

    }public void Changeto_4(){
        this.lastButtonModel.setValue_4();
        jb.setText("Last button "+this.lastButtonModel.getValue()+"");

    }
   
    
}