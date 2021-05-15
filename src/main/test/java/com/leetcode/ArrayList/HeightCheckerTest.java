package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightCheckerTest {
    HeightChecker heightChecker = new HeightChecker();

    @Test
    void heightChecker_whenEqualsValuesPutConsequences() {
        int[] arr = {1, 1, 4, 2, 1, 3};
        assertEquals(3, heightChecker.heightChecker(arr));
    }

    @Test
    void heightChecker_whenTheHighestNumberPutFirst() {
        int[] arr = {5, 1, 2, 3, 4};
        assertEquals(5, heightChecker.heightChecker(arr));
    }

    @Test
    void heightChecker_whenCorrectElementsSequence() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, heightChecker.heightChecker(arr));
    }

}
