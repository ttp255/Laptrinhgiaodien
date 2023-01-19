import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;

public class LastButtonListener implements  ActionListener{
      private  LastButtonView lastButtonView;

    public LastButtonListener(LastButtonView lastButtonView) {
        this.lastButtonView = lastButtonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String src = e.getActionCommand();
       if(src.equals("1")){
            this.lastButtonView.Changeto_1();
       }else if(src.equals("2")){
        this.lastButtonView.Changeto_2();
        
        }else if(src.equals("3")){
            this.lastButtonView.Changeto_3();
            
        }else if(src.equals("4")){
             this.lastButtonView.Changeto_4();
                
        }


      
}
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new LastButtonView();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
    
