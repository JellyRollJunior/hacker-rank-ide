import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TwoArrays {

    /*
     * There are two -element arrays of integers, A and B.
     * Permute them into some A' and B' such that the relation A'[i] + B'[i] >= k holds for all i.
     * return YES if some permutation satisfying the relation exists. Otherwise, return NO.
     */
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);

        int i = B.size() - 1;
        for (int valueA : A) {
            int valueB = B.get(i--);

            if ((valueA + valueB) < k) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        A.add(2);
        A.add(1);
        A.add(3);

        B.add(7);
        B.add(8);
        B.add(9);

        System.out.println( twoArrays(10, A, B) );
    }
}
