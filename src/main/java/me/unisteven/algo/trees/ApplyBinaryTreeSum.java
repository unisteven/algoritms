package me.unisteven.algo.trees;

public class ApplyBinaryTreeSum implements ApplyBinaryTree<String, Integer> {


    @Override
    public Integer apply(BinaryTree<String> bt) {
        return apply(bt.root);
    }

    @Override
    public Integer apply(BinaryTreeNode<String> node) {
        if (node == null) {

        }
        if (node.value.equals("*")) {
            // it must be a node
            return apply(node.left) * apply(node.right);
        }
        if (node.value.equals("+")) {
            return apply(node.left) + apply(node.right);
        }
        if (node.value.equals("-")) {
            return apply(node.left) - apply(node.right);
        }
        if (node.value.equals("/")) {
            return apply(node.left) / apply(node.right);
        }
        // it is a leaf
        return Integer.parseInt(node.value);
    }
}
