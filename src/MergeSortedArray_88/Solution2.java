package MergeSortedArray_88;

public class Solution2 {

    public static void main(String[] args) {
        /*int m = 3;
        int n = 3;
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};*/

        int m = 0;
        int n = 1;
        int nums1[] = {0};
        int nums2[] = {1};
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //The number of elements in nums1, nums2 and the actually in nums1 (n+m)
        int e1 = m - 1;
        int e2 = n - 1;
        int e3 = m + n - 1;

        while (e1 >= 0 && e2 >= 0 && e3 >= 0) {
            if (nums2[e2] > nums1[e1]) {
                nums1[e3] = nums2[e2];
                e2--;
            } else {
                nums1[e3] = nums1[e1];
                e1--;
            }
            e3--;
        }

        for (int i = 0; i < n+m; i++) {
            System.out.println(nums1[i]);
        }


    }
}
