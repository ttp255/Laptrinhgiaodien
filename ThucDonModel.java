import java.util.StringTokenizer;

public class ThucDonModel {
    private String Luachon_monChinh;
    private  String Luachon_monPhu;
    private double TongTien;
    public ThucDonModel() {
        this.Luachon_monChinh="";
        this.Luachon_monPhu="";
        this.TongTien=0;
        


    }
    public String getLuachon_monChinh() {
        return Luachon_monChinh;
    }
    public void setLuachon_monChinh(String luachon_monChinh) {
        Luachon_monChinh = luachon_monChinh;
    }
    public String getLuachon_monPhu() {
        return Luachon_monPhu;
    }
    public void setLuachon_monPhu(String luachon_monPhu) {
        this.Luachon_monPhu = luachon_monPhu;
    }
    public double getTongTien() {
        return TongTien;
    }
    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }
    public void TinhTongTien() {
        this.TongTien=0;
        if(this.Luachon_monChinh=="COM"){
            TongTien+=25000;

        }else if(this.Luachon_monChinh=="BUN BO"){
            TongTien+=30000;
        }else if(this.Luachon_monChinh=="HU TIEU"){
            TongTien+=35000;
        }else if(this.Luachon_monChinh=="MI QUANG"){
            TongTien+=23000;
        }
        StringTokenizer stk=new StringTokenizer(Luachon_monPhu,";" );
        while(stk.hasMoreTokens()){ 
            String monPhu=stk.nextToken();
            if(monPhu.equals("TRA SUA")){
                TongTien+=50000;
            }else if(monPhu.equals("CAFE")){
                TongTien+=20000;
            }else if(monPhu.equals("PIZZA")){
                TongTien+=60000;
            }else if(monPhu.equals("KFC")){
                TongTien+=100000;
            }
        }
    }
}
