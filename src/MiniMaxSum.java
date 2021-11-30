import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {

    /*
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
     * four of the five integers. Then print the respective minimum and maximum values as a single line of two
     * space-separated long integers.
     */
    public static void miniMaxSum(List<Integer> arr) {
        int i = 0;
        int positionMin = i;
        int positionMax = i;

        // get max / get min position
        for (i = 0; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(positionMin)) {
                positionMin = i;
            }

            if (arr.get(i) > arr.get(positionMax)) {
                positionMax = i;
            }
        }

        long totalSum = 0;
        for (int value : arr) {
            totalSum += value;
        }
        long minSum = totalSum - arr.get(positionMax);
        long maxSum = totalSum - arr.get(positionMin);

        System.out.println("" + minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        miniMaxSum(arr);
    }
}
