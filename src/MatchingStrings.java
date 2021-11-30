import java.util.ArrayList;
import java.util.List;

public class MatchingStrings {

    /*
     * There is a collection of input strings and a collection of query strings.
     * For each query string, determine how many times it occurs in the list of input strings.
     * Return an array of the results.
     */
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
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
