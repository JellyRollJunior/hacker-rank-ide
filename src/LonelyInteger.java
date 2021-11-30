import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {

    /*
     * Given an array of integers, where all elements but one occur twice, find the unique element.
     */
    public static int lonelyInteger(List<Integer> a) {
        /*
            O(N) , O(1) space solution:
            Reflection: I need to focus more on mathematical theory rather than relying on prebuilt functions

            Property: if a binary number A is XOR by B twice, the result is A;
                      in short: XOR is commutative and associative
            Since we know the lonely integer only appears once and repeated elements appear twice,
            Every value will cancel itself out except the lonely integer

            int val = 0;
            for (int num : a) {
                val = val ^ num; // ^ is XOR operator
            }
            return val;
         */

        List<Integer> results = new ArrayList<>();

        for (Integer value : a) {
            if (results.contains(value)) {
                results.remove(value);
            } else {
                results.add(value);
            }
        }

        return results.get(0);
    }
}
