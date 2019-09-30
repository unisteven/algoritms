package me.unisteven.algo.trees;

public class Tree<T> {
    public FirstChildNextSiblingTreeNode<T> root;

    public Tree(T value) {
        this.root = new FirstChildNextSiblingTreeNode<>(value);
    }

    public void addChild(FirstChildNextSiblingTreeNode<T> second) {
        this.root.addChild(second);
    }



}
