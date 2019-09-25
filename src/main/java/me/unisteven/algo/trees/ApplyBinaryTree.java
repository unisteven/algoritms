package me.unisteven.algo.trees;

public interface ApplyBinaryTree<T, U> {
    U apply(BinaryTree<T> bt);
    U apply(BinaryTreeNode<T> node);
}
