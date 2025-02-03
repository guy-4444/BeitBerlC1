package ticTacToe;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ClockLibrary {

    public interface ClockCallBack {
        void run();
    }

    private int DELAY = 1000;
    private ClockCallBack clockCallBack;

    public ClockLibrary(ClockCallBack clockCallBack) {
        this.clockCallBack = clockCallBack;
    }

    public ClockLibrary(int delay, ClockCallBack clockCallBack) {
        this.DELAY = delay;
        this.clockCallBack = clockCallBack;
    }

    public void start() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() -> tick(), 0, DELAY, TimeUnit.MILLISECONDS);
    }

    private void tick() {
        if (clockCallBack != null) {
            clockCallBack.run();
        }
    }

}





