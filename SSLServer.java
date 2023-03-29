import javax.net.ssl.*;
import java.io.*;

public class SSLServer
{
    public static void main(String[] args) throws Exception
    {
            SSLServerSocketFactory server = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket ss = (SSLServerSocket) server.createServerSocket(9999);
            
            while(true)
            {
                SSLSocket client = (SSLSocket) ss.accept();
                InputStream in = client.getInputStream();
                OutputStream out = client.getOutputStream();
                in.transferTo(out);
                in.close();
                out.close();
                client.close();
            }

    }
}