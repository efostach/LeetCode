package com.leetcode.array;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class MaximumSubarray {
    public static void main(String[] args) {

        int[] test1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] test2 = {-1, -1, -2, 0, -1};
        int[] test3 = {-1, 1};
        int[] test4 = {-2, 1};
        int[] test5 = {-2, -1};
        int[] test6 = {1, 1, 1, -1};
        int[] test7 = {2, 1, 2, 0, 1};
        int[] test8 = {-2, -1, -2};

        System.out.println("\nResult: " + maxSubArray(test1) + "\nExpected: 6");
        System.out.println("\nResult: " + maxSubArray(test2) + "\nExpected: 0");
        System.out.println("\nResult: " + maxSubArray(test3) + "\nExpected: 1");
        System.out.println("\nResult: " + maxSubArray(test4) + "\nExpected: 1");
        System.out.println("\nResult: " + maxSubArray(test5) + "\nExpected: -1");
        System.out.println("\nResult: " + maxSubArray(test6) + "\nExpected: 3");
        System.out.println("\nResult: " + maxSubArray(test7) + "\nExpected: 6");
        System.out.println("\nResult: " + maxSubArray(test8) + "\nExpected: -1");
    }

    public static int maxSubArray(int[] nums) {
        System.out.print("\n");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        System.out.print("\n");

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            System.out.print("i: " + nums[i] + "\t");

            if (currentSum > -1) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            System.out.print("CurrentSum: " + currentSum + "\t");
            System.out.println("Max: " + maxSum);
        }

        return maxSum;
    }
}
