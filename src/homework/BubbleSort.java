package homework;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {13, 56, 12, 11, 0, -5, 23, -11, 26, 32};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1; j < array.length - i; j++) {
//                if (array[j] < array[j - 1]) {
//                    int temp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        System.out.println();
        int tmp = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j-1]){
                    tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
