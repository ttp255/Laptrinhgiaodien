
public class FindModel {
    private String document;
    private String keyWord;
    private String result;
    public FindModel() {
        this.document = "";
        this.keyWord = "";
        this.result = "";
    }
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    public String getKeyWord() {
        return keyWord;
    }
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public void Find(){
        int count=0;
        int index=0;
        while(true){
            int i=this.document.indexOf(this.keyWord,index);
            if(i==-1){
                break;
            }else{
                count++;
                index=i+1;
            }
            
        }
        this.result="Ket qua co: "+count+" "+this.keyWord;
        
    }
    
}