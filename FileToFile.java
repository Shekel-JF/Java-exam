import java.io.*;

public class FileToFile
{
    public static void main(String[] args) throws IOException
    {
        File sourceFile = new File("file.txt");
        File targetFile = new File("filewritten.txt");
        BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile));

        String line;

        while((line = reader.readLine()) != null)
        {
            writer.write(line);
            writer.newLine();
        }

    }
}
