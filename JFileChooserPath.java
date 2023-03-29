import javax.swing;
import javax.swing.JFileChooser;

import java.io.File;
public class JFileChooserPath
{
    
    public static void main(String[] args)
    {
        JFileChooser choose = new JFileChooser();
        int result = choose.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File file = choose.getSelectedFile();
            System.out.println(file.getAbsolutePath());
        }
    }

    
}