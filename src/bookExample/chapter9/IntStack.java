package bookExample.chapter9;

public interface IntStack {
    void push(int item);

    int pop();

    //    default void clear() {
//        System.out.println("Meтoд clear() ne reolizovan");//karox e 2 interfacer unenan nuyn default method@,
//                                                          // ays depqum  super klyuchevoy bar@
//                                                          //karox enq ogtagorcel method@ kancheluc
//    }
    default int[] popNElements(int n) {
        return getElements(n);
    }

    default int[] skipAndPopNElements(int skip, int n) {
        getElements(skip);
        return getElements(n);
    }

    private int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++)
            elements[i] = pop();
            return elements;
    }
}
