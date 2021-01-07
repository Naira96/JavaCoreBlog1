package bookExample.chapter8.boxExtends;

public class Box {
    private double width;
    private double height;
    private double depth;

    //сконструировать клон объекта
    Box(Box ob) { //передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, применяемый в отсутствие размеров
    Box() {
        width = -1;  // значение -1 служит для обозначения
        height = -1; //неинициализированного
        depth = -1; // параллелепипеда
    }

    //конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}