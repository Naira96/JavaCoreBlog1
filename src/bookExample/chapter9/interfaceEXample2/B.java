package bookExample.chapter9.interfaceEXample2;

public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
