import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;


import java.awt.Color;
public class MyColorLIstener implements ActionListener {
        private MyColorView myColorView;

        public MyColorLIstener(MyColorView myColorView) {
            this.myColorView = myColorView;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
           String src =e.getActionCommand();
            if(src.equals("Red Text")){
                this.myColorView.ChangeColortext(Color.RED);
                
            }else if(src.equals("Yellow Text")){
                this.myColorView.ChangeColortext(Color.YELLOW);

            }else if(src.equals("Green Text")){
                this.myColorView.ChangeColortext(Color.GREEN);
            }else if(src.equals("Red Background")){
                this.myColorView.ChangeColorBackground(Color.RED);
            
            }else if(src.equals("Yellow Background")){
                this.myColorView.ChangeColorBackground(Color.YELLOW);
            }   else if (src.equals("Green Background")){
                this.myColorView.ChangeColorBackground(Color.GREEN);
            }
        }    
        public static void main(String[] args) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                new MyColorView();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
