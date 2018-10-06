package easyProblem.maxDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class MaxDepthOfBinaryTree {

    //递归
    public static int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }

        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }

    //非递归
    public int maxDepth2(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int height = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                size--;
            }
            height++;
        }

        return height;
    }
    public static void main(String[] args){

    }
}
