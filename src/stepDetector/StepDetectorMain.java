package stepDetector;

public class StepDetectorMain {

    private static StepDetector sd;

    public static void start() {
        sd = new StepDetector(protocolSteps);
        sd.start();
    }

    public static void updateUI(int num) {
        System.out.println("Screen updated with " + num);
    }

    private static Protocol_Steps protocolSteps = new Protocol_Steps() {
        @Override
        public void stepIsReady(int counter) {
            System.out.println("Main step: " + counter);
        }

        @Override
        public void yemaniteStepIsReady() {
            System.out.println("Main yemaniteStepIsReady!");
        }
    };
}
