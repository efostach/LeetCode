package com.leetcode.ArrayList;

public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {

        int countEvenNumbers = 1;

        for (int num : nums) {

            int countDigitsInNumber = 0;

            while (num != 0) {
                num = num / 10;
                countDigitsInNumber++;
            }

            if (countDigitsInNumber % 2 == 0)
                countEvenNumbers++;
        }

        return countEvenNumbers;
    }

}
