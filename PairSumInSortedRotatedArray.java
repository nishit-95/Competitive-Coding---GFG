public class PairSumInSortedRotatedArray {
    public static boolean findPair(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums);

        int left = pivot;           
        int right = (pivot - 1 + n) % n; 

        while (left != right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                System.out.println("Pair found: " + nums[left] + ", " + nums[right]);
                return true;
            }

            if (sum < target) {
                left = (left + 1) % n;
            } else {
                right = (right - 1 + n) % n;
            }
        }

        System.out.println("No pair found.");
        return false;
    }

    private static int findPivot(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;

        findPair(nums, target);
    }
}
