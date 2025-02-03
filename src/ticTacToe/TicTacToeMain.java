package ticTacToe;

public class TicTacToeMain {

    public static void start() {
        TicTacToeLogic logic = new TicTacToeLogic(tttCallBack);
        logic.startGame();
    }

    private static TicTacToeLogic.TTTCallBack tttCallBack = new TicTacToeLogic.TTTCallBack() {
        @Override
        public void turn(TILE[][] map) {
            print(map);
        }

        @Override
        public void win(TILE tile) {
            System.out.println("Game Over: " + TILE.get(tile) + " is the winner!");
        }

        @Override
        public void tie() {
            System.out.println("Game Over: It's a tie");
        }
    };

    public static void print(TILE[][] map) {
        for (int i = 0; i < map.length; i++) {
            String line = "";
            for (int j = 0; j < map[0].length; j++) {
                line += TILE.get(map[i][j]) + " ";
            }
            System.out.println(line);
        }
        System.out.println();
    }
}
