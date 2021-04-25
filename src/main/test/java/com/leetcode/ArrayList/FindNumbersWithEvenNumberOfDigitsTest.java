package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersWithEvenNumberOfDigitsTest {

    FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();

    @Test
    void findNumbers_withSingleValue() {
        int[] array = {1};
        assertEquals(0, findNumbersWithEvenNumberOfDigits.findNumbers(array));
    }

    @Test
    void findNumbers_withDifferentValues() {
        int[] array = {0, 4455, 10, 567900};
        assertEquals(3, findNumbersWithEvenNumberOfDigits.findNumbers(array));
    }

    @Test
    void findNumbers_withOnlyNotEvenValues() {
        int[] array = {5, 333, 7};
        assertEquals(0, findNumbersWithEvenNumberOfDigits.findNumbers(array));
    }

    @Test
    void findNumbers_withOnlyEvenValues() {
        int[] array = {44, 6666, 8888};
        assertEquals(3, findNumbersWithEvenNumberOfDigits.findNumbers(array));
    }

}
