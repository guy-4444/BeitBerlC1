package exercise1;

import java.util.ArrayList;

public class Smartphone extends Product implements Portable {

    public enum CHARGING_PORT {
        TYPE_C,
        MICRO_USB,
        LIGHTNING,
        NOKIA_SIZE_FIVE,
    }

    private CHARGING_PORT chargingPort = CHARGING_PORT.TYPE_C;

    public Smartphone(String name, double price, CHARGING_PORT chargingPort) {
        super(name, price);
        setChargingPort(chargingPort);
    }

    public Smartphone(String name, double price) {
        super(name, price);
    }

    public Smartphone(Smartphone other) {
        super(other);
    }

    @Override
    public Smartphone copy() {
        return new Smartphone(this);
    }

    @Override
    public void warranty() {
        System.out.println("TouchScreen");
    }

    @Override
    public void weight() {
        System.out.println("200 gr");
    }

    public String buyCable() {
        switch (chargingPort) {
            case TYPE_C -> {
                return "Type C";
            }
            case MICRO_USB -> {
                return "Micro Usb";
            }
            case LIGHTNING -> {
                return "Lightning";
            }
            default -> throw new IllegalStateException("Unexpected value: " + chargingPort);
        }
    }
    public String buyCable2() {
        if (chargingPort == null) {
            throw new IllegalStateException("Unexpected value: " + chargingPort);
        }

        String name = chargingPort.name();
        name = name.toLowerCase();
        name = name.replace("_", " ");

        String[] splits = name.split(" ");
        for (int i = 0; i < splits.length; i++) {
//            splits[i] = ((char) (splits[i].charAt(0) - 32)) + splits[i].substring(1);
            splits[i] = splits[i].substring(0, 1).toUpperCase() + splits[i].substring(1);
        }
        name = String.join(" ", splits);

        return name;
    }

    public CHARGING_PORT getChargingPort() {
        return chargingPort;
    }

    public void setChargingPort(CHARGING_PORT chargingPort) {
        this.chargingPort = chargingPort;
    }

    @Override
    public String toString() {
        return "Smartphone: " + super.toString();
    }

}
