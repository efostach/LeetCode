package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicates_whenAllElementsAreDuplicated() {
        int[] nums = {1,1,2,2};
        assertEquals(2, obj.removeDuplicates(nums));
    }

    @Test
    void removeDuplicates_whenCountElementsIsOdd() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, obj.removeDuplicates(nums));
    }

    @Test
    void removeDuplicates_whenZeroLengthArray() {
        int[] nums = {};
        assertEquals(0, obj.removeDuplicates(nums));
    }

}
