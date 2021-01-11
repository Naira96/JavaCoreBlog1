package homework.blog;

import homework.blog.blogInterface.BlogCommands;
import homework.blog.excaption.PostNotFoundException;
import homework.blog.model.Category;
import homework.blog.model.Post;
import homework.blog.storage.PostStorageFileImpl;

import java.util.Date;
import java.util.Scanner;

public class Blog implements BlogCommands {
    private static PostStorageFileImpl postStorageFileImpl = new PostStorageFileImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            BlogCommands.showCommand();
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
                    postStorageFileImpl.searchPostsByKeyword(anyKeyword);
                    break;
                case POSTS_BY_CATEGORY:
                    postByCategory();
                    break;
                case ALL_POSTS:
                    if (postStorageFileImpl.isEmpty()) {
                        System.out.println("Blog is empty, please input post first");
                    } else postStorageFileImpl.printAllPosts();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }

    }

    private static void postByCategory() {
        if (postStorageFileImpl.isEmpty()) {
            System.out.println("Blog is empty.Please add post first");
        } else {
            System.out.println("Please select category from list");
            for (Category value : Category.values()) {
                System.out.println(value);
            }
            try {
                Post postsByCategory = postStorageFileImpl.getPostsByCategory(scanner.nextLine());
                if (postsByCategory == null) {
                    System.out.println("do not exist");
                } else System.out.println(postsByCategory);
            } catch (IllegalArgumentException e) {
                System.out.println("wrong category");

            }
        }
    }

    private static void searchByTitle() {
        System.out.println("Please input title for search post");
        String searchTitle = scanner.nextLine();
        try {
            Post postByTitle = postStorageFileImpl.getPostByTitle(searchTitle);
            System.out.println(postByTitle);
        } catch (PostNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addPost() {
        System.out.println("Please input title, text, category for ADD_POST");
        System.out.println("Here is category list");
        for (Category value : Category.values()) {
            System.out.println(value);
        }
        String postData = scanner.nextLine();
        try {
            String[] postDataArr = postData.split(",");
            Post post = new Post(postDataArr[0], postDataArr[1], Category.valueOf(postDataArr[2].toUpperCase()),
                    new Date());
            postStorageFileImpl.add(post);
            System.out.println("Post was added");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid data");
        } catch (IllegalArgumentException e) {
            System.out.println("wrong category");
        }
    }
}