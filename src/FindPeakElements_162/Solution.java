package FindPeakElements_162;

public class Solution {
    public static void main(String[] args) {
        //Testcase 1
        int[] nums = new int[] {1, 2, 3, 1};
        System.out.println(findPeakElements(nums));

        System.out.println();

        //Testcase 2
        int[] nums2 = new int[] {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElements(nums2));
    }

    public static int findPeakElements(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if ((nums[mid] > nums[mid - 1]) && nums[mid]> nums[mid + 1])
                return mid;
        }
        return -1;
    }
}
