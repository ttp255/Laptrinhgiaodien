import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.UIManager;
public class MenuExampleListener  implements ActionListener{
    private MenuExample menuExample;
    public MenuExampleListener(MenuExample menuExample) {
        this.menuExample = menuExample;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
            String src=e.getActionCommand();
            // if(src.equals("Open")){
            //     this.menuExample.setStringText("Ban da nhan open");
            // }else if(src.equals("Exit")){
            //     this.menuExample.setStringText("Ban da nhan exit");
            //     System.exit(0);
            // }else if(src.equals("Welcome")){
            //     this.menuExample.setStringText("Ban da nhan welcome");
              
            // }else if(src.equals("New")){
            //     this.menuExample.setStringText("Ban da nhan new");
              
            // }else if(src.equals("Help")){
            //     this.menuExample.setStringText("Ban da nhan help");
              
            // }
    
            if(src.equals("Exit")){
                System.exit(0);
            }
            if(src.equals("Toolbar")){
                AbstractButton checkbox=(AbstractButton) e.getSource();
                boolean check=checkbox.getModel().isSelected();
                if(check){
                    this.menuExample.enableToolbar();
                }else{
                    this.menuExample.removeToolbar();
                }
            }else{
             
                this.menuExample.setStringText("Ban da nhan nut"+" " +src);
    
    
    
    
        }



    }
    
        public static void main(String[] args) {
     
         try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MenuExample();

        }  catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
