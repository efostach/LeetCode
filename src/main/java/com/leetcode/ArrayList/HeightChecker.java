package com.leetcode.ArrayList;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int incorrectOrder = 0;
        int[] expected = new int[heights.length];

        System.arraycopy(heights, 0, expected, 0, heights.length);
        Arrays.sort(expected);

        for (int i = 0; i < expected.length; i++) {

            if (expected[i] != heights[i])
                incorrectOrder++;
        }

        return incorrectOrder;
    }
}
