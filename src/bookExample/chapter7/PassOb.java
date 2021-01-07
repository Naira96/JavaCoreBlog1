package bookExample.chapter7;

public class PassOb {
    public static void main(String[] args) {
//        Test ob1 = new Test(100, 22);
//        Test ob2 = new Test(100, 22);
//        Test ob3 = new Test(-1,-1);
//        System.out.println("ob1 == ob2:" + ob1.equalTo(ob2));
//        System.out.println("ob1 == ob3:" + ob1.equalTo(ob3));
//        Test ob = new Test(15,20);
//        System.out.println("ob.a и оЬ.Ь до вызова: " +
//                ob.a + " " + ob.b);
//        ob.meth(ob);
//        System.out.println("ob.a и оЬ.Ь после вызова: " +
//                ob.a + " " + ob.b);
//    }

 Test ob1 = new Test(2);
 Test ob2;
 ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a posle vtorogo uvelicheniya znacheniya: " + ob2.a);
    }
}
