package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {

    SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();

    @Test
    void sortedSquares_withZeroValue() {
        int[] nums = {-4,-1,0,3,10};
        int[] expected = {0,1,9,16,100};
        assertArrayEquals(expected, squaresOfASortedArray.sortedSquares(nums));
    }

    @Test
    void sortedSquares_withoutZeroValue() {
        int[] nums = {-7,-3,2,3,11};
        int[] expected = {4,9,9,49,121};
        assertArrayEquals(expected, squaresOfASortedArray.sortedSquares(nums));
    }
}
