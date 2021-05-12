package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfNAndItsDoubleExistTest {

    CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();

    @Test
    void checkIfExist_whenDoubleElementBefore() {
        int[] nums = {10, 2, 5, 3};
        assertTrue(checkIfNAndItsDoubleExist.checkIfExist(nums));
    }

    @Test
    void checkIfExist_whenDoubleElementAfter() {
        int[] nums = {7, 1, 14, 11};
        assertTrue(checkIfNAndItsDoubleExist.checkIfExist(nums));
    }

    @Test
    void checkIfExist_whenNoOneDoublePair() {
        int[] nums = {3, 1, 7, 11};
        assertFalse(checkIfNAndItsDoubleExist.checkIfExist(nums));
    }

}
