import java.lang.reflect.*;

    public class AnotherReflectExample
    {
        public void reflectMethod(String argument)
        {
            System.out.println(argument);
        }
        public static void main(String[] args)
        {
            try
            {
                ReflectExample example = new ReflectExample();
                Class<?> cls = example.getClass();
                Method metoda = cls.getDeclaredMethod("reflectMethod", String.class);
                metoda.invoke(example, "Hello");
            }
                catch(Exception e)
            {
                e.printStackTrace();
            }
        }    
    }    
