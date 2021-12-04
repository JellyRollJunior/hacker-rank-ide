import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision1 {

    /*
     * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
     * Lily decides to share a contiguous segment of the bar selected such that:
     *      The length of the segment matches Ron's birth month, and,
     *      The sum of the integers on the squares is equal to his birthday.
     * Determine how many ways she can divide the chocolate.
     */
    public static int birthday(List<Integer> s, int d, int m) {
        int waysDivided = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int total = 0;
            for (int j = 0; j < m; j++) {
                total+= s.get(i + j);
            }

            if (total == d) {
                waysDivided++;
            }
        }

        return waysDivided;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(4);

       System.out.println( birthday(s, 4, 1) );
    }
}