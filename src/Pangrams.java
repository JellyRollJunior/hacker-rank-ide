public class Pangrams {

    /*
     * Given a sentence determine whether it is a pangram in the English alphabet.
     * Ignore case. Return either pangram or not pangram as appropriate.
     */
    public static String pangrams(String s) {
        String isPangram = "pangram";
        int[] alphabetCount = new int[26];

        int A = 65;
        int Z = 90;
        int a = 97;
        int z = 122;
        for (int i = 0; i < s.length(); i++) {
            int character = s.charAt(i);
            if (character >= A && character <= Z) {
                alphabetCount[character - A]++;
            } else if (character >= a && character <= z) {
                alphabetCount[character - a]++;
            }
        }

        for (int value : alphabetCount) {
            if (value == 0) {
                return "not pangram";
            }
        }

        return isPangram;
    }

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }
}
