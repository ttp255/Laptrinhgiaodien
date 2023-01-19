import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuMouseListener implements MouseListener{
    private MenuExample menuExample;

    public MenuMouseListener(MenuExample menuExample) {
        this.menuExample = menuExample;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
      if(e.isPopupTrigger()){
        this.menuExample.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
      }
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.isPopupTrigger()){
            this.menuExample.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
          }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
