package homework.methods.ArrayExamples;

import org.w3c.dom.ls.LSOutput;

public class ArrayExamples {
    public static void main(String[] args) {
        int numbers[] = {10, -2, 60, 0, -6, 10, 60, 11, 25, 44};
        // 1. if numbers[] contains 44 value,print true, else false
        int x = 44;
        boolean containsValue = false; // karox enq dnel isExists anun@
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 44) {
                containsValue = true;
            }
        }
        System.out.println(containsValue);
        //2. if there is 44 value, print Index Of Value 44, else -1
        x = 44;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                index = i;
            }
        }
        System.out.println(index);
        int index44 = 0;
        containsValue = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 44) {
                containsValue = true;
                index44 = i;
            }
        }
        if (containsValue) {
            System.out.println(index44);
        } else {
            System.out.println("-1");
        }

        //3. print numbers[index]
        index = 4;                        //cikl@ petq che
        System.out.println(numbers[index]);

        //4. find repeated numbers,print them
        for (int j = 0; j < numbers.length; j++) {
            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " is repeated" + " ");
                }
            }
        }
        //5.bubble-sort from min to max
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                int temp = numbers[j];
                if (numbers[j] < numbers[j - 1]) {
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //6. bubble-sort from max to min
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                int temp = numbers[j];
                if (numbers[j] > numbers[j - 1]) {
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //7. print second maxValue
        int max = numbers[0];
        int secondMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                secondMax = max;
                max = numbers[i];
            } else {
                if (numbers[i] != max && numbers[i] > secondMax) {
                    secondMax = numbers[i];
                }
            }
        }
        System.out.println(secondMax);
    }
}