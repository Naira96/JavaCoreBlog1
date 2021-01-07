package homework.braceChecker;

public class Stack {
    private int[] stack;
    private int index;

    Stack() {
        stack = new int[10];
        index = -1;
    }

    public void push(int brace) {
        if (index == stack.length) {
            int[] temp = new int[stack.length * 2];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            temp = stack;
        } else stack[++index] = brace;
    }

    public int pop() {
        if (index < 0) {
            return 0;
        }
        return stack[index--];
    }

    public boolean isEmpty() {
        return index == -1;
    }
}
