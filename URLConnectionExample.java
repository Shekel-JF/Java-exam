import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConnectionExample
{ 
    public static void main(String[] args) throws Exception
    {
        URL url = new URL("https://www.google.com");
        URLConnection connection = url.openConnection();
        Scanner scanner = Scanner(connection.getInputStream());

        while (scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    
}
