package classExample;

public class ArrayExClass {
    public static void main(String[] args) {
//        int numbers[]={10,56,20,3,79,4,5,66,102};
//        for (int i = 0; i <numbers.length ; i++) {
//            System.out.print(numbers[i] + " ");


        int numbers[] = new int[8];
        System.out.println(numbers.length -1);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+1;
            System.out.print(numbers[i] + " ");
        }

    }
}
