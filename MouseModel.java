public class MouseModel {
    private int x;
    private int y;
    private int cout;
    private String checkin;
    public MouseModel() {
        this.x=0;
        this.y=0;
        this.checkin="no";
        
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String getCheckin() {
        return checkin;
    }
    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }
    public void click(){
        this.cout++;
    }
    public void enter(){
        this.checkin="yes";

    }
    public void exit(){
        this.checkin="no";
    }
    public void addClick(){
        this.cout++;
    }
    public int getCout() {
        return cout;
    }
    public void setCout(int cout) {
        this.cout = cout;
    }
    
}
