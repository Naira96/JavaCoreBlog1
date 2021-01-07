package bookExample.chapter9.interfaceExemple;

import bookExample.chapter9.interfaceExemple.CallBack;

public class Client implements  CallBack{
    public void callback(int p) {
        System.out.println("Metod callback(), " + "vizivaemi so znacheniem " + p);
    }

    void nonIfaceMeth() {
        System.out.println("V klassax, realizuyushix interfeissi," + " mogut opredelyatsya i drugie chleni. ");
    }
}
