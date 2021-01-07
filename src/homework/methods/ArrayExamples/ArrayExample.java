package homework.methods.ArrayExamples;

public class ArrayExample {
    void isExists(int numbers[], int x) {
        boolean containsValue = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                containsValue = true;
            }
        }
        System.out.println(containsValue);
    }

    void findIndex(int numbers[],int x) {
        int index = x;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                index = i;
            }
        }
        System.out.println(index);
    }

    void printValueByIndex(int numbers[],int x) {
        int index = x;
        if (index >= 0 && index < numbers.length) {
            System.out.println(numbers[index]);
        }
    }

    void printRepeatedValue(int numbers[]) {
        for (int j = 0; j < numbers.length; j++) {
            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " is repeated" + " ");
                }
            }
        }
        System.out.println();
    }

    void bubbleSortMinMax(int numbers[]) {
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
    }

    void bubbleSortMaxMin(int numbers[]) {
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
    }

    void secMax(int numbers[]) {
        int max = numbers[0];
        int secondmax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                secondmax = max;
                max = numbers[i];
            } else {
                if (numbers[i] != max && numbers[i] > secondmax) {
                    secondmax = numbers[i];
                }
            }
        }
        System.out.println(secondmax);
    }
}
