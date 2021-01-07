package bookExample.chapter8.aBInhheritance;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Soderjimoe obekta superOb: ");
        superOb.showij();
        System.out.println();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Soderjimoe obekta subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Summa i,j & k v obekte subOb: ");
        subOb.sum();
    }
}
