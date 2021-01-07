package bookExample.chapter9.p2;

import bookExample.chapter9.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("konstruktor, unasledovanni iz drugovo paketa");
//        System.out.println("n = " + n);   hasaneli e nuyn classum kam papki mek
//        System.out.println("n_pri = " + n_pri);   hasaneli e nuyn classum
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }

}
