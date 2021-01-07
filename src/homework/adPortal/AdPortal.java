package homework.adPortal;

import homework.adPortal.models.Ad;
import homework.adPortal.models.Category;
import homework.adPortal.models.Gender;
import homework.adPortal.models.User;
import homework.adPortal.impl.AdStorageImpl;
import homework.adPortal.impl.UserStorageImpl;

import java.util.*;

public class AdPortal implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static AdStorage adStorage = new AdStorageImpl();
    private static UserStorage userStorage = new UserStorageImpl();
    private static User currentUser = null;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printMainCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.exit(0);
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                case MAIN_PRINT_ALL_ADS:
                    printAllAds();
                    break;
                default:
                    System.out.println("Wrong command!!");
            }
        }
    }

    private static void printAllAds() {
        adStorage.printAllAds();
    }

    private static void register() {
        System.out.println("Please input name,surname,gender,age,phoneNumber,password");
        String userData = scanner.nextLine();
        try {
            String[] userDataArr = userData.split(",");
            User user = new User(userDataArr[0], userDataArr[1], Gender.valueOf(userDataArr[2].toUpperCase()),
                    Integer.parseInt(userDataArr[3]), userDataArr[4], userDataArr[5]);
            userStorage.add(user);
            System.out.println("Register was success!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
            register();
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong gender, select from list");
            for (Gender gender : Gender.values()) {
                System.out.println(gender);
            }
            register();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid data");
            register();
        }
    }

    private static void login() {
        System.out.println("Please input phoneNumber, password");
        String userCred = scanner.nextLine();
        String[] userDataArr = userCred.split(",");
        User user = userStorage.getByPhone(userDataArr[0]);
        if (user == null) {
            System.out.println("User dose not exist");
        } else {
            if (user.getPassword().equals(userDataArr[1])) {
                System.out.println("Welcome " + user.getName() + " !");
                currentUser = user;
                userLogin();
            } else
                System.out.println("Password is incorrect!");
        }
    }

    private static void userLogin() {
        boolean isRun = true;
        while (isRun) {
            Commands.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    currentUser = null;
                    isRun = false;
                    break;
                case ADD_NEW_AD:
                    addAd();
                    break;
                case PRINT_ALL_ADS:
                    printAllAds();
                    break;
                case PRINT_MY_ALL_ADS:
                    adStorage.printMyAds(currentUser);
                    break;
                case PRINT_AD_BY_CATEGORY:
                    printAdsByCategory();
                    break;
                case DELETE_MY_ALL_ADS:
                    adStorage.deleteMyAds(currentUser);
                    break;
                case DELETE_MY_AD_BY_TITLE:
                    deleteMyAdByTitle();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void deleteMyAdByTitle() {
        System.out.println("Please input title");
        String title = scanner.nextLine();
        adStorage.deleteAdByTitle(title, currentUser);
    }

    private static void printAdsByCategory() {
        System.out.println("Here is category list");
        for (Category value : Category.values()) {
            System.out.println(value);
        }
        System.out.println("Please input category");
        try {
            String category = scanner.nextLine();
            adStorage.printByCategory(Category.valueOf(category.toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.out.println("wrong category");
        }
    }

    private static void addAd() {
        System.out.println("Please input title, text, price,category ");
        System.out.println("Here is category list");
        for (Category value : Category.values()) {
            System.out.println(value);
        }
        try {
            String adData = scanner.nextLine();
            String[] adDataArr = adData.split(",");
            Ad ad = new Ad(adDataArr[0], adDataArr[1], Double.parseDouble(adDataArr[2]),
                    new Date(), Category.valueOf(adDataArr[3].toUpperCase()), currentUser);
            adStorage.add(ad);
            System.out.println("Ad was added!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid data");
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong data");
        }
    }
}
