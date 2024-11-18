package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MyFileCreator {

    private static final String FILE_PATH = "/Users/guymacin/Downloads/MyGame/data.txt";

    public static void start() {

        ArrayList<String> data = new ArrayList<>();
        data.add("France");
        data.add("Gabon");
        data.add("Gambia");
        data.add("Georgia");
        data.add("Germany");
        data.add("Ghana");
        data.add("Greece");

        //writeIntoFile(data);
        writeIntoFile("This is similar to PrintWriter, with the downside of not having PrintWriter's methods, and the benefit that it doesn't swallow exceptions.");
    }

    private static void writeIntoFile(String text) {
        try {
            Files.writeString(Path.of(FILE_PATH), text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeIntoFile(ArrayList<String> lines) {
        File file = new File(FILE_PATH);
        try {
            Files.write(file.toPath(),lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
