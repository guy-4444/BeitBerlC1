package worldGame;

import java.util.Scanner;

public class WorldGame {

    private static final String[] CONTINENTS = new String[] {
            "Africa",
            "Asia",
            "Europe",
            "North America",
            "Oceania",
            "South America",
    };
    private static Country[] countries;

    public static void start() {
        System.out.println("▧ ▧ ▧ ▧ ▧ Welcome To World Game App ▧ ▧ ▧ ▧ ▧");

        countries = DataManager.generateCountriesArray();


        //printAllCountries();

//        startNewGame();
        startNewProGame();

        System.out.println("▧ ▧ ▧ ▧ ▧ Game Over ▧ ▧ ▧ ▧ ▧");
    }

    private static void startNewProGame() {
        System.out.println("- - Game Started - -");

    }

    private static void startNewGame() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("- - Game Started - -");

        for (int i = 0; i < countries.length; i++) {
            System.out.println((i + 1) + ". is " + countries[i].getName() + " an island? (enter 1 / 0)");
            int answer = scanner.nextInt();

            if ((countries[i].isIsland() && answer == 1) || (!countries[i].isIsland() && answer == 0)) {
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("Wrong");
            }
        }

        System.out.println("Your score  " + score + "/" + countries.length);

    }

    private static void printAllCountries() {
        for (int i = 0; i < countries.length; i++) {
            System.out.println((i + 1) + ". " +  countries[i]);
        }
    }

}
