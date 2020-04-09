package com.leetcode.array;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * Hints:
 *
 * In-place means we should not be allocating any space for extra array. But we are allowed to modify the existing array. However, as a first step, try coming up with a solution that makes use of additional space. For this problem as well, first apply the idea discussed using an additional array and the in-place solution will pop up eventually.
 *
 * A two-pointer approach could be helpful here. The idea would be to have one pointer for iterating the array and another pointer that just works on the non-zero elements of the array.
 */

public class MoveZeroes {

    public static void main(String[] args) {
        int[] test = {0, 1, 0, 3, 12};

        moveZeroes(test);

    }

    public static void moveZeroes(int[] nums) {

        for (int n : nums) {
            System.out.print(n + "\t");
        }

        int countZeroValue  = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 0) {
                countZeroValue++;
            } else {
                if(countZeroValue > 0) {
                    nums[i-countZeroValue] = nums[i];
                }
            }
        }

        while (countZeroValue > 0) {
            nums[nums.length - countZeroValue] = 0;
            countZeroValue--;
        }

        System.out.println("\n");
        for (int n : nums) {
            System.out.print(n + "\t");
        }
    }
}
