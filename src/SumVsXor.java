public class SumVsXor {

    /*
     * given n, return number of values x satisfying n ^ x = n + x
     */
    public static long sumXor(long n) {
        /* Initial naive solution that i know is too slow
            long counter = 0;

            for (int i = 0; i <= n; i++) {
                if ((n ^ i) == (n + i)) {
                    counter++;
                }
            }
            return counter;
        */

        // I figured it out!!!
        // x = number of zeros in binary n
        // sumXor = number of permutations possible with x bits

        /*
         *
         */
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
