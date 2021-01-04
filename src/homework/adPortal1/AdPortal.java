package homework.adPortal1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdPortal implements EntryCommands {
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
//        Set<String> strings = userMap;
//        for (String string : strings){
//            if (phoneNumber.equals(userMap.get(string) && password.equals(userMap.)){
//
//            }
//        }
    }

    private static void register() {
        System.out.println("Input name, surname, gender, age, phoneNumber, password");
        String userData = scanner.nextLine();
        String[] myUserData = userData.split(",");
        try {
            String name = myUserData[0];
            String surname = myUserData[1];
            String gender = myUserData[2];
            int age = Integer.parseInt(myUserData[3]);
            String phoneNumber = myUserData[4];
            String yourPassword = myUserData[5];
            userMap.put(phoneNumber, new User(name, surname, Gender.valueOf(gender.toUpperCase()), age, phoneNumber, yourPassword));
            System.out.println("You are registered");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
            register();
        } catch (IllegalArgumentException e) {
            System.out.println("wrong gender,select from list");
            for (Gender gender : Gender.values()) {
                System.out.println(gender);
            }
            register();
        }
    }


    private static void showEntryCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOGIN + " for LOGIN");
        System.out.println("Please input " + REGISTER + " for REGISTER");
    }
}
