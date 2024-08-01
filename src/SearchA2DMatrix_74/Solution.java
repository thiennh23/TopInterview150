package SearchA2DMatrix_74;

public class Solution {
    public static void main(String[] args) {
        //Declare 2D array
        /*int[][] matrix = new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };*/
        int[][] matrix = new int[][]{
                {1}
        };

        int target = 04;
        System.out.println(searchMatrix(matrix, target));
//        System.out.println(suitableRow(test, target));
        /*
        //Print 2D array
        for (int[] i : nums) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }*/
    }


    //Go through every row of the matrix => M time (we have NxM matrix)
    // => We will have the complexity: MxLog(N)
    //So, is there any optimal way? The answer is YES
    //Because the description given said: "The first integer of each row is greater than the last integer of the previous row."
    // So we will check the suitable row and only check that row.
    /*public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] i : matrix) {
            if (binarySearch(i, target))
                return true;
        }
        return false;
    }*/

    //We will check the suitable row first by using binary search for first column.
    // Then, we binary search the row
    //So, we will have the complexity: Log(M)xLog(N) which is very great
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = suitableRow(matrix, target);
        //Means that the column is null, just have 1 dimension
        if (row == -1) {
            return false;
        }
        return binarySearch(matrix[row], target);
    }

    //The complexity is: Log(M)
    public static int suitableRow(int[][] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (nums[mid][0] == target)
                return mid;
            else if (nums[mid][0] > target)
                right = mid - 1;
            else left = mid + 1;
            mid = (left + right) / 2;
        }
        return left - 1;
    }

    //The complexity is: Log(N)
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
