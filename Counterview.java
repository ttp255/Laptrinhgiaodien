import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class Counterview extends JFrame {
        private Countermodel countermodel;
        private JButton jbutton_up;
        private JButton jbutton_down;
        private JLabel jlabel_value;
        private JButton jbutton_reset;
        
        public Counterview() {
            this.countermodel = new Countermodel();
            this.init();
            this.setVisible(true);

        
        }

        private void init() {
            this.setTitle("Counter");
            this.setSize(300,300);
            this.setLocationRelativeTo(null);
             ActionListener ac = new CounterListener(this);
            
           
             jbutton_up = new JButton("UP");
            jbutton_up.addActionListener(ac);
             jbutton_down =new JButton("DOWN");
            jbutton_down.addActionListener(ac);
           jlabel_value = new JLabel(this.countermodel.getValue()+"",JLabel.CENTER);
            jbutton_reset = new JButton("RESET");
            jbutton_reset.addActionListener(ac);
           JPanel jp= new JPanel();
            jp.setLayout(new BorderLayout());
            jp.add(jbutton_up,BorderLayout.WEST);
            jp.add(jbutton_down,BorderLayout.EAST);
            jp.add(jlabel_value,BorderLayout.CENTER);
            jp.add(jbutton_reset,BorderLayout.SOUTH);


            this.setLayout(new BorderLayout());
            this.add(jp,BorderLayout.CENTER);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        }
        public void increasement(){
            this.countermodel.increasement();
            this.jlabel_value.setText(this.countermodel.getValue()+"");

        }
        public void decreasement(){
            this.countermodel.decreasement();
            this.jlabel_value.setText(this.countermodel.getValue()+"");

        }
        public void reset(){
            this.countermodel.reset();
            this.jlabel_value.setText(this.countermodel.getValue()+"");
        }


    }