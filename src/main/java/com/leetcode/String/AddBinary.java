package com.leetcode.String;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (j >= 0)
                sum += b.charAt(j--) - '0'; //converts char to int
            if (i >= 0)
                sum += a.charAt(i--) - '0'; //converts char to num

            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0)
            result.append(carry);

        return result.reverse().toString();
    }
}
