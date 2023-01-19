import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;

public class CounterListener  implements ActionListener{
    private Counterview ctv;

    public CounterListener (Counterview ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String src= e.getActionCommand();
        System.out.println("Ban da nhan "+src);
        if(src.equals("UP")){
            this.ctv.increasement();

        }else if(src.equals("DOWN")){
            this.ctv.decreasement();

        }else{
            this.ctv.reset();
        }
        
        }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            Countermodel ct= new Countermodel();
            Counterview cv= new Counterview();
        } catch ( Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }
}