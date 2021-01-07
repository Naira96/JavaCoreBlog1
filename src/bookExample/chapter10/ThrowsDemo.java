package bookExample.chapter10;

public class ThrowsDemo {
 static void throwOne() throws IllegalAccessException {
     System.out.println("throwOne-i marmin@");
     throw  new IllegalAccessException("demonstacia");
 }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
    }
}
