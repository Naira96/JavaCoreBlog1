package bookExample.chapter9.random;

public class AskMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("NET");
                break;
            case YES:
                System.out.println("Da");
                break;
            case MAYBE:
                System.out.println("Vozmojno");
                break;
            case LATER:
                System.out.println("Pozdno");
                break;
            case SOON:
                System.out.println("Vskore");
                break;
            case NEVER:
                System.out.println("Nikogda");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
