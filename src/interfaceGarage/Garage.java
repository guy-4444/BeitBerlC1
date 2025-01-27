package interfaceGarage;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Garage {

    private Protocol_Garage protocolGarage;
    private ArrayList<Vehicle> vehicles;
    private boolean isGarageOpen = true;
    private int currentVehicle = 0;
    private int hour = 0;

    public Garage(Protocol_Garage protocolGarage) {
        this.protocolGarage = protocolGarage;
    }

    public void startWork(ArrayList<Vehicle> vehicles) {
        // convert the map to array
        this.vehicles = vehicles;

        Runnable helloRunnable = new Runnable() {
            @Override
            public void run() {
                tick();
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 0, 1, TimeUnit.SECONDS);
    }

    private void tick() {
        if (!isGarageOpen) {
            return;
        }

        hour++;
        System.out.println("dubug. hour = " + hour);
        Vehicle v = vehicles.get(currentVehicle);

        if (v.getFixedTime() == hour) {
            // vehicle fixed

            v.fixed();
            protocolGarage.fixed();
            hour = 0;
            currentVehicle++;
        }

        if (currentVehicle == vehicles.size()) {
            isGarageOpen = false;
            System.out.println("All fixed = day off!!");
        }
    }
}














