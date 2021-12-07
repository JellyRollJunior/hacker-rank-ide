public class CaesarCipher {

    /*
     * return string with chars shifted k characters forward. wrap around if at the end.
     */
    public static String caesarCipher(String s, int k) {
        StringBuilder cipher = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // lower case
            if (current >= 'a' && current <= 'z') {
                int numericalChar = current - ('a' - 1);
                int shiftedChar = (numericalChar + k);
                while (shiftedChar > 26) {
                    shiftedChar = shiftedChar - 26;
                }
                current = (char) (shiftedChar + ('a' - 1));
            } else if (current >= 'A' && current <= 'Z') {
                int numericalChar = current - ('A' - 1);
                int shiftedChar = (numericalChar + k);
                while (shiftedChar > 26) {
                    shiftedChar = shiftedChar - 26;
                }
                current = (char) (shiftedChar + ('A' - 1));
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
    }
}
