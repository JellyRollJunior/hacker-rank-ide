import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DynamicArray {
    /*
     * https://www.hackerrank.com/challenges/dynamic-array/problem
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAnswer = 0;
        List<Integer> answers = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        for (List<Integer> query : queries) {
            int index;
            if (query.get(0) == 1) {
                index = (query.get(1) ^ lastAnswer) % n;

                arr.get(index).add(query.get(2));
            } else {
                index = (query.get(1) ^ lastAnswer) % n;
                int outerIndex = query.get(2) % arr.get(index).size();

                lastAnswer = arr.get(index).get(outerIndex);
                answers.add(lastAnswer);
            }
        }

        return answers;
    }

    public static void main(String[] args) {
    }
}
