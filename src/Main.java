import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    /*
     * Given an array of integers, where all elements but one occur twice, find the unique element.
     */
    public static int lonelyInteger(List<Integer> a) {
        List<Integer> results = new ArrayList<>();

        for (Integer value : a) {
            if (results.contains(value)) {
                results.remove(value);
            } else {
                results.add(value);
            }
        }

        return results.get(0);
    }

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

    /*
     * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
     * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
     * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     */
    public static String timeConversion(String s) {
        String militaryTime = s.replaceAll("[A-Za-z]", "");
        String hour = s.substring(0, 2);
        String amPm = s.replaceAll("[^A-Za-z]", "");

        if (amPm.equals("AM") && hour.equals("12")) {
            militaryTime = "00" + militaryTime.substring(2);
        } else if (amPm.equals("PM") && !hour.equals("12")) {
            int militaryHour = Integer.parseInt(hour) + 12;
            militaryTime = "" + militaryHour + militaryTime.substring(2);
        }

        return militaryTime;
    }

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
