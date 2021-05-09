package com.leetcode.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    RemoveElement removeElement = new RemoveElement();

    @Test
    void removeElement_whenTwoRemoveElementsConsequent() {
        int[] nums = {3,2,2,3};
        int val = 3;
        assertEquals(2, removeElement.removeElement(nums, val));
    }

    @Test
    void removeElement_whenRemoveElementIsLast() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        assertEquals(5, removeElement.removeElement(nums, val));
    }

    @Test
    void removeElement_whenArrayIsEmpty() {
        int[] nums = {};
        int val = 5;
        assertEquals(0, removeElement.removeElement(nums, val));
    }

    @Test
    void removeElement_whenAllArrayElementsAreRemovable() {
        int[] nums = {1};
        int val = 1;
        assertEquals(0, removeElement.removeElement(nums, val));
    }

}
