package repeatHomew;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] array = {10, 50, 66, 41, 10, 44, 13, 66};
        int max = array[0];
        int secMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secMax = max;
                max = array[i];
            } else {
                if (array[i] != max && secMax < array[i]) {
                    secMax = array[i];
                }
            }
        }
        System.out.println(secMax);
    }
}
