package bookExample.chapter9.interfaceEXample2;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10)) {
            System.out.println("Chislo 10 neotricatelnoe");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("Eto ne budet vivedeno");
        }
    }
}
