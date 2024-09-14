import java.util.*;

class Chocolate_Distribution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here

        if (m == 0 || n == 0) {
            return 0;
        }

        Collections.sort(a);

        int minDiff = Integer.MAX_VALUE;

        if (n < m) {
            return -1;
        }

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = a.get(i + m - 1) - a.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}