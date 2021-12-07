public class CaesarCipher {

    /*
     * return string with chars shifted k characters forward. wrap around if at the end.
     */
    public static String caesarCipher(String s, int k) {
        /*
         * Reflection: This question made me realize I really need to think of solutions outside the obvious.
         *             instead of reusing code and modulo-ing 26 twice, I could have modulo-ed the k instead.
         */

        StringBuilder cipher = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current >= 'a' && current <= 'z') {
                int numericalChar = current - 'a';
                int shiftedChar = (numericalChar + k) % 26;
                current = (char) (shiftedChar + 'a');
            } else if (current >= 'A' && current <= 'Z') {
                int numericalChar = current - ('A');
                int shiftedChar = (numericalChar + k) % 26;
                current = (char) (shiftedChar + 'A');
            }

            cipher.append(current);
        }

        return cipher.toString();
    }

    public static void main(String[] args) {

        System.out.println((int) 'a');
        System.out.println('a' - 1);
        String a = "abcxyz";

        System.out.println(caesarCipher(a, 26));

        System.out.println(25 % 26);
    }
}
