package bookExample.chapter7;

public class PersonTest {
    //staticner@ kpahvin metaspace hishoxutyan mej
    public static void main(String[] args) {
        Person person = new Person("Poxos",56 );

        Person person2 = new Person();
        person2.setAge(22);
        person2.setName("Petros");
        System.out.println(person2.getName());
        System.out.println(person.getName());
        System.out.println(Person.COUNTRY);
        Person.meth();
    }
}
