package me.unisteven.algo.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeTest {

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

    /**
     * in post order
     * calculates 4 (6 + 5)
     */
    @Test
    public void binaryTreeCalculate() {
//        BinaryTree<String> tree = new BinaryTree<>(new BinaryTreeNode<String>("*"));
//        tree.root.left = new BinaryTreeNode<>("*");
//        tree.root.right = new BinaryTreeNode<>("3");
//        tree.root.left.left = new BinaryTreeNode<>("1");
//        tree.root.left.right = new BinaryTreeNode<>("2");
//        tree.root.printInOrder();
        BinaryTree<String> tree = new BinaryTree<>(new BinaryTreeNode<String>("+"));
        BinaryTreeNode<String> mult2 = new BinaryTreeNode<>("*");
        BinaryTreeNode<String> mn1 = new BinaryTreeNode<>("4");
        BinaryTreeNode<String> mn2 = new BinaryTreeNode<>("6");
        BinaryTreeNode<String> mn3 = new BinaryTreeNode<>("5");
        mult2.right = mn1;
        mult2.left = mn2;
        tree.root.left = mult2;
        tree.root.right = mn3;
        System.out.println("Result :  " + tree.calculate(tree.root));
        Assert.assertEquals(29, tree.calculate(tree.root));
    }

    @Test
    public void calculateNumberOfLeaves() {
        BinaryTree<String> tree = new BinaryTree<>(new BinaryTreeNode<String>("+"));
        BinaryTreeNode<String> mult2 = new BinaryTreeNode<>("*");
        BinaryTreeNode<String> mn1 = new BinaryTreeNode<>("4");
        BinaryTreeNode<String> mn2 = new BinaryTreeNode<>("6");
        BinaryTreeNode<String> mn3 = new BinaryTreeNode<>("5");
        mult2.right = mn1;
        mult2.left = mn2;
        tree.root.left = mult2;
        tree.root.right = mn3;
        Assert.assertEquals(3, tree.getNumberOfLeaves());
    }

    @Test
    public void calculateWithInterface() {
        ApplyBinaryTree<String, Integer> apply = new ApplyBinaryTreeSum();
        BinaryTree<String> tree = new BinaryTree<>(new BinaryTreeNode<String>("+"));
        BinaryTreeNode<String> mult2 = new BinaryTreeNode<>("*");
        BinaryTreeNode<String> mn1 = new BinaryTreeNode<>("4");
        BinaryTreeNode<String> mn2 = new BinaryTreeNode<>("6");
        BinaryTreeNode<String> mn3 = new BinaryTreeNode<>("5");
        mult2.right = mn1;
        mult2.left = mn2;
        tree.root.left = mult2;
        tree.root.right = mn3;
        Assert.assertEquals(Integer.valueOf(29), apply.apply(tree));
    }

    @Test
    public void calculateNumberofLeavesInterface() {
        ApplyBinaryTree<String, Integer> apply = new BinaryTreeNUmberOfLeafes();
        BinaryTree<String> tree = new BinaryTree<>(new BinaryTreeNode<String>("+"));
        BinaryTreeNode<String> mult2 = new BinaryTreeNode<>("*");
        BinaryTreeNode<String> mn1 = new BinaryTreeNode<>("4");
        BinaryTreeNode<String> mn2 = new BinaryTreeNode<>("6");
        BinaryTreeNode<String> mn3 = new BinaryTreeNode<>("5");
        mult2.right = mn1;
        mult2.left = mn2;
        tree.root.left = mult2;
        tree.root.right = mn3;
        Assert.assertEquals(Integer.valueOf(3), apply.apply(tree));
    }

    @Test
    public void incrementAllElementsInTreeByOne() {
        ApplyBinaryTree<String, BinaryTree> apply = new ApplyBinaryTreeIncrement();
        BinaryTree<String> tree = new BinaryTree<>(new BinaryTreeNode<String>("+"));
        BinaryTreeNode<String> mult2 = new BinaryTreeNode<>("*");
        BinaryTreeNode<String> mn1 = new BinaryTreeNode<>("4");
        BinaryTreeNode<String> mn2 = new BinaryTreeNode<>("6");
        BinaryTreeNode<String> mn3 = new BinaryTreeNode<>("5");
        mult2.right = mn1;
        mult2.left = mn2;
        tree.root.left = mult2;
        tree.root.right = mn3;
        tree.root.printInOrder();
        apply.apply(tree);
        tree.root.printInOrder();
    }

    /**
     * recursion is some magic stuff :)
     */
    @Test
    public void binaryTreeInsert() {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.insert(8);
        tree.insert(2);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);
        tree.insert(18);
    }

    @Test
    public void findMaxSearchTree() {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.insert(8);
        tree.insert(2);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);
        tree.insert(18);
        Assert.assertEquals(25, tree.findMax(tree.root));
    }

    @Test
    public void findMinSearchTree() {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.insert(8);
        tree.insert(2);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);
        tree.insert(18);
        Assert.assertEquals(2, tree.findMin(tree.root));
    }

    @Test
    public void searchTreeFind() {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.insert(8);
        tree.insert(2);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);
        tree.insert(18);
        Assert.assertEquals(20, tree.find(20));
    }

    @Test
    public void removeTreeValue() {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.insert(8);
        tree.insert(2);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);
        tree.insert(18);
        tree.remove(20);
    }
}
