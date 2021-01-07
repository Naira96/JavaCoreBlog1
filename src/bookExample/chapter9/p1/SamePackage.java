package bookExample.chapter9.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("konstruktor iz togo je samogo paketa");
        System.out.println("n = " + p.n);
        //System.out.println("n_pri = " + p.pri);
        System.out.println("n_pro " + p.n_pro);
        System.out.println("n_pub " + p.n_pub);
    }
}
