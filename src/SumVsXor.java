public class SumVsXor {

    /*
     * given n, return number of values x satisfying n ^ x = n + x
     */
    public static long sumXor(long n) {
        /*
         * Reflection: I'm so proud I figured out the answer to this question! It only has a 73% clear rate too!!!
         *             I figured this out because I worked through examples and noticed a pattern!. FeelsGoodMan.
         */

        /* Initial naive solution that i know is too slow
            long counter = 0;

            for (int i = 0; i <= n; i++) {
                if ((n ^ i) == (n + i)) {
                    counter++;
                }
            }
            return counter;
        */

        // x = number of zeros in binary n
        // sumXor = number of permutations possible with x bits
        if (n == 0) {
            return 1;
        }
        String binary = Long.toBinaryString(n);
        long numZeroes = binary.chars().filter(ch -> ch == '0').count();

        return (long) Math.pow(2, numZeroes);
    }

    public static void main(String[] args) {
        System.out.println(sumXor(0));
    }
}
