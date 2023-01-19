import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.UIManager;

public class MouseController implements MouseListener,MouseMotionListener{
    private MouseView mouseView;
    public MouseController(MouseView mouseView) {
        this.mouseView = mouseView;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        int x=e.getX();
        int y=e.getY();
        this.mouseView.update(x, y);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouseView.click();
        
    }

    @Override
    public void mousePressed(MouseEvent e) {

        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        this.mouseView.enter();
        int x=e.getX();
        int y=e.getY();
        this.mouseView.update(x, y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        this.mouseView.exit();
    }
    public static void main(String[] args) {
      
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MouseView();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
