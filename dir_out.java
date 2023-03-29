import java.io.*;

public class dir_out
{
    public static void main(String[] args) throws Exception
    {
        Process process = Runtime.getRuntime().exec("cmd.exe /c dir");
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;

        while((line = reader.readLine()) != null)
        {
            System.out.println(line);
        }
        reader.close();
    } 
}