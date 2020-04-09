package com.leetcode.array;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Examples:
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */

public class RotateArray {

    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(rotate(first, 3));

        int[] second = {1, 2, 3, 4};
        System.out.println(rotate(second, 5));
    }

    public static int[] rotate(int[] nums, int k) {

        int length = nums.length;
        k = k % length;

        if (k > 0) {

            int[] newArray = new int[k];
            int m = 0;

            for (int i = length - k; i < length; i++) {
                newArray[m] = nums[i];
                m++;
            }

            if (length - 1 - k + 1 >= 0)
                System.arraycopy(nums, 0, nums, k, length - 1 - k + 1);

            System.arraycopy(newArray, 0, nums, 0, newArray.length);
        }

        return nums;
    }
}
