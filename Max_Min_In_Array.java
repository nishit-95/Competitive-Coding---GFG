import java.util.*;
public class Max_Min_In_Array {

    class Solution {
        public static int findSum(int A[], int N) {
            Arrays.sort(A);
            int min = A[0];
            int max = A[A.length - 1];

            return min + max;
        }
    }
}