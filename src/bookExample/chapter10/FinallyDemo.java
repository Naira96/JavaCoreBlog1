package bookExample.chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("procA()-i marmin@: ");
            throw new RuntimeException("demonstraci");
        } finally {
            System.out.println("procA()-i finally blok@: ");
        }
    }
}
