import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SalesByMatch {

    /*
     * There is a large pile of socks that must be paired by color.
     * Given an array of integers representing the color of each sock,
     * determine how many pairs of socks with matching colors there are.
     */
    public static int sockMerchant(int n, List<Integer> ar) {
        /*
         * Reflection: my first time using hashmap to solve a problem. FeelsGoodMan
         *             I'm pretty sure I over-engineered this problem but I'll check after I see the discussions.
         *
         * After searching discussions: I found a cleaner solution using sorting but sorting the list which saves space
         *                              but makes the solution slower than my constant time solution.
         *                              Although in practice, maintaining a large hashmap and array list may lead to
         *                              slower times than just a list (I'm not sure just speculating :P)
         */

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> distinctColors = new ArrayList<>();

        for (int color : ar) {
            int timesAppeared = map.getOrDefault(color, 0);

            if (timesAppeared == 0) {
                distinctColors.add(color);
            }

            map.put(color, ++timesAppeared);
        }

        int totalMatches = 0;
        for (int color : distinctColors) {
            int timesAppeared = map.getOrDefault(color, 0);

            totalMatches += timesAppeared / 2;
        }

        return totalMatches;
    }

    public static void main(String[] args) {
        List<Integer> socks = new ArrayList<>();
        socks.add(1);
        socks.add(1);
        socks.add(2);
        socks.add(3);
        socks.add(3);
        socks.add(1);

        System.out.println(sockMerchant(socks.size(), socks));
    }
}
