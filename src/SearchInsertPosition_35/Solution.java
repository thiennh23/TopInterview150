package SearchInsertPosition_35;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end - 1) {
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] < target)
                start = mid + 1;
            mid = (start + end) / 2;
        }

        if (nums[mid] < target)
            return mid+1;
        return mid;
    }
}
