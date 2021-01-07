package classExample.models;

import classExample.models.modelBook.Book;
import classExample.models.storageBook.DataStorage;

import java.util.Scanner;

public class BookTest {
    static Scanner scanner = new Scanner(System.in);
    static DataStorage dataStorage = new DataStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            showCommand();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addBook();
                    break;
                case "2":
                    dataStorage.print();
                    break;
                case "3":
                    searchBookByTitle();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void showCommand() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD BOOK");
        System.out.println("Please input 2 for PRINT");
        System.out.println("Please input 3 for Search BOOK BY TITLE");

    }

    private static void addBook() {
        System.out.println(" Nermuceq grqi tvyalner@");
        System.out.println("Title:");
        String title = scanner.nextLine();
        System.out.println("authorName:");
        String authorName = scanner.nextLine();
        System.out.println("price:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("count:");
        int count = Integer.parseInt(scanner.nextLine());
        Book book = new Book(title, authorName, price, count);
        dataStorage.add(book);
        System.out.println("Book was added");
    }

    private static void searchBookByTitle() {
        System.out.println("Please input title for search");
        String searchTitle = scanner.nextLine();
        Book searchBook = dataStorage.getBookByTitle(searchTitle);
        if (searchBook == null) {
            System.out.println("Book with " + "\"" + searchTitle + "\"" + " title does not exists");
        } else {
            System.out.println(searchBook);
        }
    }
}
