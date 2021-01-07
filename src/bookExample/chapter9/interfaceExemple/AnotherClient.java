package bookExample.chapter9.interfaceExemple;

public class AnotherClient implements CallBack {
    public void callback(int p) {
        System.out.println("Esho odin variant metoda callback()");
        System.out.println("p v kvadrate ravno " + (p*p));
    }
}
