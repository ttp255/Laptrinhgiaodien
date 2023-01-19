import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * MiniCaculatorView
 */
public class MiniCaculatorView extends JFrame {
    private MiniCalculatorModel miniCalculatorModel;
    private JTextField jTextField_firstValue;
    private JTextField jTextField_secondValue;
    private JTextField jTextField_answer;

    public MiniCaculatorView() {
        this.miniCalculatorModel = new MiniCalculatorModel();
        this.init();
    }
    private void init() {
        this.setTitle("Mini Caculator");
        this.setSize(600,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        Font font = new Font("Arial",Font.BOLD,40);
        JLabel jLabel_firstValue= new JLabel("1st value");
        jLabel_firstValue.setFont(font); 
        JLabel jLabel_secondValue= new JLabel("2nd value");
        jLabel_secondValue.setFont(font);
         JLabel jLabel_answer= new JLabel("Answer");
        jLabel_answer.setFont(font);
        jTextField_firstValue= new JTextField();
        jTextField_firstValue.setFont(font);
        jTextField_secondValue= new JTextField();
        jTextField_secondValue.setFont(font);
        jTextField_answer= new JTextField();
        jTextField_answer.setFont(font);
        jLabel_answer.setFont(font);
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(3,2,10,10));
        jp1.add(jLabel_firstValue);
        jp1.add(jTextField_firstValue);
        jp1.add(jLabel_secondValue);
        jp1.add(jTextField_secondValue);
        jp1.add(jLabel_answer);
        jp1.add(jTextField_answer);


        MiniCalculatorListener miniCalculatorListener =  new MiniCalculatorListener(this);


        JButton jb1 =new JButton("+");
        jb1.setFont(font);
        jb1.addActionListener(miniCalculatorListener);
        JButton jb2 =new JButton("-");
        jb2.setFont(font);
        jb2.addActionListener(miniCalculatorListener);
        JButton jb3 =new JButton("*");
        jb3.setFont(font);
        jb3.addActionListener(miniCalculatorListener);
        JButton jb4 =new JButton("/");
        jb4.setFont(font);
        jb4.addActionListener(miniCalculatorListener);
        JButton jb5 =new JButton("^");
        jb5.setFont(font);
        jb5.addActionListener(miniCalculatorListener);  
        JButton jb6 =new JButton("%");
        jb6.setFont(font);
        jb6.addActionListener(miniCalculatorListener);
        JPanel jp2 = new JPanel();
        jp2.setLayout( new GridLayout(2,3));
        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);

        this.setLayout(new BorderLayout());
        this.add(jp1,BorderLayout.CENTER);
        this.add(jp2,BorderLayout.SOUTH);
        

        this.setVisible(true);








    }
    public void plus() {
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.plus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");



    }
    public void minus() {
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.minus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");



    }
    public void multiply() {
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.multiply();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");



    }
    public void divide(){
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.divide();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");



    }
    public void pow() {
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.pow();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");



    }
    public void mod() {
        double firstValue = Double.valueOf(jTextField_firstValue.getText());
        double secondValue = Double.valueOf(jTextField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.mod();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");



    


    }
}