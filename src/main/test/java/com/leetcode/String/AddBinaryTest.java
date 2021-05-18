package com.leetcode.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    AddBinary obj = new AddBinary();

    @Test
    void addBinary_whenDifferentLength() {
        String a = "11";
        String b = "1";
        assertEquals("100", obj.addBinary(a, b));
    }

    @Test
    void addBinary_whenOperandsAreEqualLength() {
        String a = "1010";
        String b = "1011";
        assertEquals("10101", obj.addBinary(a, b));
    }

}
