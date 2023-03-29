import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args)
    {
        Locale.setDefault(new Locale("fr", "FR"));
        ResourceBundle bundle = ResourceBundle.getBundle("messages");
        String hello = bundle.getString("hello");
        System.out.println(hello);
        
    }
}
