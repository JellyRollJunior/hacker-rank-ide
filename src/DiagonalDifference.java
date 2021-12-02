import java.util.List;

public class DiagonalDifference {
    /*
     *     Given a square matrix, calculate the absolute difference between the sums of its diagonals.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
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
