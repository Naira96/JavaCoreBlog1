package bookExample.chapter10;

public class Exc1 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Vipolnenie ne budet");
        } catch (ArithmeticException e) {
            System.out.println("0-i bajanum");
        }
        System.out.println("catch-ic heto");
    }
}
