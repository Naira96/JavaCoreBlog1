package homework.methods.ArrayUtil;

public class ArrayUtil {

    void printArrayElements(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void printEvens(int array[]) {
        System.out.print("evens are: ");
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void printOdds(int array[]) {
        System.out.print("odds are: ");
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void printSum(int array[]) {
        int sum = 0;
        for (int i = 0; i < 10; i++)
            sum = sum + array[i];
        {
            System.out.println(sum);

        }
    }

    int average(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    void printMin(int array[]) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++)
            if (minValue > array[i])
                minValue = array[i];
        {
            System.out.println("minValue=" + minValue);

        }
    }

    void printMax(int array[]) {
        int maxValue;
        maxValue = array[0];
        for (int i = 0; i < array.length; i++)
            if (maxValue < array[i])
                maxValue = array[i];
        {
            System.out.println("maxValue=" + maxValue);
        }
    }

    void printCountEvens(int array[]) {
        int count = 0;
        for (int i = 0; i < 10; i++)
            if (array[i] % 2 == 0)
                count += 1;
        {
            System.out.println(count);
        }
    }

    void printCountOdds(int array[]) {
        int count = 0;
        for (int i = 0; i < 10; i++)
            if (array[i] % 2 == 1)
                count += 1;
        {
            System.out.println(count);

        }
    }
}
