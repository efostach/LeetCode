package com.leetcode.ArrayList;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxLength = 0;
        int currentLength = 0;

        for (int num : nums) {

            if (num > 0)
                currentLength++;
            else
                currentLength = 0;

            if (currentLength > maxLength)
                maxLength = currentLength;
        }

        return maxLength;
    }

}
