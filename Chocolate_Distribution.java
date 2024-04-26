import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_Distribution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        int min = a.get(n - 1);

        for (int i = 0; i < n - m + 1; i++) {
            int diff = a.get(m - 1 + i) - a.get(0 + i);
            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }
}