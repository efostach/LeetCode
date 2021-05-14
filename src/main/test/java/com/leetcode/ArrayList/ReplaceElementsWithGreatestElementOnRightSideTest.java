package com.leetcode.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReplaceElementsWithGreatestElementOnRightSideTest {

    ReplaceElementsWithGreatestElementOnRightSide obj = new ReplaceElementsWithGreatestElementOnRightSide();

    @Test
    public void replaceElements_whenResultArrayContainsEqualValuesConsequently() {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = {18, 6, 6, 6, 1, -1};
        Assertions.assertArrayEquals(result, obj.replaceElements(arr));
    }

    @Test
    public void replaceElements_whenArrayHasOnlyOneElement() {
        int[] arr = {400};
        int[] result = {-1};
        Assertions.assertArrayEquals(result, obj.replaceElements(arr));
    }

}
