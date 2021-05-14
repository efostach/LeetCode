package com.leetcode.ArrayList;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int countZeros = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
                countZeros++;
            else {
                nums[j] = nums[i];
                j++;
            }
        }

        while (countZeros > 0) {
            nums[nums.length - countZeros] = 0;
            countZeros--;
        }
    }
}
