package bookExample.chapter14;

public class DataStorage<T> {
    private Object[] array;
    private int size;

    public DataStorage() {
        array = new Object[16];
    }

    public void add(T t) {
        if (size == array.length) {
            extend();
        }
        array[size++] = t;
    }

    private void extend() {
        Object[] tmp = new Object[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }

    public T getByIndex(int index) {
        return (T) array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
