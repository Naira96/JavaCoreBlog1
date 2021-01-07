package zadachi.MySelfScannerExample;

import java.util.Scanner;

public class BookTest {
    static Scanner scanner = new Scanner(System.in);
    static DataStorage dataStorage = new DataStorage();
    public static void main(String[] args) {
        showCommand();
        boolean isRun = true;
        while (isRun) {
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addBook();
                    System.out.println("Book was added");
                    break;
                case "2":
                    dataStorage.print();
                    break;
                case "3":
                    searchBookByTitle();
                    break;
                default:
                    System.out.println("WRONG COMMAND");
            }
        }
    }
private static void showCommand() {
    System.out.println("Please choose command!");
    System.out.println("Please input 0 for EXIT");
    System.out.println("Please input 1 for ADD A BOOK");
    System.out.println("Please input 2 for PRINT");
    System.out.println("Please input 3 for SEARCHING BY TITLE");
}
private  static void addBook(){
    System.out.println("Please input title, authorName, count, price");
    System.out.println("title");
    String title = scanner.nextLine();
    System.out.println("authorName");
    String authorName = scanner.nextLine();
    System.out.println("count");
    int count = Integer.parseInt(scanner.nextLine());
    System.out.println("price");
    double price = Double.parseDouble(scanner.nextLine());
    Book book = new Book(title, authorName, count, price);
    dataStorage.add(book);
} private static void  searchBookByTitle() {
        System.out.println("Please input Title");
        String searchTitle = scanner.nextLine();
        Book searchBook = dataStorage.searchByTitle(searchTitle);
        if (searchBook == null) {
            System.out.println("Book with " + "\"" + searchTitle + "\"" + " title does not exists");
        } else {
            System.out.println(searchBook);
        }
    }
}
