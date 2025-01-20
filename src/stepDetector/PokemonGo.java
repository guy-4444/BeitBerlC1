package stepDetector;

public class PokemonGo{

    private static StepDetector sd;

    public static void start() {
        sd = new StepDetector(protocolSteps);

    }

    private static Protocol_Steps protocolSteps = new Protocol_Steps() {
        @Override
        public void stepIsReady(int counter) {

        }

        @Override
        public void yemaniteStepIsReady() {

        }
    };



}
