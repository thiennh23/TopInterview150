package RemoveElement_27;

public class Solution2 {

    public static void main(String[] arga) {
        //Testcase 2
        int val = 3;
        int[] nums = new int[]{3,2,2,3};
        int num = removeElement(nums, val);

        for (int i = 0; i< num; i++)
            System.out.print(nums[i] + " ");
    }

    public static int removeElement(int[] nums, int val) {
       int k = 0;

       for (int i = 0; i < nums.length; i++) {
           if (nums[i] != val) {
               nums[k] = nums[i];
                k++;
           }
       }
        return k;
    }

}
