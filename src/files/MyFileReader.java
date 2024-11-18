package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFileReader {


    public static void start() {
        solve();
    }

    private static void solve() {
        final String FILE_PATH = "/Users/guymacin/Downloads/MyGame/data.txt";

        String text = null;
        try {
            text = Files.readString(Paths.get(FILE_PATH));
        } catch (IOException e) {}

        if (text == null) {
           System.out.println("Error 404 - file not found");
        } else {

            String cleaned = text.replaceAll("[^a-zA-Z0-9\\s]", "");
            String[] wordsArray = cleaned.split("\\s+");

            List<String> list = new ArrayList<>();
            for (String word : wordsArray) {
                if (word.length() > 1) {
                    list.add(word);
                }
            }

            //List<String> list = Arrays.stream(wordsArray)
            //        .filter(word -> word.length() > 1)
            //        .collect(Collectors.toList());

            String password = "";
            for (int i = 0; i < list.size(); i+=20) {
                String word = list.get(i);
                password += word.charAt(1);
                if (password.length() == 10) {
                    break;
                }
            }

            System.out.println("password: " + password);

        }
    }

    private static void readLines() throws IOException {
        final String FILE_PATH = "/Users/guymacin/Downloads/Submarine/Day 1/data.txt";

        ArrayList<String> content = (ArrayList<String>) Files.readAllLines(Paths.get(FILE_PATH));

        for (String s : content) {
            int num = Integer.valueOf(s);
            System.out.println(num);
        }
    }
}
