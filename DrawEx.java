import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawEx extends JPanel{
    public DrawEx(){
        this.setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.drawLine(150, 200, 300, 300);
        g.setColor(Color.CYAN);
        g.draw3DRect(500, 500, 60,60, getFocusTraversalKeysEnabled());
        g.setColor(Color.DARK_GRAY);
        g.drawOval(200, 300, 100, 100);
    }
}
