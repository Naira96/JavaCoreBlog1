package bookExample.chapter7;

public class Person {
    //model tesaki class, person, student...
    public final static String COUNTRY = "Armenia";   // country = "Armenia";

    private String name;
    private int age;
//    static {                            //ete erkar ban pti grenq kgrenq blokov
//        country = "Armenia";            //ete che verev@
//    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(){
    }
    public static void meth() {
    //    System.out.println(country);
        System.out.println("kuku");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
