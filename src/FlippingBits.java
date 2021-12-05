public class FlippingBits {

    /*
     * Take 1 for example, as unsigned 32-bits is 00000000000000000000000000000001
     * and doing the flipping we get 11111111111111111111111111111110 which in turn is 4294967294.
     */
    public static long flippingBits(long n) {
        /*
         * Reflection: my first time solving a solution using bitwise operators! feels very rewarding :)
         */

        int LONG_DIGITS = 32;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < LONG_DIGITS; i++) {
            // x & 00...001 makes every bit 0 except last bit which stays the same
            long lastBit = (n >> i) & 1;

            if (lastBit == 1) {
                lastBit = 0;
            } else {
                lastBit = 1;
            }

            result.insert(0, "" + lastBit);
        }

        return Long.parseLong(result.toString(), 2);
    }

    public static void main(String[] args) {
        long x = 1;
        System.out.println(flippingBits(x));
        System.out.println(Long.toBinaryString(flippingBits(x)));
    }
}
