package com.leetcode.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {

        Set<Integer> nums = new HashSet<>();

        for (int value : arr) {

            if (nums.contains(2 * value))
                return true;

            if (value % 2 == 0 && nums.contains(value / 2))
                return true;

            nums.add(value);
        }

        return false;
    }
}
