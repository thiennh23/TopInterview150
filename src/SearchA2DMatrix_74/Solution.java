package SearchA2DMatrix_74;

public class Solution {
    public static void main(String[] args) {
        //Declare 2D array
        int[][] nums = new int[][]{
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        int target = 3;

        //Print 2D array
        for (int[] i : nums) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        return false;
    }
}
