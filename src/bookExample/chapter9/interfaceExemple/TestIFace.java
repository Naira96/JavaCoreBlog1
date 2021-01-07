package bookExample.chapter9.interfaceExemple;

import bookExample.chapter9.interfaceExemple.CallBack;
import bookExample.chapter9.interfaceExemple.Client;

public class TestIFace {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}
