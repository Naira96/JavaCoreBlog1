package bookExample.chapter9.interfaceStack;

public class DynStack implements IntStack {
    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            int tmp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++)
                tmp[i] = stck[i];
            stck = tmp;
        }
        stck[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stek ne zagrujen");
            return 0;
        } else return stck[tos--];
    }
}
