import java.lang.reflect.Method;
public class MethodExample
{
    public static void main(String[] args)
    {
        Class<?> clazz = Object.class;
        Method[] methods = clazz.getDeclaredMethods();

        for(Method method : methods)
        {
            System.out.println(method.getName());
        }
    }
}