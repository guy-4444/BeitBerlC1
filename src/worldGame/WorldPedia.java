package worldGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class WorldPedia {

    private static ArrayList<Country> countries;
    private static HashMap<String, Country> countryMap = new HashMap<>();

    public static void start() {
        System.out.println("▧ ▧ ▧ ▧ ▧ Welcome To World-Pedia App ▧ ▧ ▧ ▧ ▧");

        countries = DataManager.generateCountriesArray();
        for (Country country : countries) {
            countryMap.put(country.getName(), country);
        }

        long pop = getPop("United States");
        String str = MyString.format(pop);
        String cur = getCurrency("United States");
        System.out.println("pop: " + str);
        System.out.println("cur: " + cur);

        double amount = calculate("Israel", 100);

    }

    private static double calculate(String name, int price) {
        return 0;
    }

    private static String getCurrency(String name) {
        Country country = countryMap.get(name);
        return country.getCurrencyName() + " (" + country.getCurrencySymbol() + ")";
    }

    private static Long getPop(String name) {
        return countryMap.get(name).getPop();
    }
}









