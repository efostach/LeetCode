package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class LastStoneWeight {

    public static void main(String[] args) {

        int[] test1 = {2, 7, 4, 1, 8, 1};
        int[] test2 = {1};
        int[] test3 = {10,10,7,2};

        System.out.println("Result: " + lastStoneWeight(test1) + "\tExpected: 1");
        System.out.println("Result: " + lastStoneWeight(test2) + "\tExpected: 1");
        System.out.println("Result: " + lastStoneWeight(test3) + "\tExpected: 5");
    }

    public static int lastStoneWeight(int[] stones) {

        Arrays.sort(stones);

        List<Integer> list = new ArrayList<>();

        for (int stone : stones) {
            list.add(stone);
        }

        for (int i = list.size() - 1; i >= 1; i--) {

            list = list.stream().sorted().collect(Collectors.toList());

            int y = max(list.get(i), list.get(i - 1));
            int x = min(list.get(i), list.get(i - 1));

            list.remove(i);

            if (x == y) {
                list.remove(i - 1);
                i = list.size();
            } else {
                list.set(i - 1, y - x);
            }
        }

        if (list.isEmpty())
            return 0;
        return list.get(0);
    }
}
