import java.util.Arrays;

public class ZigZagSequence {

    /*
     * debug code with constraint: only modify at most three lines
     */
    public static void findZigZagSequence(int [] a, int n){
        /*
         * Reflection: I've realized I'm really bad at dealing with indexes. This problem took me much longer than it
         *             should have
         *
         * original code:
         *  Arrays.sort(a);
            int mid = (n + 1)/2;
            int temp = a[mid];
            a[mid] = a[n - 1];
            a[n - 1] = temp;

            int st = mid + 1;
            int ed = n - 1;
            while(st <= ed){
                temp = a[st];
                a[st] = a[ed];
                a[ed] = temp;
                st = st + 1;
                ed = ed + 1;
        }
         */
        Arrays.sort(a);
        int mid = (n - 1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 7, 2, 5};
        findZigZagSequence(a, a.length);
    }
}
