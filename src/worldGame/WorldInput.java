package worldGame;

import java.util.Scanner;


public class WorldInput {

    private static String[] countries = new String[2];
    private static int size = 0;

    public static void start() {
        System.out.println("▧ ▧ ▧ ▧ ▧ World Input App ▧ ▧ ▧ ▧ ▧");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter name: (-- to exit)");
            String input = scanner.nextLine();

            if (input.length() < 2) {
                break;
            }
            if (input.equals("--")) {
                break;
            }


            addCountryToArray(input);
            System.out.println("Your input = : " + input);
        }

        printCountriesArray();
        System.out.println("▧ ▧ ▧ ▧ ▧ Game Over ▧ ▧ ▧ ▧ ▧");
    }

    private static void addCountryToArray(String name) {
        if (countries.length == size) {
            String[] temp = new String[countries.length * 2];

            for (int i = 0; i < countries.length; i++) {
                temp[i] = countries[i];
            }

            countries = temp;
        }

        countries[size] = name;
        size++;
    }

    private static void addCountryToArrayOld(String name) {
        String[] temp = new String[countries.length + 1];

        for (int i = 0; i < countries.length; i++) {
            temp[i] = countries[i];
        }

        countries = temp;

        countries[temp.length - 1] = name;
    }

    private static void printCountriesArray() {
        System.out.println("\n\nYour Array:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + countries[i]);
        }

    }
}
