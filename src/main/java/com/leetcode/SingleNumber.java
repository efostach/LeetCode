package com.leetcode.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Your algorithm should have a linear runtime complexity.
 *
 * Examples:
 *
 * Input: [2,2,1]
 * Output: 1
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */

class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 4, 4};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> noRepeatedValues = new HashSet<>();
        int result = -1;

        for (Integer item : nums) {
            if (noRepeatedValues.contains(item)) {
                noRepeatedValues.remove(item);
            } else
                noRepeatedValues.add(item);
        }

        Iterator<Integer> iterator = noRepeatedValues.iterator();
        if (iterator.hasNext()) {
            result = iterator.next();
        }

        return result;
    }
}
