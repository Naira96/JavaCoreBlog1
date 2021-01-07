package bookExample.chapter7;

public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15;
        int b = 20;
       ob.meth(a,b);
        System.out.println(a + " " + b);
        Test1 ob1 = new Test1(15,20);
        ob.meth(ob1);
        System.out.println(ob1.a +" " + ob1.b);
    }
}
