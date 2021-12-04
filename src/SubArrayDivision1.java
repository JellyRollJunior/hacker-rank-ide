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
        /*
         * Reflection: think about how work from previous iterations can help your current iteration
         *
         * my own solution to procedurally building sum:
         *
           int waysDivided = 0;
           int sum = 0;
           int startIndex = 0;

           for (int i = 0; i < s.size(); i++) {
               sum += s.get(i);
               if (i - startIndex + 1 == m) {
                   if (sum == d) {
                       waysDivided++;
                   }
                   sum -= s.get(startIndex);
                   startIndex++;
               }
           }

           return waysDivided;
         *
         */
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
        s.add(5);
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(5);
        s.add(3);
        s.add(2);

       System.out.println( birthday(s, 9, 3) );
    }
}