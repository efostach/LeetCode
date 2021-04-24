package com.leetcode.ArrayList;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        int k = nums.length - 1;
        int j = nums.length - 1;
        int i = 0;

        while (i <= j) {

            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[k--] = nums[i] * nums[i];
                i++;
            }
            else {
                result[k--] = nums[j] * nums[j];
                j--;
            }
        }

        return result;

    }

}
