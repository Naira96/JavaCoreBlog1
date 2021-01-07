package homework.methods.CharArray;

import homework.methods.CharArray.CharArray;

public class CharArrayTest {
    public static void main(String[] args) {
        CharArray cha = new CharArray();
        char[] text = {' ', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', ' '};
        cha.xSpace(text);
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        cha.printCount(bolola);
        cha.printMedium(bolola);
        cha.printTrueFalse(bolola);
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        cha.bobTrueFalse(babola);
    }
}
