import java.util.List;

public class SherlockAndArray {

    /*
     * Watson gives Sherlock an array of integers. His challenge is to find an element of the array such that the
     * sum of all elements to the left is equal to the sum of all elements to the right.
     */
    public static String balancedSums(List<Integer> arr) {
        /*
         * REFLECTION: Very similar to a previous problem I completed which also involved procedurally generating sums.
         *             I want to say there's a more elegant way of coding the solution. I'll check the discussions
         *
         * After checking: I can move the if statement to the start of the loop to check the base case instead
         *                 of having it at the bottom! In every iteration i, we are actually checking the validity of
         *                 value i + 1! try to be flexible in how you use for loops to reduce code!
         *
         *                  for (int i = 0; i < arr.size(); i++) {
                                if (leftSum == rightSum) {
                                    return "YES";
                                } else {
                                    leftSum += arr.get(i);
                                    rightSum -= arr.get(i + 1);
                                }
                            }
         */
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
