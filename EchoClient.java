import java.net.*;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
public class EchoClient
{
    public static void main(String[] args) throws Exception
    {
        Socket client = new Socket("localhost", 2555);
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        InputStream in = client.getInputStream();
        OutputStream out = client.getOutputStream();
        out.write(message.getBytes());
        in.transferTo(System.out);
        
        client.close();
        in.close();
        out.close();
        scanner.close();
    }  
}
