import java.util.Collections;
import java.util.List;

public class FindTheMedian {

    /*
     * find median
     */
    public static int findMedian(List<Integer> arr) {
        /*
         * Reflection: make sure not to forget the basics ( indexing :) )
         */

        Collections.sort(arr);
        return arr.get( (arr.size() - 1) / 2);
    }
}
