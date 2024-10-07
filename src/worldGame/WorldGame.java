package worldGame;

public class WorldGame {

    private static Country[] countries = new Country[4];

    public static void start() {
        System.out.println("▧ ▧ ▧ ▧ ▧ World Game App ▧ ▧ ▧ ▧ ▧");

        Country c1 = new Country();
        c1.name = "Israel";
        c1.pop = 10_000_000;

        Country c2 = new Country();
        c2.name = "USA";
        c2.pop = 350_000_001;

        System.out.println(c1.name + " - " + c1.pop);
        System.out.println(c2.name + " - " + c2.pop);


        generateData();
        printData();

        System.out.println("▧ ▧ ▧ ▧ ▧ Game Over ▧ ▧ ▧ ▧ ▧");
    }

    private static void generateData() {
        for (int i = 0; i < countries.length; i++) {

        }
    }


    private static void printData() {
        // 1. Israel 10000000
    }
}
