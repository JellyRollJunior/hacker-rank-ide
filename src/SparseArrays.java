import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {

    /*
     * There is a collection of input strings and a collection of query strings.
     * For each query string, determine how many times it occurs in the list of input strings.
     * Return an array of the results.
     */
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        /*
            O(N+M) solution : use preprocessing + hashmap => when doing Q queries on input, try to use preprocessing
            Reflection: I need to focus on data structures available to me rather than only using lists.

            Map<String, Integer> map = new HashMap<>();
            for (String string : strings) {
                int numTimesAppeared = map.getOrDefault(string, 0);
                map.put(string, ++numTimesAppeared);
            }

            List<Integer> results = new ArrayList<>();
            for (String query : queries) {
                results.add(map.getOrDefault(query, 0));
            }

            return results;
         */

        List<Integer> results = new ArrayList<>();

        for (String query : queries) {
            int occurrence = 0;
            for (String string : strings) {
                if (string.equals(query)) {
                    occurrence++;
                }
            }
            results.add(occurrence);
        }
        return results;
    }
}
