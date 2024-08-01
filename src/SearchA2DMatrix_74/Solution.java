package SearchA2DMatrix_74;

public class Solution {
    public static void main(String[] args) {
        //Declare 2D array
        int[][] matrix = new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        int target = 204;
        System.out.println(searchMatrix(matrix, target));

        /*
        //Print 2D array
        for (int[] i : nums) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }*/
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] i : matrix) {
            if (binarySearch(i, target))
                return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (nums[mid] == target)
                return true;
            else if (nums[mid] > target)
                right = mid - 1;
            else left = mid + 1;
            mid = (left + right) / 2;
        }
        return false;
    }
}
