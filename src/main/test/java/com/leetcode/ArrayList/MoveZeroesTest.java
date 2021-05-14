package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    MoveZeroes obj = new MoveZeroes();

    @Test
    public void moveZeroes_whenArrayStartsFromZeroElement() {
        int[] arr = {0, 1, 0, 3, 12};
        int[] result = {1, 3, 12, 0, 0};
        obj.moveZeroes(arr);
        assertArrayEquals(result, arr);
    }

    @Test
    public void moveZeroes_whenArrayContainsOneElement() {
        int[] arr = {0};
        int[] result = {0};
        obj.moveZeroes(arr);
        assertArrayEquals(result, arr);
    }

}
