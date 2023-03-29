import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class EchoServer
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            ServerSocket ss = new ServerSocket(2555);
            while (true)
            {
                Socket client = ss.accept();
                InputStream in = client.getInputStream();
                OutputStream out = client.getOutputStream();
                in.transferTo(out);
                in.close();
                out.close();
                client.close();
            }
        }
        catch (IOException e)
        {
            System.err.println("An error has occured: " + e.getMessage());
        }
    }
}