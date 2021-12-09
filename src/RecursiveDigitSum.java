public class RecursiveDigitSum {

    /*
     * given an integer, we need to find the super digit of the integer.
     * If x has only 1 digit, then its super digit is x.
     * Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
     *
     * find superDigit of n concatenated k times
     */
    public static int superDigit(String n, int k) {
        /*
         * Reflection: Carefully check the number ranges, may need to use Long instead of int! Don't get fooled
         *             int overflow in Java is > 2^31 or 2147483647
         *
         * Optimal Solution: I actually noticed an error the test cases didnt pick up!
         *                   Initial if statement should be
         *                   if (n.length() == 1 && k == 1)
         */

        if (n.length() == 1) {
            return Integer.parseInt(n.repeat(k));
        }

        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Long.parseLong(String.valueOf(n.charAt(i)));
        }
        sum = sum * k;

        return superDigit("" + sum, 1);
    }

    public static void main(String[] args) {
        System.out.println(superDigit("5009", 0));
    }

}
