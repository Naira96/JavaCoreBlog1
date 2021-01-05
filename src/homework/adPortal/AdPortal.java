package homework.adPortal;

import java.text.SimpleDateFormat;
import java.util.*;

public class AdPortal implements AdsCommands {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, User> userMap = new HashMap<>();
    static boolean isRun = true;

    public static void main(String[] args) {

        while (isRun) {
            showCommands();
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
                default:
                    System.out.println("wrong command");
            }
        }
    }

    private static void login() {
        List<Advertisement> ads = new LinkedList<>();
        System.out.println("Please input your password and phoneNumber");
        String password = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        boolean user = userMap.containsKey(phoneNumber);
        if (userMap.isEmpty()) {
            System.out.println("Portal is empty, first sign up");
            register();
        } else {
            if (user) {
                while (user) {
                    showCommandsAdPortal();
                    String commands = scanner.nextLine();
                    switch (commands) {
                        case LOGOUT:
                            login();
                            break;
                        case ADD_NEW_AD:
                            try {
                                System.out.println("Please input title, text, price, category, author");
                                String adData = scanner.nextLine();
                                String[] adDataStr = adData.split(",");

                                String title = adDataStr[0];
                                String text = adDataStr[1];
                                double price = Double.parseDouble(adDataStr[2]);
                                Date date = new Date();
                                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                String category = adDataStr[3];
                                User user1 = userMap.get(phoneNumber);
                                ads.add(new Advertisement(title, text, price, date, category, user1));
                                System.out.println(ads);
                                System.out.println("Ad was added");
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid number");
                                login();
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Invalid data");
                                login();
                            }
                            break;
                        case PRINT_MY_ALL_ADS:
                            for (Advertisement ad : ads) {
                                if (ad.getAuthor().equals(userMap.get(phoneNumber))) {
                                    System.out.println(ad);
                                }
                            }
                            break;
                        case PRINT_ALL_ADS:
                            for (Advertisement ad : ads) {
                                System.out.println(ad);
                            }
                            break;
                        case PRINT_AD_BY_CATEGORY:
                            System.out.println("Input category");
                            String category = scanner.nextLine();
                            for (Advertisement ad : ads) {
                                if (category.equals(ad.getCategory())) {
                                    System.out.println(ad);
                                }
                            }
                            break;
                        case DELETE_MY_ALL_ADS:
                            for (Advertisement ad : ads) {
                                if (ad.getAuthor().equals(userMap.get(phoneNumber))) {
                                    ads.remove(ad);
                                }
                            }
                            System.out.println("Your all ads were deleted");
                            break;
                        case DELETE_AD_BY_TITLE:
                            System.out.println("please input title");
                            String title = scanner.nextLine();
                            for (Advertisement ad : ads) {
                                if (title.equals(ad.getTitle())) {
                                    ads.remove(ad);
                                    System.out.println("Advertisement was deleted");
                                }
                            }
                            break;
                        default:
                            System.out.println("Wrong command");
                    }
                }
            } else {
                System.out.println("Don't exist");
                login();
            }
        }
    }

    private static void showCommandsAdPortal() {
        System.out.println("please input " + LOGOUT + " for logout");
        System.out.println("please input " + ADD_NEW_AD + " for ADD_NEW_AD");
        System.out.println("please input " + PRINT_MY_ALL_ADS + " for PRINT_MY_ALL_ADS");
        System.out.println("please input " + PRINT_ALL_ADS + " for PRINT_ALL_ADS");
        System.out.println("please input " + PRINT_AD_BY_CATEGORY + " for PRINT_AD_BY_CATEGORY");
        System.out.println("please input " + DELETE_MY_ALL_ADS + " for DELETE_MY_ALL_ADS");
        System.out.println("please input " + DELETE_AD_BY_TITLE + " for DELETE_AD_BY_TITLE");
    }

    private static void register() {
        System.out.println("Please input name, surname, gender, age, phoneNumber, password");
        String userData = scanner.nextLine();
        String[] myUserData = userData.split(",");
        try {
            String name = myUserData[0];
            String surName = myUserData[1];
            String gender = myUserData[2];
            int age = Integer.parseInt(myUserData[3]);
            String phoneNumber = myUserData[4];
            String youPassword = myUserData[5];
            userMap.put(phoneNumber, new User(name, surName, Gender.valueOf(gender.toUpperCase()), age, phoneNumber, youPassword));
            System.out.println("You are registered");
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

    private static void showCommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + LOGIN + " for login");
        System.out.println("please input " + REGISTER + " for Register");
    }
}
