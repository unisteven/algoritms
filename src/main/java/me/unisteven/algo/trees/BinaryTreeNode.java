package me.unisteven.algo.trees;

public class BinaryTreeNode<T> {
    public T value;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public int getNumberOfLeaves(BinaryTreeNode<T> t){
        if(t.left == null && t.right == null){
            return 1;
        }
        int count = 0;
        if(t.left != null){
            count += getNumberOfLeaves(t.left);
        }
        if(t.right != null){
            count += getNumberOfLeaves(t.right);
        }
        return count;
    }

    // TODO create post order, preorder and inorder print function.

    // TODO create Tree interface or abstract class.


}
