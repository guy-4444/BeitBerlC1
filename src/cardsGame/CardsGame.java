package cardsGame;

import java.util.ArrayList;

public class CardsGame {

    public static void start() {

        ArrayList<Card> p1 = new ArrayList<>();
        ArrayList<Card> p2 = new ArrayList<>();

        p1 = GameDataManager.generateDeck();
        p2 = GameDataManager.generateDeck();


        play(p1, p2);

    }

    private static void play(ArrayList<Card> p1, ArrayList<Card> p2) {
        // running in loop

    }

}
