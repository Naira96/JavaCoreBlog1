package homework.methods.FigurePainter;

public class FigurePainter {
    void figureOne(int k,char c) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureTwo(int k,char c) {
        for (int i = 0; i < k; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureThree(int k,char c) {
        for (int i = k; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figureFour(int k, char c) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }

    void figureFive(int a, char c) {
        for (int i = 0; i < a; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }
}
