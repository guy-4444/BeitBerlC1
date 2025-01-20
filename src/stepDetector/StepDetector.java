package stepDetector;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class StepDetector {

    private int steps = 0;
    private Protocol_Steps protocolSteps;

    public StepDetector(Protocol_Steps protocolSteps) {
        this.protocolSteps = protocolSteps;
    }

    public void start() {
        Runnable helloRunnable = new Runnable() {
            public void run() {
                tick();
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 0, 1, TimeUnit.SECONDS);
    }

    private void tick() {
        Random random = new Random();
        if (random.nextInt(3) == 0) {
            stepDetect();
        }
    }

    public void stepDetect() {
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        steps++;
        System.out.println(timeStamp + ": Step " + steps);


        Random random = new Random();
        if (random.nextInt(3) == 0) {
            protocolSteps.yemaniteStepIsReady();
        } else {
            protocolSteps.stepIsReady(steps);
        }
    }

    public void stop() {

    }
}
