package ticTacToe;

import java.util.Random;

public class TicTacToeLogic {

    public interface TTTCallBack {
        void turn(TILE[][] map);
        void win(TILE tile);
        void tie();
    }

    private TILE[][] map = new TILE[3][3];
    private TTTCallBack tttCallBack;
    private boolean isGameRunning = true;

    public TicTacToeLogic(TTTCallBack tttCallBack) {
        this.tttCallBack = tttCallBack;
    }

    public void startGame() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = TILE.E;
            }
        }
        ClockLibrary clockLibrary = new ClockLibrary(1000, () -> tick());
        clockLibrary.start();
    }

    private boolean firstPlayer = true;

    private void tick() {
        if (!isGameRunning) {
            return;
        }

        int[] pos = getRandomPosition();
        while (!isEmpty(pos[0], pos[1])) {
            pos = getRandomPosition();
        }

        map[pos[0]][pos[1]] = firstPlayer ? TILE.X : TILE.O;

        firstPlayer = !firstPlayer;

        isWinner();

        isGameOver();


        tttCallBack.turn(map);
    }

    private void isGameOver() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {

            }
        }
    }

    private void isWinner() {
        final int[] WINS = new int[]{
                0b111000000,
                0b000111000,
                0b000000111,
                0b100100100,
                0b010010010,
                0b001001001,
                0b100010001,
                0b001010100,
        };

        int p1 = 0b000000000;
        int p2 = 0b000000000;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                int shift = 8 - (i * 3 + j);
                int n = map[i][j] == TILE.X ? 1 : 0;
                p1 += n << shift;
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                int shift = 8 - (i * 3 + j);
                int n = map[i][j] == TILE.O ? 1 : 0;
                p2 += n << shift;
            }
        }

        String s1 = String.format("%9s", Integer.toBinaryString(p1).replaceAll(" ", "0"));
        String s2 = String.format("%9s", Integer.toBinaryString(p2).replaceAll(" ", "0"));

        System.out.println("p1: " + s1);
        System.out.println("p2: " + s2);

        for (int i = 0; i < WINS.length; i++) {
            if ((p1 & WINS[i]) == WINS[i]) {
                tttCallBack.win(TILE.X);
                isGameRunning = false;
            }
            if ((p2 & WINS[i]) == WINS[i]) {
                tttCallBack.win(TILE.O);
                isGameRunning = false;
            }
        }
    }

    private int[] getRandomPosition() {
        int i = new Random().nextInt(3);
        int j = new Random().nextInt(3);
        return new int[]{i, j};
    }

    private boolean isEmpty(int i, int j) {
        return map[i][j] == TILE.E;
    }
}









