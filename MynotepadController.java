import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

public class MynotepadController implements Action{
    private MynotepadView mynotepadView;
    public MynotepadController(MynotepadView mynotepadView) {
        this.mynotepadView = mynotepadView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String src=e.getActionCommand();
        JFileChooser fc= new JFileChooser();
        if(src.equals("Open")){
            int  returnVal=fc.showOpenDialog(this.mynotepadView);
            if(returnVal== JFileChooser.APPROVE_OPTION){
                File file =fc.getSelectedFile();
                String fileName=file.getName();
                this.mynotepadView.mynotepadModel.setFileName(file.getAbsolutePath());
                this.mynotepadView.lblNewLabel.setText(this.mynotepadView.mynotepadModel.getFileName());
                if(fileName.endsWith(".txt")){
                    try {
                        List<String> allText=Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
                        String resutl="";
                        
                        for(String line:allText){
                            resutl+=line;
                            resutl+="\n";
                        }
                        // if(resutl.endsWith("\n")){
                        //     resutl+="\b";
                        // }

                        
                        
                        this.mynotepadView.mynotepadModel.setContent(resutl);
                        this.mynotepadView.textArea.setText(this.mynotepadView.mynotepadModel.getContent());
                    } catch (Exception e1) {
                        // TODO: handle exception
                        e1.printStackTrace();
                    }
                }
            }
           
        }else if(src.equals("Save")){
            if(this.mynotepadView.mynotepadModel.getFileName().length()>0){
                Save(this.mynotepadView.mynotepadModel.getFileName());
            }else{
                int returnVal=fc.showSaveDialog(this.mynotepadView);
                if(returnVal== JFileChooser.APPROVE_OPTION){
                    File file =fc.getSelectedFile();
                    Save(file.getAbsolutePath());
                }
            }
        }
    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
    public void Save(String fileName){
        try {
            PrintWriter pw=new PrintWriter(fileName,"UTF-8");
            String data=this.mynotepadView.textArea.getText();
            pw.print(data);
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e1) {
            // TODO: handle exception
            e1.printStackTrace();
        }catch(UnsupportedEncodingException e1){
            e1.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MynotepadView();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
