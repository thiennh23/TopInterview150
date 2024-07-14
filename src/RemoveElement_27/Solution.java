package RemoveElement_27;

public class Solution {

    static int[] index;
    public static void main(String[] arga) {
        //Testcase 1
        /*int val = 3;
        int[] nums = new int[]{3,2,2,3};
        int num = removeElement(nums, val);
        System.out.println(num);*/

        //Testcase 2
        int val = 2;
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        index = new int[nums.length];
        int num = removeElement(nums, val);
        nums = index;
        for (int i = 0; i < num; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int j = 0;

        //Check how many number != val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
                index[j] = nums[i];
                j++;
            } else {
                nums[i] = -1;
            }
        }
        return k;
    }

}
