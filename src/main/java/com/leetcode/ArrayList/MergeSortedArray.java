package com.leetcode.ArrayList;

public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int j = m - 1;
        int k = n - 1;
        int i = nums1.length - 1;

        while (i >= 0 && j >= 0 && k >= 0) {

            if (nums1[j] >= nums2[k])
                nums1[i--] = nums1[j--];
            else
                nums1[i--] = nums2[k--];
        }

        while (j < 0 && k >= 0)
            nums1[i--] = nums2[k--];

        return nums1;
    }

}
