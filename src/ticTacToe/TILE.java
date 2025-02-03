package ticTacToe;

import java.util.HashMap;

public enum TILE {
    E,
    X,
    O;

    private static HashMap<TILE, Character> charMap = new HashMap<>();

    static {
        charMap.put(E, '□');
        charMap.put(X, '✗');
        charMap.put(O, '●');
    }

    public static char get(TILE t) {
        return charMap.get(t);
    }


}
