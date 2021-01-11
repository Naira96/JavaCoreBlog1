package homework.blog.util;

import homework.adPortal.models.Ad;
import homework.blog.model.Post;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileUtil {
    private static final String POST_PATH = "C:\\Users\\Valodya\\Java daser\\src\\homework\\blog\\file\\adFile.txt";

    public static void serializePostList(List<Post> postList) {
        createFileIfNotExist(POST_PATH);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(POST_PATH))) {
            outputStream.writeObject(postList);
        } catch (IOException e) {
            System.out.println(POST_PATH + "Dose not exist/ or empty");
        }
    }

    private static void createFileIfNotExist(String postPath) {
        File file = new File(postPath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(postPath + " File can not be created");
            }
        }
    }

    public static List<Post> deserializePostList() {
        createFileIfNotExist(POST_PATH);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(POST_PATH))) {
            return (List<Post>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(POST_PATH + "Dose not exist/ or empty");
            return new LinkedList<>();
        }
    }
}
