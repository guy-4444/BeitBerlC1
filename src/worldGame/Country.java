package worldGame;

public class Country {

    private String name;
    private String continent;
    private String capital;
    private long area;
    private long pop;
    private boolean isIsland;
    private double adultPercent;
    private String currencyName;
    private String currencySymbol;

    public Country(String name, String continent, String capital, long area, long pop, boolean isIsland, double adultPercent, String currencySymbol, String currencyName) {
        this.name = name;
        this.continent = continent;
        this.capital = capital;
        this.area = area;
        this.pop = pop;
        this.isIsland = isIsland;
        this.adultPercent = adultPercent;
        this.currencySymbol = currencySymbol;
        this.currencyName = currencyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    public boolean isIsland() {
        return isIsland;
    }

    public void setIsland(boolean island) {
        isIsland = island;
    }

    public double getAdultPercent() {
        return adultPercent;
    }

    public void setAdultPercent(double adultPercent) {
        this.adultPercent = adultPercent;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }
}








