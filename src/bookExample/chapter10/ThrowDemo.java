package bookExample.chapter10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demonstracia");
        } catch (NullPointerException e) {
            System.out.println("Exception e texi unenum demoproc() metodum");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("2-rd angam: " + e);
        }
    }
}
