public class MynotepadModel {
    private String fileName;
    private String content;
    public MynotepadModel() {
        this.fileName = "";
        this.content = "";
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
}
