package com.leetcode.ArrayList;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int swapElementValue;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                swapElementValue = nums[j];
                nums[j] = nums[i];
                nums[i] = swapElementValue;
                j++;
            }
        }

        return nums;
    }
}
