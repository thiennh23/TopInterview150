package MergeSortedArray_88;

public class Solution {

    public static void main(String args[]) {
        int n = 3;
        int m = 3;
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = n; i < n + m; i++){
            nums1[i] = nums2[i-n];
        }

        for (int i = 0; i < n+m; i++)
            System.out.print(nums1[i] + " ");

        InsertionSort(nums1, n+m);

        for (int i = 0; i < n+m; i++)
            System.out.print(nums1[i] + " ");
    }

    public static void InsertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }


}