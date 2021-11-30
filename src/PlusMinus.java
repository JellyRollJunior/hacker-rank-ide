import java.util.List;

public class PlusMinus {

    /*
     * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
     * Print the decimal value of each fraction on a new line with places after the decimal.
     */
    public static void plusMinus(List<Integer> arr) {
        float numPositive = 0f;
        float numNegative = 0f;
        float numZero = 0f;
        for (int value : arr) {
            if (value > 0) {
                numPositive++;
            } else if (value < 0) {
                numNegative++;
            } else {
                numZero++;
            }
        }

        float numPositiveRatio = numPositive / arr.size();
        float numNegativeRatio = numNegative / arr.size();
        float numZeroRatio = numZero / arr.size();

        System.out.printf("%.5f \n", numPositiveRatio);
        System.out.printf("%.5f \n", numNegativeRatio);
        System.out.printf("%.5f \n", numZeroRatio);
    }
}
