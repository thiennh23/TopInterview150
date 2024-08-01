package FindPeakElements_162;

public class Solution {
    public static void main(String[] args) {
        //Testcase 1
        int[] nums = new int[] {1, 2, 3, 1};
        System.out.println(findPeakElement(nums));

        //Testcase 2
        int[] nums2 = new int[] {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums2));

        //Testcase 3
        int[] nums3 = new int[] {};
        System.out.println(findPeakElement(nums3));
    }

    public static int findPeakElement(int[] nums) {
        if ((nums.length == 0) || (nums.length == 1))
            return 0;

        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            boolean left, right;

            //Check left
            if (isEdge(mid - 1, nums.length))
                left = true;
            else if (nums[mid] > nums[mid - 1])
                left = true;
            else left = false;

            //Check right
            if (isEdge(mid + 1, nums.length))
                right = true;
            else if (nums[mid] > nums[mid + 1])
                right = true;
            else right = false;

            //Conditions
            if ((left) && (right))
                return mid;
            else {
                if (!right)
                    start = mid + 1;
                else if (!left)
                    end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return 0;
    }

    public static boolean isEdge(int n, int length) {
        //Check 2 edge of an array
        if ((n > length - 1) || (n < 0))
            return true;
        else return false;
    }
}
