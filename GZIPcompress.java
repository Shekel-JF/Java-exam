import java.io.*;
import java.util.zip.GZIPOutputStream;

public class GZIPcompress
{
    public static void main(String[] args) throws Exception
    {
        String inputString = args[0];
        String outputString = inputString + "+.gz";
        byte[] buffer = new byte[1024];

            FileInputStream fis = new FileInputStream(inputString);
            FileOutputStream outputStream = new FileOutputStream(outputString);
            GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream);
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1)
            {
                System.out.write(buffer, 0, bytesRead);
                gzipOutputStream.write(buffer, 0, bytesRead);
            }

           
            gzipOutputStream.close();
            fis.close();
            System.out.println("\nDane zostały skompresowane gzipem i zapisane do pliku.");
    }
}