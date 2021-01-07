package bookExample.chapter9.p2;

import bookExample.chapter9.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("konstruktor iz drugogo paketa");
//        System.out.println("n = " + p.n);   nuyn classum kam paketum e hasaneli
//        System.out.println("n_pri = " + p.n_pri);  miayn nuyn classum e hasaneli
//        System.out.println("n_pro = " + p.n_pro);   miayn nuyn klassum,podclassum, kam paketum
        System.out.println("n_pub" + p.n_pub) ;
    }
}
