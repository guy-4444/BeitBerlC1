package worldGame;

public class DataManager {

    public static Country[] generateCountriesArray() {
        Country[] countries = new Country[4];

        countries[0] = new Country("Israel", "----", 10_000_000, false);
        countries[1] = new Country("Australia", "----", 26_000_000, true);
        countries[2] = new Country("USA", "----", 350_000_001, false);
        countries[3] = new Country("Japan", "----", 123_000_000, true);

        return countries;
    }
}
