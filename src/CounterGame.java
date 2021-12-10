public class CounterGame {

    /*
     * Louise and Richard have developed a numbers game. They pick a number and check to see if it is a power of 2.
     * If it is, they divide it by 2. If not, they reduce it by the next lower number which is a power of 2.
     * Whoever reduces the number to 1 wins the game. Louise always starts.
     * Given an initial value, determine who wins the game.
     */
    public static String counterGame(long n) {
        /*
         * Reflection: not proud of this solution. It's extremely slow and akin to how I used to code
         *             before I really cared about my code quality.
         *
         *             Should have worked through this bitwise.
         *                 Subtract the leading bit from n when n is not a power of two
         *                 Once we subtract all leading 1s, we begin dividing by 2 til we get 1
         *
         *             found solution:
                          String binary = Long.toBinaryString(n);

                          // The number of 1's (until the last) represent the number
                          // of turns / subtractions until the result is a power of 2
                          long turns = binary.chars().filter(ch -> ch == '1').count() - 1;

                          // Add to turns the number of zeros ofter the last 1
                          // which will be the turns / div by 2 until 1 is reached
                          turns += binary.length() - (binary.lastIndexOf("1") + 1);

                          // If the number of turns is even, player 2 will win
                          return turns % 2 == 0? player2 : player1;
         */
        int winCounter = 0;
        while (n > 1) {
            double nLogTwo = Math.log(n) / Math.log(2);

            if (nLogTwo % 1 == 0) {
                // if log2(n) is integer, n is a power of two
                n = n / 2;
            } else {
                // subtract the nearest power of two from n
                System.out.print(n + " - " + Math.pow(2, Math.floor(nLogTwo)) + ": ");

                n = (long) (n - Math.pow(2, Math.floor(nLogTwo)));
            }

            System.out.println(n);
            winCounter = winCounter ^ 1;
        }

        if (winCounter == 0) {
            return "Richard";
        } else {
            return "Louise";
        }

    }

    public static void main(String[] args) {
        System.out.println(counterGame(50000));
    }
}
