package bookExample.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a: " + a);
            int b = 42 /a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("0-i bajanum@:" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Masivi indexi exception: " + e);
        }
        System.out.println("try/catch-i blokic heto. ");
    }
}
