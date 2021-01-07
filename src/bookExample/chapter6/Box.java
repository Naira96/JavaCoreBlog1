package bookExample.chapter6;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        System.out.println("Hello from constructor");
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


}
