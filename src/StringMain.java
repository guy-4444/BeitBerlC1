import heritage.Circle;
import heritage.Rectangle;
import heritage.Shape;
import worldGame.Country;
import worldGame.Currency;
import zoo.Car;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class StringMain {

    public static void start() {
        // join
        String[] names = new String[]{"Avi", "Lia", "Matt", "Bob", "Alis", "Eliezer"};
        String all = String.join(", ", names);
        System.out.println("All names: " + all);


        // substring
        String gameInput = "<<<<>>>>";
        String gameInputPart1 = gameInput.substring(0, 4);
        String gameInputPart2 = gameInput.substring(4);
        System.out.println("gameInputPart1: " + gameInputPart1);
        System.out.println("gameInputPart2: " + gameInputPart2);


        // indexOf
        String textWik = "Wall Street is a skyscraper in the Financial District of Lower Manhattan in New York. Designed in the Art Deco style.";
        int dotPlace = textWik.indexOf(".");
        String firstTextWik = textWik.substring(0, dotPlace + 1);
        String secondTextWik = textWik.substring(dotPlace + 2);
        System.out.println("firstTextWik: " + firstTextWik);
        System.out.println("secondTextWik: " + secondTextWik);


        // toLowerCase, toUpperCase
        String luName = "Guy Isakov";
        String luNameLower = luName.toLowerCase();
        String luNameUpper = luName.toUpperCase();
        System.out.println("luNameLower: " + luNameLower);
        System.out.println("luNameUpper: " + luNameUpper);


        // replace, replaceAll
        String wikText = "wall-street_isa_skyscraper";
        String wikTextAfterSpaces1 = wikText.replace("_", " ");
        String wikTextAfterSpaces2 = wikText.replaceAll("[_-]", " ");
        System.out.println("wikTextAfterSpaces1: " + wikTextAfterSpaces1);
        System.out.println("wikTextAfterSpaces2: " + wikTextAfterSpaces2);


        // charAt
        String phoneNumber = "+972555555555";
        char firstChar = phoneNumber.charAt(0);


        // charArray
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] abcChars = abc.toCharArray();

        // trim - strip
        String nameInput = " Guy Isakov\u3000";
        String trimmedNameInput = nameInput.trim();
        String strippedNameInput = nameInput.strip();
        System.out.println("nameInput: |" + nameInput + "|");
        System.out.println("trimmedNameInput: |" + trimmedNameInput + "|");
        System.out.println("strippedNameInput: |" + strippedNameInput + "|");


        // concat
        String fullName = "Guy";
        fullName = fullName.concat(" Isakov");
        System.out.println("fullName: " + fullName);

        // contains
        String countries = "USA Japan UK Israel China";
        System.out.println(countries.contains("Israel"));
        System.out.println(countries.contains("Brazil"));
        countries = countries.concat(" Brazil");
        System.out.println(countries.contains("Brazil"));


        // String format
        String inputDetailsName = "Avi";
        int inputDetailsAge = 20;
        double avgHourlyIncome = 34.647;
        String formattedInput = String.format("Details: %s, age: %d, income: %.2f", inputDetailsName, inputDetailsAge, avgHourlyIncome);
        System.out.println(formattedInput);
        System.out.println(String.format("%.4f", Math.PI));

        for (String name : names) {
            System.out.println(String.format("%12s  %2d%% .", name, new Random().nextInt(20)));
        }

        for (String name : names) {
            System.out.println(String.format("%-12s  %02d .", name, new Random().nextInt(20)));
        }


        int num = 23; // 00010111
        System.out.println("num: " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println(String.format("Binary: %s", Integer.toBinaryString(num)));
        System.out.println(String.format("Hex: %x", num));
        System.out.println(String.format("Octal: %o", num));

        // CSV

        double netWorth = 1_980_789_123.23;
        String formattedNetWorthUs = String.format(Locale.US, "US: %,f", netWorth);
        String formattedNetWorthIt = String.format(Locale.ITALY, "ITALY: %,f", netWorth);

        System.out.println("formattedNetWorthUs: " + formattedNetWorthUs);
        System.out.println("formattedNetWorthIt: " + formattedNetWorthIt);

        String date = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss", Locale.US)
                .withZone(ZoneId.systemDefault())
                .format(Instant.ofEpochMilli(System.currentTimeMillis()));

        System.out.println(date);



        int x = 5; // int double long short byte float boolean char.
        int[] arr = new int[] {1, 2, 3, 4, 5};
        Car car = new Car("fd", 12);

        foo(x);
        foo(arr);
    }

    private static void foo(int num) {
        // By value
        num = 9;
    }

    private static void foo(int[] arr) {
        // By reference
        arr[1] = 20;
    }

    private static void foo(Car car) {
        // By reference
        car = null;
    }


}
