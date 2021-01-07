package bookExample.chapter10;

public class SuperSubcatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Sxal@ Exeptioni tesak e");
        }
        //catch (ArithmeticException e) { // oshibka
        //  System.out.println("Ays kodin el chi hasni"); }
    }
}
