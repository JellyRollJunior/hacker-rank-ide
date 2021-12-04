public class XorStrings2 {

    /*
     * debug the code with at most 3 line changes
     */
    public static String stringsXOR(String s, String t) {
        /*
         * Reflection: this one is a bit too easy
         *
         * Original:
         * String res = new String("");
           for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) = t.charAt(i))
                    res = "0";
                else
                    res = "1";
            }

            return res;
         */

        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }

        return res;
    }
}
