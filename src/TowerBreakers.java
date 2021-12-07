public class TowerBreakers {

    /*
     * Two players are playing a game of Tower Breakers!
     * Player 1 always moves first, and both players always play optimally.
     * The rules of the game are as follows:
     *      Initially there are n towers.
     *      Each tower is of height m.
     *      The players move in alternating turns.
     * In each turn, a player can choose a tower of height x and reduce its height to y,
     * where 1 <= y <= x and evenly y divides x.
     * If the current player is unable to make a move, they lose the game.
     * Given the values of n and m, determine which player will win.
     * If the first player wins, return 1. Otherwise, return 2.
     */
    public static int towerBreakers(int n, int m) {
        /*
         * Reflection: I figured out n % 2 == 0 means player two wins but I forgot about the case where m == 1
         *             I then went to the discussions for the answer to the problem.
         *             Honestly I gave up too early and I didn't realize how close I was to the answer already.
         *             Need to persevere more and keep calm instead of getting frustrated.
         */

        if (n % 2 == 0 || m == 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
