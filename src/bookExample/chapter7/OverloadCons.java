package bookExample.chapter7;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box (mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Объем myboxl равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объем myboxl равен " + vol);
        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен " + vol);
        vol = myclone.volume();
        System.out.println("Oбъeм клона равен " + vol);
    }
}
