package com.leetcode;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        System.out.println("\nResult: " + middleNode(one) + "\tExpected: [3,4,5]\n");
        five.next = six;
        System.out.println("\nResult: " + middleNode(one) + "\tExpected: [4,5,6]\n");
    }

    public static ListNode middleNode(ListNode head) {

        ListNode node = head;
        ListNode middle = head;
        int count = 1;

        while (node.next != null) {
            count++;
            if (count % 2 == 0) {
                middle = middle.next;
            }
            node = node.next;
        }

        return middle;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "\t" + val + "\t" + next;
        }
    }
}
