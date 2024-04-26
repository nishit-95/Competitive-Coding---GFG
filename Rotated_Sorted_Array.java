public class Rotated_Sorted_Array {
    public int search(int[] nums, int target) {

        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        if (nums.length == 2) {
            if (nums[0] == target) {
                return 0;
            } else if (nums[1] == target) {
                return 1;
            } else {
                return -1;
            }
        }

        int i = 0;
        int j = nums.length - 1;
        int mid, k;

        if (nums[i] < nums[j]) {
            while (i <= j) {
                mid = (i + j) / 2;

                if (nums[mid] == target) {
                    return mid;
                }
                if (target < nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
        } else {
            while (nums[i] > nums[j]) {
                i++;
                j--;
            }
            if (nums[i] < nums[i - 1]) {
                k = i;
            } else {
                k = j + 1;
            }

            int mid1;

            if (target > nums[0]) {
                i = 0;
                j = k - 1;
            } else if (nums[0] == target) {
                return 0;
            }

            else {
                i = k;
                j = nums.length - 1;
            }
            while (i <= j) {
                mid1 = (i + j) / 2;

                if (nums[mid1] == target) {
                    return mid1;
                } else if (target < nums[mid1]) {
                    j = mid1 - 1;
                } else {
                    i = mid1 + 1;
                }
            }

        }
        return -1;

    }
}
