import java.util.Arrays;

public class SortArg
{
    public static void main(String[] args)
    {
        Arrays.sort(args);
        for(String arg : args)
        {
            System.out.println(arg);
        }

    }
}
