package bookExample;

import java.util.Arrays;

public class Chapter5 {
    public static void main(String[] args) {
//        //ForEach
//        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum = 0;
////        for (int x : nums) {
////            System.out.println("znachenie ravno" + x);
////            sum += x;
////        }
////        System.out.println(sum);
//
//        for (int x : nums) {
//            System.out.println("znachenoe ravno" + x);
//            sum += x;
//            if (x == 5) break;
//        }
//        System.out.println("summa ravno" + sum);
//        for (int i = 0; i < 6; i++)
//            switch (i) {
//                case 0:
//                    System.out.println("i ravno 0");
//                    break;
//                case 1:
//                    System.out.println("i ravno 1");
//                    break;
//                case 2:
//                    System.out.println("i ravno 2");
//                    break;
//                case 3:
//                    System.out.println("i ravno 3");
//                    break;
//                default:
//                    System.out.println("i bolshe 3");
//            }
//        String str = "dva";
//        switch (str) {
//            case "odin":
//                System.out.println("odin");
//                break;
//            case "dva":
//                System.out.println("dva");
//                break;
//            case "tri":
//                System.out.println("tri");
//                ;
//                break;
//            default:
//                System.out.println("ne sovpalo");
//                break;
//        }
//        int i, j;
//        i = 100;
//        j = 200;
//        while (++i < --j) ;
//        System.out.println("srednee znacheniya =" + i);
//        int n = 10;
//        do {
//            System.out.println("takt" + n);
//             }
//            while (--n>0);
//            throws java.io.IOException {
//        char choice;
//        do {
//            System.out.println("Sprovko po operatoru");
//            System.out.println("   1. if");
//            System.out.println("   2. switch");
//            System.out.println("   3. while");
//            System.out.println("   4. do-while");
//            System.out.println("   5. for\n");
//            System.out.println("Viberite nujnie punkt:");
//            choice = (char) System.in.read();
//        } while (choice < '1' || choice > '5');
//        {
//            System.out.println("\n");
//        }
//        switch (choice) {
//            case '1':
//                System.out.println("if: \n");
//                System.out.println("if(ycлoвиe) оператор;");
//                System.out.println("else оператор;");
//                break;
//            case '2':
//                System.out.println("switch:\n");
//                System.out.println("switсh(выражение) {");
//                System.out.println(" case константа:");
//                System.out.println(
//                        " последовательность операторов");
//                System.out.println(" break;");
//                System.out.println(" / / ... ");
//                System.out.println("}");
//                break;
//            case '3':
//                System.out.println("while:\n");
//                System.out.println("while(ycлoвиe) оператор;");
//                break;
//            case '4':
//                System.out.println("do-while:\n");
//                System.out.println("do {");
//                System.out.println(" оператор;");
//                System.out.println("} while (условие);");
//                break;
//            case '5':
//                System.out.println("for:\n");
//                System.out.print("for(инициaлизaция; условие; итерация)");
//                System.out.println(" оператор;");
//                break;
//        }
        //parz tvi voroshum
//        int num;
//        boolean isPrime = false;
//        num = 11;
//        if (num < 2) isPrime = false;
//        else isPrime = true;
//        for (int i = 2; i <= num / i; i++)
//            if ((num % i) == 0) {
//                isPrime = false;
//                break;}
//                if (isPrime)
//                    System.out.println("Пpocтoe число");
//                else
//                    System.out.println("He простое число");
//        int sum = 0;
//        int nums[][] = new int[3][5];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                nums [i][j] = (i+1) * (j+1);
//            }
//        }
//        for (int x[]:nums) {
//            for (int y : x) {
//                System.out.println("znachenie ravno" + y);
//                sum += y;
//            }
//        }
//        System.out.println("summa=" + sum);
        int nums[] = {3, 7, 13, 5, 0, -9};
        int val = 5;
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (val == 5) {
                found = true;
                break;
            }
        } if (found)
            System.out.println("Znacheniya naydeno!");
    }
}
