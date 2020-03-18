package com.leetcode.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
