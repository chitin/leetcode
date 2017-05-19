package leetcode513;


import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) {
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode treeNode;
        int result = 0;
        while(queue.size() != 0) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                treeNode = queue.poll();
                if(i == 0) {
                    result = treeNode.val;
                }
                if(treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if(treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        node5.left = node7;

        Solution solution = new Solution();
        System.out.println(solution.findBottomLeftValue(node1));
    }
}
