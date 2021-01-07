package arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int array[] = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        //1. tpel bolor elementner@
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        //2. tpel zuyg elementner@
        System.out.print(" zuyg ");
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        //3. tpel kent tver@
        System.out.print(" kent ");
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
        //4,5. tpel elementneri gumar@,tpel mijin tvabanakan@
        int result = 0;
        for (int i = 0; i < 10; i++)
            result = result + array[i];
        {
            System.out.println(result);

        }
        {
            System.out.println((double) result / 10);

        }
        System.out.println();
        //6. tpel zuyg elementneri qanak@
        int count = 0;
        for (int i = 0; i < 10; i++)
            if (array[i] % 2 == 0)
                count += 1;
        {
            System.out.println(count);

        }
        System.out.println();
        //7. tpel kent elementneri qanak@
        count = 0;
        for (int i = 0; i < 10; i++)//i++-inkriment, i--_dekriment
            if (array[i] % 2 == 1)
                count += 1;//nuynn e inch-  num+=1
        {
            System.out.println(count);

        }
        System.out.println();
        //8. tpel amenamec element@
        int maxValue;
        maxValue = array[0];
        for (int i = 0; i < array.length; i++)
            if (maxValue < array[i])
                maxValue = array[i];
        {
            System.out.println("maxValue=" + maxValue);

        }
        System.out.println();

        //9.tpel amenapoqr element@

        int minValue = array[0];
        for (int i = 0; i < array.length; i++)
            if (minValue > array[i])
                minValue = array[i];
        {
            System.out.println("minValue=" + minValue);

        }
    }
}

