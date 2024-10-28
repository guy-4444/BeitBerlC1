package worldGame;

public class Country {

    private String name;
    private String continent;
    private long pop;
    private boolean isIsland;

    public String getName() {
        return name;
    }

    public boolean isIsland() {
        return isIsland;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        if (pop > 0) {
            this.pop = pop;
        }
    }

    public Country(String name, String continent, long pop, boolean isIsland) {
        this.name = name;
        this.continent = continent;
        this.pop = pop;
        this.isIsland = isIsland;
    }

    @Override
    public String toString() {
        String title = name;
        if (isIsland) {
            title += " ▧";
        }
        return title + " -  pop: " + pop;
    }
}
