package bookExample.chapter7;

public class Test1 {
    int a, b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test1() {
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth(Test1 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
