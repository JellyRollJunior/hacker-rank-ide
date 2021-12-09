import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    /*
     * Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically,
     * ascending. Determine if the columns are also in ascending alphabetical order, top to bottom.
     * return Yes of yes, else NO
     */
    public static String gridChallenge(List<String> grid) {
        /*
         * Reflection: Not an especially challenging question. I did get tripped up a bit when indexing (my weak point).
         *             Solutions in the discussions didn't seem to improve on mine too much
         *             time saving could be made by stuffing all sorted strings into a large string instead of
         *             indexing out of a list to determine if columns are sorted.
         */
        for (int i = 0; i < grid.size(); i++) {
            String row = grid.get(i);
            char[] rowToChar = row.toCharArray();

            Arrays.sort(rowToChar);
            grid.set(i, String.valueOf(rowToChar));
        }
//        System.out.println(grid);

        // build string out of column values
        for (int col = 0; col < grid.get(0).length(); col++) {
            StringBuilder columnString = new StringBuilder();

            for (String row : grid) {
                columnString.append(row.charAt(col));
            }

            // check if column value is sorted
            for (int i = 0; i < columnString.length() - 1; i++) {
                if (columnString.charAt(i) > columnString.charAt(i + 1)) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("ebacd");
        grid.add("fghij");
        grid.add("olmkn");
        grid.add("trpqs");

        System.out.println(gridChallenge(grid));
    }
}
