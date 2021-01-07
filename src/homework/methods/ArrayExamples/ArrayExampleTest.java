package homework.methods.ArrayExamples;

import homework.methods.ArrayExamples.ArrayExample;

public class ArrayExampleTest {
    public static void main(String[] args) {
        ArrayExample ae = new ArrayExample();
        int numbers[] = {10, -2, 60, 0, -6, 10, 60, 11, 25, 44};
        ae.isExists(numbers,44);
        ae.findIndex(numbers,44);
        ae.printValueByIndex(numbers,4);
        ae.printRepeatedValue(numbers);
        ae.bubbleSortMinMax(numbers);
        ae.bubbleSortMaxMin(numbers);
        ae.secMax(numbers);
    }
}
