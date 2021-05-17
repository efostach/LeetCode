package com.leetcode.ArrayList;

public class DuplicateZeros {

    public int[] duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == 0) {

                for (int j = arr.length - 1; j > i; j--) {

                    arr[j] = arr[j - 1];
                }

                arr[i + 1] = arr[i];
                i++;
            }
        }

        return arr;
    }

    public int[] duplicateZerosSecondSolution(int[] arr) {

        int countZeros = 0;
        int length = arr.length - 1;

        for (int i = 0; i < length - countZeros; i++) {

            if (arr[i] == 0)
                countZeros++;
        }

        for (int i = length - countZeros; i >= 0; i--) {

            if (arr[i] != 0)
                arr[length--] = arr[i];

            if (arr[i] == 0 && length != 0) {
                arr[length--] = 0;
                arr[length--] = 0;
            }
        }

        return arr;
    }
}
