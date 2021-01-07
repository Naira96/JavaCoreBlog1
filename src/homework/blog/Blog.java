package homework.blog;

import homework.blog.blogInterface.BlogCommands;
import homework.blog.excaption.PostNotFoundException;
import homework.blog.model.Post;
import homework.blog.storage.PostStorageImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Blog implements BlogCommands {
    static PostStorageImpl postStorageImpl = new PostStorageImpl();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws PostNotFoundException {
        boolean isRun = true;
        while (isRun) {
            showCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    System.exit(0);
                    break;
                case ADD_POST:
                    addPost();
                    break;
                case SEARCH_BY_TITLE:
                    searchByTitle();
                    break;
                case SEARCH_POST:
                    System.out.println("Please input keyword for SEARCH_POST");
                    String anyKeyword = scanner.nextLine();
                    postStorageImpl.searchPostsByKeyword(anyKeyword);
                    break;
                case POSTS_BY_CATEGORY:
                    if (postStorageImpl.isEmpty()) {
                        System.out.println("Blog is empty.Please add post first");
                    } else {
                        System.out.println("Please select category from list");
                        postStorageImpl.printCategoryList();
                        String ourCategory = scanner.nextLine();
                        try {
                            Post foundPost = postStorageImpl.getByCategory(ourCategory);
                            System.out.println(foundPost);
                        } catch (PostNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case ALL_POSTS:
                    if (postStorageImpl.isEmpty()) {
                        System.out.println("Blog is empty, please input post first");
                    } else postStorageImpl.printAllPosts();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }

    }

    private static void searchByTitle() {
        System.out.println("Please input title for search post");
        String searchTitle = scanner.nextLine();
        try {
            Post postByTitle = postStorageImpl.getPostByTitle(searchTitle);
            System.out.println(postByTitle);
        } catch (PostNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addPost() {
        System.out.println("Please input title, text, category for ADD_POST");
        String title = scanner.nextLine();
        String text = scanner.nextLine();
        String category = scanner.nextLine();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Post post = new Post(title, text, category, date);
        postStorageImpl.add(post);
        System.out.println(post);
        System.out.println("Post was added");
    }

    private static void showCommand() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_POST + " for ADD_POST");
        System.out.println("Please input " + SEARCH_BY_TITLE + " for SEARCH_BY_TITLE");
        System.out.println("Please input " + SEARCH_POST + " for SEARCH_POST");
        System.out.println("Please input " + POSTS_BY_CATEGORY + " for print POSTS_BY_CATEGORY");
        System.out.println("Please input " + ALL_POSTS + " for print ALL_POSTS");
    }
}