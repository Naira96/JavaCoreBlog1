package homework.methods.ArrayUtil;

import homework.methods.ArrayUtil.ArrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int array[] = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        au.printArrayElements(array);
        au.printEvens(array);
        au.printOdds(array);
        au.printSum(array);
        int avg = au.average(array);
        System.out.println(avg);
        au.printMin(array);
        au.printMax(array);
        au.printCountEvens(array);
        au.printCountOdds(array);
    }
}

