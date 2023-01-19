import javax.swing.JFrame;

public class MyWindow extends JFrame{
    public  MyWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void ShowIt(){
        this.setVisible(true);
    }
    public void ShowIt(String Title){
       
        this.setTitle(Title);
        this.setVisible(true);
    }
    public void ShowIt(String Title,int x,int y){
       
        this.setTitle(Title);
        this.setLocation(x,y);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        MyWindow m1 =new MyWindow();
        m1.ShowIt();
        MyWindow m2 =new MyWindow();
        m2.ShowIt("Window2");
        MyWindow m3 =new MyWindow();
        m3.ShowIt("Window3",600,500);
    }
    }



    

