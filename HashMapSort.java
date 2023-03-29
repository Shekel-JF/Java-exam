import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class HashMapSort
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("D", 13);
        map.put("B", 2);
        map.put("X", 7);

       
        Map<String, Integer> sortedmap = new TreeMap(map);

        for(Map.Entry<String, Integer> element : sortedmap.entrySet())
        {
            System.out.println(element.getKey() + ":" + element.getValue());
        }

    }
    
}
