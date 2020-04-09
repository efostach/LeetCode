package com.leetcode.array;

import java.util.Arrays;

/**
 * Given an integer array arr, count element X such that (X + 1) is also in arr.
 *
 * If there're duplicates in arr, count them seperately.
 *
 * Example 1:
 *
 * Input: arr = [1,2,3]
 * Output: 2
 * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
 *
 * Example 2:
 *
 * Input: arr = [1,1,3,3,5,5,7,7]
 * Output: 0
 * Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
 *
 * Example 3:
 *
 * Input: arr = [1,3,2,3,5,0]
 * Output: 3
 * Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
 *
 * Example 4:
 *
 * Input: arr = [1,1,2,2]
 * Output: 2
 * Explanation: Two 1s are counted cause 2 is in arr.
 *
 * Constraints:
 *
 * 1 <= arr.length <= 1000
 * 0 <= arr[i] <= 1000
 */

public class CountingElements {
    public static void main(String[] args) {

        int[] test1 = {1, 3, 2, 3, 5, 0};
        int[] test2 = {1, 1, 3, 3, 5, 5, 7, 7};
        int[] test3 = {1, 2, 3};
        int[] test4 = {1, 1, 2, 2};
        int[] test5 = {6, 3, 11, 6, 11, 1, 11, 4, 7, 6, 13, 4, 1};

        System.out.println("\nResult: " + countElements(test1) + "\tExpected: 3\n");
        System.out.println("\nResult: " + countElements(test2) + "\tExpected: 0\n");
        System.out.println("\nResult: " + countElements(test3) + "\tExpected: 2\n");
        System.out.println("\nResult: " + countElements(test4) + "\tExpected: 2\n");
        System.out.println("\nResult: " + countElements(test5) + "\tExpected: 4\n");
    }

    public static int countElements(int[] arr) {

        int count = 0;
        int repeatedValues = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            int current = arr[i];
            int next = arr[i+1];

            if (current == next) {
                repeatedValues++;
            } else {

                if (current + 1 == next) {
                    count++;
                    if (repeatedValues > 0) {
                        count += repeatedValues;
                        repeatedValues = 0;
                    }
                } else {
                    repeatedValues = 0;
                }
            }
        }
        return count;
    }
}
