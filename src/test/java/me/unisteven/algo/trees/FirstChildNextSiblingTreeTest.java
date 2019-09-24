package me.unisteven.algo.trees;

import org.junit.Before;
import org.junit.Test;

public class FirstChildNextSiblingTreeTest {

    private FirstChildNextSiblingTreeNode<String> root;

    @Before
    public void setUp() {
        this.root = new FirstChildNextSiblingTreeNode<>("1");
    }

    @Test
    public void storeTree() {
        FirstChildNextSiblingTreeNode<String> second = new FirstChildNextSiblingTreeNode<>("2");
        FirstChildNextSiblingTreeNode<String> secondChild = new FirstChildNextSiblingTreeNode<>("2-1");
        FirstChildNextSiblingTreeNode<String> secondChildChild = new FirstChildNextSiblingTreeNode<>("2-2");
        FirstChildNextSiblingTreeNode<String> third = new FirstChildNextSiblingTreeNode<>("3");
        FirstChildNextSiblingTreeNode<String> thirdChild = new FirstChildNextSiblingTreeNode<>("3-1");
        this.root.addChild(second);
        second.addChild(secondChild);
        second.addChild(secondChildChild);
        root.addChild(third);
        third.addChild(thirdChild);
    }

    @Test
    public void BinaryTreeStore() {
        BinaryTreeNode<String> root = new BinaryTreeNode<>("1");
        BinaryTreeNode<String> second = new BinaryTreeNode<>("2");
        BinaryTreeNode<String> third = new BinaryTreeNode<>("3");
        root.setLeft(second);
        root.setRight(third);
        BinaryTreeNode thirdLeft = new BinaryTreeNode("4");
        third.setLeft(thirdLeft);
    }
}
