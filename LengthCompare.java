import java.io.*;
import java.util.*;

public class LengthCompare
{ 
    public static void main(String[] args) throws Exception
    {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("2352525232235");
        list.add("38923");
        list.add("3252938y92853");
        list.add("59289522353250952280238");

        Collections.sort(list, Comparator.comparing(String::length));

        for(String tmp : list)
        {
            System.out.println(tmp);
        }
        
    }

    
}
