public class PalindromeIndex {

    /*
     * Given a string of lowercase letters in the range ascii[a-z], determine the index of a character that can be
     * removed to make the string a palindrome. There may be more than one solution, but any will do.
     * If the word is already a palindrome or there is no solution, return -1.
     * Otherwise, return the index of a character to remove.
     */
    public static int palindromeIndex(String s) {
        /*
         * REFLECTION: It's "basic" yet it has 67% pass rate... I only completed this question after using up two
         * "look at test cases" hacks and then I had to go to discussions to get the final part on what I was missing.
         * This is the longest I've ever spent on a "basic" quetion and in the end I didn't even complete it
         * with my own solution. **This question is saying I need to create more comprehensive
         * test cases if I want to solve problems this difficult.
         */
        int end = s.length() - 1;
        int removalIndex = -1;

        int j = 0;
        for (int i = 0; i < (s.length()/2) + 1; i++) {
            if (s.charAt(i) != s.charAt(end - j)) {
                System.out.println(s.charAt(i) + " != " + s.charAt(end - j));
                if (removalIndex > -1) {
                    return -1;
                }

                if (s.charAt(i + 1) == s.charAt(end - j) && s.charAt(i + 2) == s.charAt(end - (j + 1))) {
                    removalIndex = i;
                    i++;
                } else if (s.charAt(i) == s.charAt(end - j - 1)) {
                    removalIndex = end - j;
                    end--;
                } else {
                    return -1;
                }
            }
            j++;
        }

        return removalIndex;
    }

    public static void main(String[] args) {
        String x = "hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh";
        System.out.println(x);
        System.out.println(palindromeIndex(x));
    }
}
