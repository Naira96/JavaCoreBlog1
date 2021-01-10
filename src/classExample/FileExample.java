package classExample;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Valodya\\Java daser\\src\\file");
//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());
//
//        boolean newFile = file.createNewFile();

        //   file.mkdirs()-@ mi qani folder ksarqe irar mej

        File[] list = file.listFiles();
        for (File f : list) {
            System.out.println("Name: " + f.getName());
            System.out.println("Length: " + f.length());
            System.out.println("isFile: " + f.isFile());
        }

    }
}
