package homework.braceChecker;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;

                case '}':
                    if (stack.isEmpty()) {
                        System.err.println("Error: Closed " + ch + " but not opened at " + i);
                    } else if ((char) stack.pop() != '{') {
                        System.err.println("Error: opened { but closed " + ch + " at " + i);
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        System.err.println("Error: Closed " + ch + " but not opened at " + i);
                        System.err.println("Error: opened [ but closed " + ch + " at " + i);
                    }
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        System.err.println("Error: Closed " + ch + " but not opened at " + i);
                    } else if ((char) stack.pop() != '(') {
                        System.err.println("Error: opened [ but closed " + ch + " at " + i);
                    }
                    break;
            }
        }
        if (!stack.isEmpty()) {
            int last;
            while ((last = stack.pop()) != 0) {
                System.err.println("Error: opened " + (char) last + " but not closed");
            }
        }
    }
}