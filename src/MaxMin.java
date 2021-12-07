import java.util.Collections;
import java.util.List;

public class MaxMin {

    /*
     * You will be given a list of integers arr, and a single integer k. You must create an array of length k
     * from elements of arr such that its unfairness is minimized. Call that array arr' .
     * Unfairness of an array is calculated as max(arr') - min(arr')
     */
    public static int maxMin(int k, List<Integer> arr) {
        /*
         * Reflection: I am quite proud of this solution! I did this question in like 15 minutes and
         *             it's the optimal solution to boot! I can feel the progress lads.
         */
        Collections.sort(arr);

        int endOffset = k - 1;
        int unfairness = arr.get(endOffset) - arr.get(0);
        for (int i = 1; i + (endOffset) < arr.size(); i++) {
            int nextUnfairness = arr.get(i + endOffset) - arr.get(i);

            if (nextUnfairness < unfairness) {
                unfairness = nextUnfairness;
            }
        }
        return unfairness;
    }
}
