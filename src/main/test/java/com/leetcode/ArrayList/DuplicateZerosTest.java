package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateZerosTest {

    DuplicateZeros duplicateZeros = new DuplicateZeros();

    @Test
    void duplicateZeros_whenLastElementIsZero() {
        int[] nums = {1,0,2,3,0,4,5,0};
        int[] expected = {1,0,0,2,3,0,0,4};
        assertArrayEquals(expected, duplicateZeros.duplicateZeros(nums));
    }

    @Test
    void duplicateZeros_whenNoZeros() {
        int[] nums = {1,2,3};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, duplicateZeros.duplicateZeros(nums));
    }

    @Test
    void duplicateZeros_whenAllElementsAreZeros() {
        int[] nums = {0,0,0};
        int[] expected = {0,0,0};
        assertArrayEquals(expected, duplicateZeros.duplicateZeros(nums));
    }

    @Test
    void duplicateZeros_whenFirstElementIsZero() {
        int[] nums = {0,1,7,6,0,2,0,7};
        int[] expected = {0,0,1,7,6,0,0,2};
        assertArrayEquals(expected, duplicateZeros.duplicateZeros(nums));
    }
}
