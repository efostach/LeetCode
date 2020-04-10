package com.leetcode;

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *  ["ate","eat","tea"],
 *  ["nat","tan"],
 *  ["bat"]
 * ]
 *
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] test1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] test2 = {"",""};
        String[] test3 = {"paw","dad","bog","day","day","mig","len","rat","owl","woo"};
        String[] test4 = {"paw","dad","bog","day","day"};

        System.out.println(groupAnagrams(test1));
        System.out.println(groupAnagrams(test2));
        System.out.println(groupAnagrams(test3));
        System.out.println(groupAnagrams(test4));
    }

    public static ArrayList groupAnagrams(String[] strs) {

        Map<String, ArrayList<String>> strsMap = new HashMap<>();

        for (String s : strs) {

            char[] a = s.toCharArray();
            Arrays.sort(a);
            String value = Arrays.toString(a);

            if (strsMap.containsKey(value)) {
                strsMap.get(value).add(s);
            } else {
                ArrayList<String> str = new ArrayList<>();
                str.add(s);
                strsMap.put(value, str);
            }
        }

        return new ArrayList(strsMap.values());
    }
}
