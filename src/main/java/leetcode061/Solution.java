package leetcode061;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int listLen = 1;

        ListNode node = head;
        while (node.next != null) {
            listLen++;
            node = node.next;
        }
        node.next = head;
        for (int i = 0; i < (listLen - k % listLen) % listLen; i++) {
            node = node.next;
        }
        head = node.next;
        node.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Solution solution = new Solution();

        ListNode n1 = solution.rotateRight(node1, 2);

        System.out.println(n1.val);
        System.out.println(n1.next.val);
        System.out.println(n1.next.next.val);
        System.out.println(n1.next.next.next.val);
        System.out.println(n1.next.next.next.next.val);
    }
}
