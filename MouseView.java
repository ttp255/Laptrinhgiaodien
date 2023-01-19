import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;


public class MouseView extends JFrame{
    private MouseModel mouseModel;
    private JLabel jLabel_position;
    private JLabel jlabel_x;
    private JLabel jlabel_y;
    private JLabel jLabel_cout;
    private JLabel jLabel_cout_value;
    private JLabel jLabel_empty1;
    private JLabel jLabel_checkin;
    private JLabel jLabel_checkin_value;
    private JLabel jLabel_empty2;
    private JPanel jp2;

    public MouseView() {
        this.mouseModel = new MouseModel();
        this.init();
        
    }

    private void init() {
        this.setTitle("Mouse Example");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Font font =new Font("Arial",Font.BOLD,40);
        JPanel jp1 =new JPanel();
        jp1.setBackground(Color.cyan);
        MouseController mouseController=new MouseController(this);
        jp1.addMouseListener(mouseController);
        jp1.addMouseMotionListener(mouseController);


         jp2 =new JPanel();
         
        jp2.setLayout(new GridLayout(3,3));
          jLabel_position = new JLabel("Position: ");
         jlabel_x=new JLabel("x=");
         jlabel_y=new JLabel("y=");
         jLabel_cout=new JLabel("Number of click: ");
         jLabel_cout_value= new JLabel();
         jLabel_empty1=new JLabel();
         jLabel_checkin=new JLabel("Mouse is in component: ");
        jLabel_checkin_value=new JLabel();
        jLabel_empty2=new JLabel();
       jp2.add(jLabel_position);
       jp2.add(jlabel_x);
       jp2.add(jlabel_y);
       jp2.add(jLabel_cout);
       jp2.add(jLabel_cout_value);
       jp2.add(jLabel_empty1);
       jp2.add(jLabel_checkin);
       jp2.add(jLabel_checkin_value);
       jp2.add(jLabel_empty2);
       
       jLabel_position.setFont(font);
       jlabel_x.setFont(font);
       jlabel_y.setFont(font);
       jLabel_cout.setFont(font);
       jLabel_cout_value.setFont(font);
       jLabel_empty1.setFont(font);
       jLabel_checkin.setFont(font);
       jLabel_checkin_value.setFont(font);
       jLabel_empty2.setFont(font);



        this.setLayout(new BorderLayout());
        this.add(jp1,BorderLayout.CENTER);
        this.add(jp2,BorderLayout.SOUTH);

        this.setVisible(true);
    }
    public void click(){
        this.mouseModel.addClick();
        this.jLabel_cout_value.setText(this.mouseModel.getCout()+"");
    }
    public void exit(){
        this.mouseModel.exit();
        this.jLabel_checkin_value.setText(this.mouseModel.getCheckin());
    }
    public void enter(){
        this.mouseModel.enter();
        this.jLabel_checkin_value.setText(this.mouseModel.getCheckin());
    }
    public void update(int x,int y){
        this.mouseModel.setX(x);
        this.mouseModel.setY(y);
        this.jlabel_x.setText("x= "+this.mouseModel.getX()+"");
        this.jlabel_y.setText("y= "+this.mouseModel.getY()+"");

    }
}
