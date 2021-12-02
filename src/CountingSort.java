import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort {

    /*
     * Another sorting method, the counting sort, does not require comparison.
     * Instead, you create an integer array whose index range covers the entire range of values in your array to sort.
     * Each time a value occurs in the original array, you increment the counter at that index.
     * At the end, run through your counting array, printing the value of each
     * non-zero valued index that number of times.
     */
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> countingSortArray = new ArrayList<>(Collections.nCopies(100, 0));

        for (int value : arr) {
            int occurrence = countingSortArray.get(value);
            countingSortArray.set(value, occurrence + 1);
        }

        return countingSortArray;
    }

}
