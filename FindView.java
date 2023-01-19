import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

public class FindView extends JFrame{
    private FindModel findModel;
    private JTextArea jTextArea_document;
    private JTextField jTextField_keyWord;
    private JLabel jLabel_result;
        public FindView() {
        this.findModel =new FindModel();
        this.init();
    }
    private void init() {
        this.setTitle("Find");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font =new Font("Arial",Font.BOLD,40);
        JLabel jLabel_document=  new JLabel("Van Ban",JLabel.CENTER);
        jLabel_document.setFont(font);
        jTextArea_document=new JTextArea();
        jTextArea_document.setFont(font);

        JScrollPane jScrollPane =new JScrollPane(jTextArea_document,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);




        JLabel jLabel_keyWord= new JLabel("Tu khoa",JLabel.CENTER);
        jLabel_keyWord.setFont(font);
         jTextField_keyWord= new JTextField();
        jTextField_keyWord.setFont(font);
        FindListener findListener =new FindListener(this);

        JPanel jp1 =new JPanel();
        jp1.setLayout(new GridLayout(2,2,20,20));
        JButton jButton_statistic= new JButton("Thong ke ");
        jButton_statistic.setFont(font); 
        jButton_statistic.addActionListener(findListener);
        jButton_statistic.setBackground(Color.GREEN);
        jButton_statistic.setOpaque(true);
        jButton_statistic.setBorderPainted(false);
          jLabel_result =new JLabel();
        jLabel_result.setFont(font);
        jLabel_result.setBackground(Color.RED);
        jLabel_result.setOpaque(true);
         jp1.add(jLabel_keyWord);
         jp1.add(jTextField_keyWord);
         jp1.add(jButton_statistic);
         jp1.add(jLabel_result);
        
        
        
        
         this.setLayout(new BorderLayout());
         this.add(jLabel_document,BorderLayout.NORTH);
         this.add(jScrollPane,BorderLayout.CENTER);
         this.add(jp1,BorderLayout.SOUTH);
        
        this.setVisible(true);

    





    }
    public void Find(){
        this.findModel.setDocument(this.jTextArea_document.getText());
        this.findModel.setKeyWord(this.jTextField_keyWord.getText());
        this.findModel.Find();
        this.jLabel_result.setText(this.findModel.getResult());
    }



}
