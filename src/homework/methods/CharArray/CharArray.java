package homework.methods.CharArray;

public class CharArray {
    void xSpace(char text[]) {
        int beginIndex = 0;             //// Trim metodn e
        int endIndex = text.length - 1;
        while (beginIndex < endIndex && text[beginIndex] == ' ') {
            beginIndex += 1;
        }
        while (beginIndex < endIndex && text[endIndex] == ' ') {
            endIndex -= 1;
        }
        char[] result = new char[(endIndex - beginIndex) + 1];
        int index = 0;
        for (int i = beginIndex; i < endIndex + 1; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    void printCount(char bolola[]) {
        char c = 'o';
        int count = 0;
        for (char x : bolola) {
            if (x == c)
                count += 1;
        }
        System.out.println(count);
    }

    void printMedium(char bolola[]) {
        if (bolola.length % 2 == 0) {
            System.out.print(bolola[bolola.length / 2 - 1] + " ");
            System.out.print(bolola[bolola.length / 2]);
        } else System.out.println(bolola[bolola.length / 2]);
        System.out.println();
    }

    void printTrueFalse(char bolola[]) {
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    void bobTrueFalse(char babola[]) {

    }
}

