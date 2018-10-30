package easyProblem.invertBinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class InverBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        Queue<TreeNode> stack = new LinkedList<>();
        if (root == null) return null;
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if (node.right!=null) stack.add(node.right);
            if (node.left !=null) stack.add(node.left);
        }
        return root;
    }
}
