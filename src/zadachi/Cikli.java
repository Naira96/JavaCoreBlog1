package zadachi;

public class Cikli {
    public static void main(String[] args) {
//        //tpel 1-5 tver@
//        for (int i = 1; i < 6; i++) {
//            System.out.print(i + " ");
//
//        }
//        //tpel 5-1
//        for (int i = 5; i >0 ; i--) {
//            System.out.print(i + " ");
//
//        }

//             //tpel 3-i bazm. axyusak@
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println("3*" + i + " = " + 3*i);
//
//        }
//        //tpel 7, 14, 21,28,35,42,49,56,63,70,77,84,91,98
//
//        int i=7; while(i<=98)   {
//            System.out.print (i+" ");
//                    i+=7;
//
//        }
//        //tpel 8,16...
//        int i = 9;
//        while (i <= 90) {
//            System.out.print(i + " ");
//            i += 9;
//        }
//    //tpel 2,4,8,16,32,64,128,256
//int i=2; while(i<=256)
//        {
//            System.out.print(i +" ");
//            i*=2;
//
//    }

        /** tpel uxxankyuni
         *   * * * * *
         *   * * * * *
         *   * * * * *
         *
         **/

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        int a1 = 1;
        int a2 = 1;
        int a3;
        System.out.print(a1 + " " + a2 + " ");
        for (int i = 3; i < 11; i++) {
            a3 = a1 + a2;
            System.out.print(a3 + " ");
            a1 = a2;
            a2 = a3;

        }


    }
}