package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayTest {

    ValidMountainArray validMountainArray = new ValidMountainArray();

    @Test
    void validMountainArray_whenArrayShorterThenRequired() {
        int[] nums = {2, 1};
        assertFalse(validMountainArray.validMountainArray(nums));
    }

    @Test
    void validMountainArray_whenEqualsElementsTogether() {
        int[] nums = {3, 5, 5};
        assertFalse(validMountainArray.validMountainArray(nums));
    }

    @Test
    void validMountainArray_whenMountainArray() {
        int[] nums = {0, 3, 2, 1};
        assertTrue(validMountainArray.validMountainArray(nums));
    }

    @Test
    void validMountainArray_whenOppositeToMountainArray() {
        int[] nums = {2, 0, 2};
        assertFalse(validMountainArray.validMountainArray(nums));
    }

    @Test
    void validMountainArray_whenNoPicks() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertFalse(validMountainArray.validMountainArray(nums));
    }

    @Test
    void validMountainArray_whenNoPicksAndEachNextElementSmaller() {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        assertFalse(validMountainArray.validMountainArray(nums));
    }
}
