package garen.java.demo.demo18.ReflectDemo;

public class ReflectTest {
    public static void main (String[] args) throws Exception {

        Class cls1 = Class.forName("garen.java.demo.demo18.ReflectDemo.Person");
        System.out.println(cls1);

        Class cls2 = Person.class;
        System.out.println(cls2);

        Class cls3 = new Person().getClass();
        System.out.println(cls3);

        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);

    }
}
