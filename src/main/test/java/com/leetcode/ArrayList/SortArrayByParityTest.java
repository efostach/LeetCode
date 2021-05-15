package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {

    SortArrayByParity obj = new SortArrayByParity();

    @Test
    void sortArrayByParity_whenAllElementsOutOfPlace() {
        int[] arr = {3, 1, 2, 4};
        int[] result = {2, 4, 3, 1};
        obj.sortArrayByParity(arr);
        assertArrayEquals(result, arr);
    }
}
