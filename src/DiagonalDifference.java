import java.util.List;

public class DiagonalDifference {

    /*
     *     Given a square matrix, calculate the absolute difference between the sums of its diagonals.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        /*
         * Optimal N vs 2N runtime
         * Reflection: again, I need to remember to use mathematical principles to shorten my code
         *
         * The cleanest solution actually doesn't track both sums
         *
         * int difference = 0;
         * for (int i = 0; i < arrSize; i++) {
         *     difference += arr.get(i).get(i) - arr.get(i).get(arrSize - 1 - i);
         * }
         *
         * return Math.abs(difference)
         */
        int arrSize = arr.size();

        // compute LR diagonal
        int leftRightDiagonalTotal = 0;
        for (int i = 0; i < arrSize; i++) {
            leftRightDiagonalTotal = leftRightDiagonalTotal + arr.get(i).get(i);
        }

        int rightLeftDiagonalTotal = 0;
        int col = arrSize - 1;
        for (List<Integer> integers : arr) {
            rightLeftDiagonalTotal = rightLeftDiagonalTotal + integers.get(col);
            col--;
        }

        return Math.abs(leftRightDiagonalTotal - rightLeftDiagonalTotal);
    }

    public static void main(String[] args) {

    }
}
