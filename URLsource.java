import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLsource 
{
    public static void main(String[] args) throws IOException 
    {
        URL url = new URL("https://www.example.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = reader.readLine()) != null) 
        {
            System.out.println(line);
        }
        reader.close();
    }
}
