package homework.adPortal;

import java.util.*;

public class AdPortal implements AdsCommands, EntryCommands {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, User> userMap = new HashMap<>();
    public static void main(String[] args) {
        showEntryCommands();
        Boolean isRun = true;
        while (isRun) {
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    System.exit(0);
                    break;
                case LOGIN:
                   login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }

    }
//    LOGIN լինելուց պետք է ուզի յուզերի phoneNumber,password
//    եթե ունենք նման յուզեր, թողնում ենք լոգին լինի, որից հետո կտեսնենք հետևյալ հրամանները։
//            0 LOGOUT
//1 ADD NEW AD(Advertisment բառից է, որը կնշանակե հայտարարություն)
//2 PRINT MY ALL ADS
//3 PRINT ALL ADS
//4 PRINT AD BY CATEGORY
//5 DELETE MY ALL ADS(պետք է ջնջի տվյալ յուզերի բոլոր հայտարարությունները)
//6 DELETE AD BY TITLE (վերնագիրը կուդանք, կջնջե)
//    AD կլասսը պետք է ունենա։ title,text,price,date,category,author(User օբյեկտ պահեք)
//    Տնայինը անում ենք բոլոր վերջին անցած թեմաներով
//    Օգտագործում ենք էքսեփշններ, քլեքշններ, ինտերֆեյս, ենամ․․․

    private static void login() {
        System.out.println("Please input your password and phoneNumber");
        String password = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        userMap.getOrDefault(phoneNumber,)
    }

    private static void register() {

        System.out.println("Input name, surname, gender, age,");

        String name = scanner.nextLine();
        System.out.println("Input surname");
        String surname = scanner.nextLine();
        String myGender;
        try {
            System.out.println("Choose your gender");
            for (Gender gender : Gender.values())
                System.out.println(gender);
            myGender = scanner.nextLine();
            Gender.valueOf(myGender.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Not exist");
            System.out.println("Choose your gender from list");
            for (Gender gender : Gender.values())
                System.out.println(gender);
            myGender = scanner.nextLine();
        }
        System.out.println("Input age");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("invalid number");
            System.out.println("Input again");
            age = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Input phoneNumber");
        String phoneNumber = scanner.nextLine();
        userMap.put(yourPassword, new User(name, surname, Gender.valueOf(myGender), age, phoneNumber, yourPassword));
        System.out.println("You are registered");
    }

    private static void showEntryCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOGIN + " for LOGIN");
        System.out.println("Please input " + REGISTER + " for REGISTER");
    }
}
