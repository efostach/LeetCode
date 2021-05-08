package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    MergeSortedArray obj = new MergeSortedArray();

    @Test
    void merge_whenBothArraysHaveEqualSize() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] expected = {1,2,2,3,5,6};

        assertArrayEquals(expected, obj.merge(nums1, m, nums2, n));
    }

    @Test
    void merge_whenSecondArrayIsEmpty() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};

        assertArrayEquals(expected, obj.merge(nums1, m, nums2, n));
    }

    @Test
    void merge_whenFirstArrayIsEmpty() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};

        assertArrayEquals(expected, obj.merge(nums1, m, nums2, n));
    }

    @Test
    void merge_whenSecondArrayStartsFromMinimumValue() {
        int[] nums1 = {5,6,7,0,0};
        int m = 3;
        int[] nums2 = {1,4};
        int n = 2;
        int[] expected = {1,4,5,6,7};

        assertArrayEquals(expected, obj.merge(nums1, m, nums2, n));
    }
}
