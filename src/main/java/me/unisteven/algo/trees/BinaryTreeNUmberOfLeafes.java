package me.unisteven.algo.trees;

public class BinaryTreeNUmberOfLeafes<T> implements ApplyBinaryTree<T, Integer> {
    @Override
    public Integer apply(BinaryTree<T> bt) {
        return apply(bt.root);
    }

    @Override
    public Integer apply(BinaryTreeNode<T> t) {
        if(t.left == null && t.right == null){
            return 1;
        }
        int count = 0;
        if(t.left != null){
            count += apply(t.left);
        }
        if(t.right != null){
            count += apply(t.right);
        }
        return count;
    }
}
