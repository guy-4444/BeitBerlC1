package zoo;

public abstract class Vehicle {

    private String license;
    private int km;

    public Vehicle(String license, int km) {
        this.license = license;
        this.km = km;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return " Vehicle{" +
                "license='" + license + '\'' +
                ", km=" + km +
                '}';
    }
}
