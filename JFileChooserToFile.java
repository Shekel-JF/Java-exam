import javax.swing.*;
import java.io.*;

public class JFileChooserToFile
{
    public static void main(String[] args) throws Exception
    {
        JFileChooser choose = new JFileChooser();
        int result = choose.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File file = choose.getSelectedFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Hello there");
            writer.close();
            JOptionPane.showMessageDialog(null, "Wrote to file");
        }
    }
}