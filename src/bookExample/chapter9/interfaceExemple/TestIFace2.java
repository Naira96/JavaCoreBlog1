package bookExample.chapter9.interfaceExemple;

import bookExample.chapter9.interfaceExemple.AnotherClient;
import bookExample.chapter9.interfaceExemple.CallBack;
import bookExample.chapter9.interfaceExemple.Client;

public class TestIFace2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
