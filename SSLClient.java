import javax.net.ssl.*;
import java.io.*;
import java.util.*;
public class SSLClient
{
    public static void main(String[] args) throws Exception
    {
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket client = (SSLSocket) factory.createSocket("localhost", 9999);
        OutputStream out = client.getOutputStream();
        String message = "Hello";
        out.write(message.getBytes());

        InputStream in = client.getInputStream();
        in.transferTo(System.out);
        out.close();
        client.close();

    }
}