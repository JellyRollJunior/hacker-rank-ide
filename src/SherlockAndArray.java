import java.util.List;

public class SherlockAndArray {

    /*
     * Watson gives Sherlock an array of integers. His challenge is to find an element of the array such that the
     * sum of all elements to the left is equal to the sum of all elements to the right.
     */
    public static String balancedSums(List<Integer> arr) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < arr.size(); i++) {
            rightSum += arr.get(i);
        }

        // base case i = 0
        if (leftSum == rightSum) {
            return "YES";
        }

        // main loop i > 0
        for (int i = 1; i < arr.size(); i++) {
            leftSum += arr.get(i - 1);
            rightSum -= arr.get(i);

            if (leftSum == rightSum) {
                return "YES";
            }
        }

        return "NO";
    }
}
