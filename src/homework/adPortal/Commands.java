package homework.adPortal;

public interface Commands {
    //main commands
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";
    String MAIN_PRINT_ALL_ADS = "3";
    //user commands
    String LOGOUT = "0";
    String ADD_NEW_AD = "1";
    String PRINT_ALL_ADS = "2";
    String PRINT_MY_ALL_ADS = "3";
    String PRINT_AD_BY_CATEGORY = "4";
    String DELETE_MY_ALL_ADS = "5";
    String DELETE_MY_AD_BY_TITLE = "6";

    static void printMainCommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + LOGIN + " for login");
        System.out.println("please input " + REGISTER + " for Register");
        System.out.println("please input " + MAIN_PRINT_ALL_ADS + " for PRINT_ALL_ADS");
    }

    static void printUserCommands() {
        System.out.println("please input " + LOGOUT + " for logout");
        System.out.println("please input " + ADD_NEW_AD + " for ADD_NEW_AD");
        System.out.println("please input " + PRINT_ALL_ADS + " for PRINT_ALL_ADS");
        System.out.println("please input " + PRINT_MY_ALL_ADS + " for PRINT_MY_ALL_ADS");
        System.out.println("please input " + PRINT_AD_BY_CATEGORY + " for PRINT_AD_BY_CATEGORY");
        System.out.println("please input " + DELETE_MY_ALL_ADS + " for DELETE_MY_ALL_ADS");
        System.out.println("please input " + DELETE_MY_AD_BY_TITLE + " for DELETE_MY_AD_BY_TITLE");

    }
}
