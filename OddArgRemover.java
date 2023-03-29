import java.io.*;
import java.util.*;
public class OddArgRemover
{ 
    public static void main(String[] args) throws Exception
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext())
        {
            Integer temp = iterator.next();
            if(temp%2 ==1)
            {
                iterator.remove();
            }
        }
        for(Integer tmp : list)
        {
            System.out.println(tmp);
        }
        
    }

    
}
