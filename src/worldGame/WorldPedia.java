package worldGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class WorldPedia {


    private static ArrayList<Country> countries;
    private static HashMap<String, Country> countryMap = new HashMap<>();
    private static HashMap<String, Double> currenciesMap = new HashMap<>();

    public static void start() {
        System.out.println("▧ ▧ ▧ ▧ ▧ Welcome To World-Pedia App ▧ ▧ ▧ ▧ ▧");

        countries = DataManager.generateCountriesArray();
        for (Country country : countries) {
            countryMap.put(country.getName(), country);
        }
        currenciesMap = DataManager.generateCurrenciesMap();


        long pop = getPop("United States");
        String str = MyString.format(pop);
        String cur = getCurrency("United States");
        System.out.println("pop: " + str);
        System.out.println("cur: " + cur);

        double amount = calculate("Japanpp", 100);
        System.out.println("Amount: " + amount);

        //bigger("Israel", "Japan");
    }

    private static void bigger(String country1Name, String country2Name) {
        Country country1 = countryMap.get(country1Name);
        Country country2 = countryMap.get(country2Name);

        int country1Adults = (int) (country1.getPop() * country1.getAdultPercent());
        int country2Adults = (int) (country2.getPop() * country2.getAdultPercent());

        System.out.println(country1Name + ": " + MyString.format(country1Adults));
        System.out.println(country2Name + ": " + MyString.format(country2Adults));
    }

    private static double calculate(String name, int price) {
        Country country = countryMap.get(name);

        if (country == null) {
            return -1;
        }

        String symbol = country.getCurrency().getSymbol();

        double ratio = currenciesMap.get(symbol);

        double sum = price * ratio;


        System.out.println(sum + " " + country.getCurrency().toString());
        return sum;
    }

    private static String getCurrency(String name) {
        Country country = countryMap.get(name);
        return country.getCurrency().toString();
    }

    private static Long getPop(String name) {
        return countryMap.get(name).getPop();
    }
}









