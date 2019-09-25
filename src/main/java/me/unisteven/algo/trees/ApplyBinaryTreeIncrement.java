package me.unisteven.algo.trees;

public class ApplyBinaryTreeIncrement implements ApplyBinaryTree<String, BinaryTree> {


    @Override
    public BinaryTree apply(BinaryTree<String> bt) {
        return apply(bt.root);
    }

    @Override
    public BinaryTree apply(BinaryTreeNode<String> node) {
        if(!node.value.equals("*") && !node.value.equals("+") && !node.value.equals("-") && !node.value.equals("/")){
            node.value = Integer.toString(Integer.parseInt(node.value) + 1);
            return null;
        }
        apply(node.left);
        apply(node.right);
        return null;
    }
}
