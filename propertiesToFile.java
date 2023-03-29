import java.io.*;
import java.util.*;

public class propertiesToFile
{
    public static void main(String[] args) throws Exception
    {
        Properties properties = new Properties();
        properties.setProperty("siema", "eniu");
        properties.setProperty("pieniadze", "za las");
        FileOutputStream out = new FileOutputStream("nowy.properties");
        properties.store(out, "AAAAAAAA");
        out.close();
    } 
}