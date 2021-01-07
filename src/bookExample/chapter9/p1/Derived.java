package bookExample.chapter9.p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("konstruktor podklassa");
        System.out.println("n = " + n);
       // System.out.println("n_pri ="4 + n_pri); hasaneli e miayn ir klassum
        System.out.println("n_pro =" + n_pro);
        System.out.println("n_pub =" + n_pub);
    }
}
