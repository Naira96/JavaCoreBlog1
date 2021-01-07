package bookExample.chapter9.defaultMethodInInterface;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
