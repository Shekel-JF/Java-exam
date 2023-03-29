
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;
    
    public class SerializableExample
    {
        public static class Person implements Serializable
        {
            private String name;
            public Person(String name)
            {
                this.name = name;
            }
        }

        public static void main(String[] args) throws Exception
        {
            Person osoba = new Person("Mirek");

            FileOutputStream out = new FileOutputStream("object.ser");
            ObjectOutputStream ObjectOut = new ObjectOutputStream(out);

            ObjectOut.writeObject(osoba);
            out.close();
            ObjectOut.close();


        }
    }
    
