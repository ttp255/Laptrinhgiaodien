import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.BorderLayout;

public class MenuExample extends JFrame{
    private JLabel jLabel;
    private JMenuBar jMenuBar;
    private JMenu jMenu_file;
    private JMenuItem jMenuItem_open;
    private JMenuItem jMenuItem_exit;
    private JMenu jMenu_Help;
    private JMenuItem jMenuItem_welcome;
      JPopupMenu jPopupMenu;
    private JToolBar jToolBar;  
 

    public MenuExample(){
        this.setTitle("Menu Example");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        MenuExampleListener menuExampleListener =new MenuExampleListener(this);
        
        
       
       jMenuBar =new JMenuBar();
        jMenu_file=new JMenu("File");
       jMenu_file.setMnemonic(KeyEvent.VK_F);
       jMenu_file.setDisplayedMnemonicIndex(0);
       
        JMenuItem jmenu_new=new JMenuItem("New",KeyEvent.VK_N);
       jMenu_file.add(jmenu_new);
       jmenu_new.addActionListener(menuExampleListener);
        jmenu_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

    jMenuItem_open=new JMenuItem("Open",KeyEvent.VK_O);
       jMenuItem_open.addActionListener(menuExampleListener);
       jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        jMenuItem_exit=new JMenuItem("Exit",KeyEvent.VK_X);
       jMenuItem_exit.addActionListener(menuExampleListener);
       jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));


        jMenu_file.add(jmenu_new);
        jMenu_file.addSeparator();

        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);
        jMenu_Help =new JMenu("Help");
        jMenu_Help.setMnemonic(KeyEvent.VK_H);
        jMenu_Help.setDisplayedMnemonicIndex(0);
        
         jMenuItem_welcome=new JMenuItem("Welcome",KeyEvent.VK_W);
        jMenuItem_welcome.addActionListener(menuExampleListener);
        jMenuItem_welcome.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK));
        jMenu_Help.add(jMenuItem_welcome);

        JMenu jMenu_view=new JMenu("View");
        JCheckBoxMenuItem jCheckBoxMenuItem_toolbar=new JCheckBoxMenuItem("Toolbar");
       jCheckBoxMenuItem_toolbar.addActionListener(menuExampleListener);
       jMenu_view.add(jCheckBoxMenuItem_toolbar);

       jMenuBar.add(jMenu_file);
       jMenuBar.add(jMenu_view);
       
        jMenuBar.add(jMenu_Help);
        this.setJMenuBar(jMenuBar);
        Font font =new Font("Arial",Font.BOLD,50);
        jLabel =new JLabel();
        jLabel.setFont(font);
        
         jToolBar =new JToolBar();
        JButton jButton_undo=new JButton("Undo");
        jButton_undo.addActionListener(menuExampleListener);
        jButton_undo.setToolTipText("Nhan nut nay de quay lai ");
        JButton jButton_continue=new JButton("Continue");
        jButton_continue.setToolTipText("Nhan nut nay de tiep tuc");
        jButton_continue.addActionListener(menuExampleListener);
         JButton jButton_cut=new JButton("Cut");
         jButton_cut.addActionListener(menuExampleListener);
        jButton_cut.setToolTipText("Nhan nut nay de di chuyen");
        
         JButton jButton_copy=new JButton("Copy");
         jButton_copy.addActionListener(menuExampleListener);
        jButton_copy.setToolTipText("Nhan nut nay de sao chep");
         JButton jButton_paste=new JButton("Paste");
         jButton_paste. addActionListener(menuExampleListener);
        jButton_paste.setToolTipText("Nhan nut nay de dan");
        jToolBar.add(jButton_undo);
        jToolBar.add(jButton_continue);
        jToolBar.add(jButton_cut);
        jToolBar.add(jButton_copy);
        jToolBar.add(jButton_paste);

          jPopupMenu=new JPopupMenu();
          JMenu jMenuPopupFont=new JMenu("Font");
          JMenuItem jMenuItem_size=new JMenuItem("Size");
          JMenuItem jMenuItem_type=new JMenuItem("Type");
          jMenuPopupFont.add(jMenuItem_size)  ;
          jMenuPopupFont.add(jMenuItem_type);


          JMenuItem jMenuItem_cut=new JMenuItem("Cut");
          JMenuItem jMenuItem_copy=new JMenuItem("Copy");
          JMenuItem jMenuItem_paste=new JMenuItem("Paste");
          jPopupMenu.add(jMenuPopupFont);
            jPopupMenu.addSeparator();
            jPopupMenu.add(jMenuItem_cut);
            jPopupMenu.add(jMenuItem_copy);
            jPopupMenu.add(jMenuItem_paste);

            jMenuItem_size.addActionListener(menuExampleListener);
            jMenuItem_type.addActionListener(menuExampleListener);
            jMenuItem_cut.addActionListener(menuExampleListener);
            jMenuItem_copy.addActionListener(menuExampleListener);
            jMenuItem_paste.addActionListener(menuExampleListener);
           
           


      MenuMouseListener menuMouseListener =new MenuMouseListener(this);


      this.addMouseListener(menuMouseListener);

        this.add(jPopupMenu);
      
        this.setLayout(new BorderLayout());

        this.add(jLabel,BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void setStringText(String s){
        this.jLabel.setText(s);
    }
    public void enableToolbar(){
      this.add(jToolBar,BorderLayout.NORTH);
      this.refresh();
    }
    public void removeToolbar(){
      this.remove(jToolBar);
      this.refresh();
    }
    public void refresh(){
      this.pack();
      this.setSize(500,500);
    }
}
