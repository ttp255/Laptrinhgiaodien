import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;

public class FindListener implements ActionListener{
        private FindView findView;
        

        public FindListener(FindView findView) {
            this.findView = findView;
        }


        @Override
        public void actionPerformed(ActionEvent e) {
           
                this.findView.Find();
            
        }
        public static void main(String[] args) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                new FindView();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
}
