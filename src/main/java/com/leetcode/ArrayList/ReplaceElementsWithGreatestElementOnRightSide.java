package com.leetcode.ArrayList;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;

        if (arr.length > 1) {

            for (int i = arr.length - 2; i >= 0; i--) {

                if (arr[i] > max) {
                    int newValue = arr[i];
                    arr[i] = max;
                    max = newValue;
                }
                else
                    arr[i] = max;
            }
        }

        return arr;
    }
}
