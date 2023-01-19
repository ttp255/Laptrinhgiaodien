import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class ThucDonController implements ActionListener{
    private ThucDonView thucDonView;

    public ThucDonController(ThucDonView thucDonView) {
        this.thucDonView = thucDonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String monChinh=thucDonView.jComboBox_monChinh.getSelectedItem().toString();
        String monPhu="";
      Object[] luaChonMonPhu=thucDonView.list_monPhu.getSelectedValues();
      for(Object o:luaChonMonPhu){
        monPhu=monPhu+o.toString()+";";
      }
        
        // String monChinh="";

        // Enumeration<AbstractButton> button_monChinh=thucDonView.buttonGroup.getElements();
        // while(button_monChinh.hasMoreElements()){
        //     AbstractButton b=button_monChinh.nextElement();
        //     if(b.isSelected()){
        //         monChinh=b.getText();
        //     }
        
        // }
        // String monPhu="";
        // for(AbstractButton b:thucDonView.list_button_monPhu){
        //     if(b.isSelected()){
        //         monPhu=monPhu+b.getText()+";";
        //     }
        // }
        thucDonView.thucDonModel.setLuachon_monChinh(monChinh);
        thucDonView.thucDonModel.setLuachon_monPhu(monPhu);
        thucDonView.thucDonModel.TinhTongTien();
        thucDonView.hienThiKeTQua();

            String soTien_string= JOptionPane.showInputDialog(thucDonView, 
                thucDonView.jLabel_thongtin.getText()+
                "\nInput payment",
                "Anouncement",
                JOptionPane.PLAIN_MESSAGE
            );
            try {
                double soTien=Double.valueOf(soTien_string);
                JOptionPane.showMessageDialog(thucDonView, "Last payment: "+(soTien-thucDonView.thucDonModel.getTongTien()),
                    "Infor",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } catch (Exception e2) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(thucDonView,"Data is error!!!","Error"
                ,JOptionPane.ERROR_MESSAGE
                 );
            }

    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new ThucDonView();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
