package homework.methods.FigurePainter;

import homework.methods.FigurePainter.FigurePainter;

public class FigurePainterTest {
    public static void main(String[] args) {
        FigurePainter fp = new FigurePainter();
        fp.figureOne(4,'*');
        System.out.println();
        fp.figureTwo(4, '?');
        System.out.println();
        fp.figureThree(4, '!');
        System.out.println();
        fp.figureFour(4,'~');
        System.out.println();
        fp.figureFive(4,'*');
    }
}
