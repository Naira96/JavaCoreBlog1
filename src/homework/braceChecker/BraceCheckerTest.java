package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = ")Hello (from  {Java]. This is [brace) (checker}.";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}