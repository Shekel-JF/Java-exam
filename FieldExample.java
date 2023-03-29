import java.lang.reflect.Field;

public class FieldExample
{
    private int privateVariable = 42;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException
    {
        privatereflect example = new privatereflect();
        Field privateField = example.getClass().getDeclaredField("privateVariable");
        privateField.setAccessible(true);
        privateField.setInt(example, 69);
        System.out.println(example.privateVariable);
    }
}
