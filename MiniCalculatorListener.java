import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;


public class MiniCalculatorListener implements ActionListener{
    private MiniCaculatorView miniCaculatorView;

    

   public MiniCalculatorListener(MiniCaculatorView miniCaculatorView) {
        this.miniCaculatorView = miniCaculatorView;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
       String src =e.getActionCommand();
       if(src.equals("+")){
            this.miniCaculatorView.plus();
       }else  if(src.equals("-")){
            this.miniCaculatorView.minus();

        }else  if(src.equals("*")){
            this.miniCaculatorView.multiply();
            
        }else  if(src.equals("/")){
            this.miniCaculatorView.divide();
            
        }else  if(src.equals("^")){
            this.miniCaculatorView.pow();
            
        }else  if(src.equals("%")){
            this.miniCaculatorView.mod();
            
        }
      
    }
    public static void main(String[] args) {
       
         try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MiniCaculatorView();
        }  catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}