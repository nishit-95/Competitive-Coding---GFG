public class Reverse_Array {
    public void reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
