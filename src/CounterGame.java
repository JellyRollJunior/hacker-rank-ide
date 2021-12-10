public class CounterGame {

    public static String counterGame(long n) {
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
