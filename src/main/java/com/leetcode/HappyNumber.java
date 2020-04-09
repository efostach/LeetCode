package com.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process:
 *
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(146565));
        System.out.println(isHappy(890));
    }
    public static boolean isHappy(int n) {
        String str = String.valueOf(n);
        Set<String> set = new HashSet<>();
        set.add("4");
        set.add("16");
        set.add("37");
        set.add("58");
        set.add("89");
        set.add("145");
        set.add("42");
        set.add("20");

        do {
            int sumOfSquares = 0;

            for (int i = 0; i < str.length(); i++) {
                int c = Character.getNumericValue(str.charAt(i));
                sumOfSquares += c*c;
            }
            str = String.valueOf(sumOfSquares);

        } while(!str.equals("1") && !set.contains(str));

        return str.equals("1");
    }
}
