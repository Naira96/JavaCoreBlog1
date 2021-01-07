package bookExample.chapter10;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException();
        e.initCause(new ArithmeticException("prichina"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}