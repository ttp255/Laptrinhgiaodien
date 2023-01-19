import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;


public class ThucDonView extends JFrame {
    public  ThucDonModel thucDonModel;
    // public JRadioButton jRadioButton_com;
    // public JRadioButton jRadioButton_bunbo;
    // public JRadioButton jRadioButton_hutieu;
    // public JRadioButton jRadioButton_miquang;
    // public ButtonGroup buttonGroup;
    // public JCheckBox jCheckBox_trasua;
    // public JCheckBox jCheckBox_cafe;
    // public JCheckBox jCheckBox_piza;
    // public JCheckBox jCheckBox_kfc;
    // public ArrayList<JCheckBox> list_button_monPhu;
    public JLabel jLabel_thongtin;
    public JComboBox<String> jComboBox_monChinh;
    public JList<String> list_monPhu;

    public ThucDonView() {
        this.thucDonModel= new ThucDonModel();
        this.init();
    }

    private void init() {
        this.setTitle("Menu");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font=new Font("Arial",Font.BOLD,40);

        JLabel jLabel_tieude=new JLabel("Thuc don TTP",JLabel.CENTER);
        jLabel_tieude.setFont(font);
        JPanel jPanel_monChinh=new JPanel();
        //jPanel_monChinh.setLayout(new GridLayout(1,4,20,20));
        jPanel_monChinh.setLayout(new FlowLayout());
        String[] cacMonChinh=new String[]{"COM","BUN BO","HU TIEU","MI QUANG"};

       
       jComboBox_monChinh=new JComboBox<String>(cacMonChinh);
       jComboBox_monChinh.setFont(font);
        jPanel_monChinh.add(jComboBox_monChinh);


        
        
        // jRadioButton_com=new JRadioButton("COM");
        // jRadioButton_com.setFont(font);
        //  jRadioButton_bunbo= new JRadioButton("BUN BO");
        // jRadioButton_bunbo.setFont(font);

        // jRadioButton_hutieu= new JRadioButton("HU TIEU");
        // jRadioButton_hutieu.setFont(font);

        //  jRadioButton_miquang= new JRadioButton("MI QUANG");
        // jRadioButton_miquang.setFont(font);
        // buttonGroup =new ButtonGroup();
        // buttonGroup.add(jRadioButton_com);
        // buttonGroup.add(jRadioButton_bunbo);
        // buttonGroup.add(jRadioButton_hutieu);
        // buttonGroup.add(jRadioButton_miquang);
        // jPanel_monChinh.add(jRadioButton_com);
        // jPanel_monChinh.add(jRadioButton_bunbo);
        // jPanel_monChinh.add(jRadioButton_hutieu);
        // jPanel_monChinh.add(jRadioButton_miquang);

        JPanel jPanel_monPhu=new JPanel();
        jPanel_monPhu.setLayout(new GridLayout(2,2,10,10));
        String[] cacMonPhu=new String[]{"TRA SUA","CAFE","PIZZA","KFC"};
        list_monPhu=new JList<String>(cacMonPhu);
        list_monPhu.setFont(font);
        jPanel_monPhu.add(list_monPhu);


        // jCheckBox_trasua=new JCheckBox("TRA SUA");
        // jCheckBox_trasua.setFont(font);
        // jCheckBox_cafe=new JCheckBox("CAFE");
        // jCheckBox_cafe.setFont(font);
        //  jCheckBox_piza=new JCheckBox("PIZZA");
        // jCheckBox_piza.setFont(font);
        // jCheckBox_kfc=new JCheckBox("KFC");
        // jCheckBox_kfc.setFont(font);
       
        //  list_button_monPhu=new ArrayList<JCheckBox>();
        // list_button_monPhu.add(jCheckBox_trasua);
        // list_button_monPhu.add(jCheckBox_cafe);
        // list_button_monPhu.add(jCheckBox_piza);
        // list_button_monPhu.add(jCheckBox_kfc);

        // jPanel_monPhu.add(jCheckBox_trasua);
        // jPanel_monPhu.add(jCheckBox_cafe);
        // jPanel_monPhu.add(jCheckBox_piza);
        // jPanel_monPhu.add(jCheckBox_kfc);




        JPanel jPanel_total=new JPanel();
        // jPanel_total.setLayout(new GridLayout(2,1));
        // jPanel_total.add(jPanel_monChinh);
        // jPanel_total.add(jPanel_monPhu);
        jPanel_total.setLayout(new BorderLayout());
        jPanel_total.add(jPanel_monChinh,BorderLayout.NORTH);
        jPanel_total.add(jPanel_monPhu,BorderLayout.CENTER);

        JPanel jPanel_thongTin=new JPanel();
        jPanel_thongTin.setLayout(new GridLayout(1,1,20,20));
        jLabel_thongtin=new JLabel();
        jLabel_thongtin.setFont(new Font("Arial",Font.BOLD,20));
        JButton jButton_total=new JButton("Tong Tien");
        jButton_total.setFont(font);

        ThucDonController thucDonController =new ThucDonController(this);
        jButton_total.addActionListener(thucDonController);
        jPanel_thongTin.add(jLabel_thongtin);
        jPanel_thongTin.add(jButton_total);
        this.setLayout(new BorderLayout());
        this.add(jLabel_tieude,BorderLayout.NORTH);
        this.add(jPanel_total,BorderLayout.CENTER);
        this.add(jPanel_thongTin,BorderLayout.SOUTH);
        this.setVisible(true);

    }

    public void hienThiKeTQua() {
        String kq="Mon Chinh: "+this.thucDonModel.getLuachon_monChinh()+";"+"Mon phu: "+this.thucDonModel.getLuachon_monPhu()
                              +"==>"+"Tong tien: "+this.thucDonModel.getTongTien();
        this.jLabel_thongtin.setText(kq);
    }               
    
}
