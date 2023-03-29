public class Clone
{
    public static class Person implements Cloneable
    {
        private String name;

        public Person(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return this.name;
        }
        @Override
        public Object clone() throws CloneNotSupportedException
        {
            return super.clone();
        }
    }
    public static void main(String[] args) throws Exception
    {
        Person osoba = new Person("Mirek");
        Person osoba2 = (Person) osoba.clone();

        System.out.println(osoba2.getName());
    }
}
