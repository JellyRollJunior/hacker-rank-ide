import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GridChallenge {

    public static String gridChallenge(List<String> grid) {
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

            for (int row = 0; row < grid.size(); row++) {
                columnString.append(grid.get(row).charAt(col));
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
