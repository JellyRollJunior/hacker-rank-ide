import java.util.ArrayList;
import java.util.List;

public class FlippingTheMatrix {

    /*
     * Sean invented a game involving a  matrix where each cell of the matrix contains an integer.
     * He can reverse any of its rows or columns any number of times.
     * The goal of the game is to maximize the sum of the elements in the
     * submatrix located in the upper-left quadrant of the matrix.
     * Given the initial configurations for  matrices,
     * help Sean reverse the rows and columns of each matrix in the best possible way so that the
     * sum of the elements in the matrix's upper-left quadrant is maximal.
     */
    public static int flippingMatrix(List<List<Integer>> matrix) {
        /*
         * Reflection: I won't say completed myself because I was stuck for a long time and looked at a hint that
         * said there are only four values possible for each M[row][col] using row/col flipping.
         * I feel slightly discouraged as previously I was at least able to hack a naive solution before
         * looking to the discussions for help. I won't let this stop my learning though as this is what
         * learning is all about :) if they were all easy then they wouldn't be problems.
         * At least I can say I've successfully coded my first medium solution!
         *
         * Tips: Have some scratch paper nearby for those tricky questions. Working this out on paper first would really
         * have helped a lot in my opinion.
         */

        int total = 0;
        int end = matrix.size() - 1;
        int size = matrix.size();

        // iterate through top left n/2 * n/2 matrix 
        for(int row = 0; row < (size / 2); row++) {
            for (int col = 0; col < (size / 2); col++) {
                // analyze matrix[row][col]

                int value = matrix.get(row).get(col);
                int topRight = matrix.get(row).get(end - col);
                int botLeft = matrix.get(end - row).get(col);
                int botRight = matrix.get(end - row).get(end - col);

                // find max of all values possible
                int max = Math.max(value, Math.max(topRight, Math.max(botLeft, botRight)));

//                System.out.println("[" + row + "][" + col +"]: " + max);

                total += max;
            }
        }
        return total;
    }

    public static void main(String[] args) {

    }
}