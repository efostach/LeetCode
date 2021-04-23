package com.leetcode.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();

    @Test
    public void findMaxConsecutiveOnes_withLastMaxNumberOfValues() {
        int[] nums = {1, 1, 0, 0, 0, 0};
        Assertions.assertEquals(2, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void findMaxConsecutiveOnes_withFirstMaxNumberOfValues() {
        int[] nums = {1, 1, 1, 1, 0, 0};
        Assertions.assertEquals(4, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void findMaxConsecutiveOnes_withTwoSimilarSequences() {
        int[] nums = {1, 1, 0, 0};
        Assertions.assertEquals(2, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void findMaxConsecutiveOnes_withAlternativeNumbers() {
        int[] nums = {1, 0, 1, 0};
        Assertions.assertEquals(1, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void findMaxConsecutiveOnes_withOneElement() {
        int[] nums = {1};
        Assertions.assertEquals(1, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void findMaxConsecutiveOnes_withOneZeroElement() {
        int[] nums = {0};
        Assertions.assertEquals(0, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void findMaxConsecutiveOnes_withTwoZeroElement() {
        int[] nums = {0, 0};
        Assertions.assertEquals(0, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

}
