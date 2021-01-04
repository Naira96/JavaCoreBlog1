package bookExample.chapter14;

public class DataDemo {
    public static void main(String[] args) {
        DataStorage<String> strings = new DataStorage<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("From");
        strings.add("Home");
        strings.print();

        DataStorage<Integer> nums = new DataStorage<>();
        nums.add(122);
        nums.add(1);
        nums.add(15);
        nums.add(52);
        nums.print();
    }
}
