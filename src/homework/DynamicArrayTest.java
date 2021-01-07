package homework;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(2);
        da.add(-3);
        da.add(3);
        da.add(21);
        da.add(6);
        da.add(3);
        da.add(23);
        da.add(23);
        da.add(23);
//        int byIndex = da.getByIndex(5);
//        System.out.println(byIndex);
//        System.out.println();
//        System.out.println(da.max());
//        System.out.println( da.min());
//        da.print();
//        System.out.println();
//        da.deleteByIndex(4);
//        da.print();
//        System.out.println();
//        da.deleteByValue(23);
//        da.print();
//        System.out.println();
//        da.deleteByValueFirst(3);
        da.print();
        System.out.println();
        int[] result = da.subArray(2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
