package RemoveDuplicatesfromSortedArray_26;

public class Solution {

    public static void main(String[] args) {
        int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};
        //int[] array = new int[]{1, 1, 2};
        int k = removeDuplicates(array);
        System.out.println(k);

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int[] arr = nums;

        //Check duplicates numbers
        while (i < arr.length) {
            if (arr[i] != -999) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]){
                        arr[j] = -999;
                    }
                }
            }
            i++;
        }

        //Sort array
        i = 0;
        int result = 0;
        for (int j = 0; j < nums.length; j++) {
            if (arr[j] != -999) {
                nums[i] = arr[j];
                result++;
                i++;
            }
        }

        return result;
    }

}
