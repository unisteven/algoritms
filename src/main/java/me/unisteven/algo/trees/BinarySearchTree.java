package me.unisteven.algo.trees;

import jdk.nashorn.internal.ir.BinaryNode;

public class BinarySearchTree {
    public BinaryTreeNode root;

    public BinarySearchTree(int first) {
        this.root = new BinaryTreeNode(first);
    }

    public void insert(int value) {
        this.insert(value, root);
    }

    private void insert(int value, BinaryTreeNode node) {
        if (value < (int) node.value) {
            // left
            if (node.left == null) {
                node.left = new BinaryTreeNode(value);
            } else {
                // recursive
                this.insert(value, node.left);
            }
        } else {
            if(node.right == null){
                // no value zo must be bigger
                node.right = new BinaryTreeNode(value);
            }else{
                this.insert(value, node.right);
            }
        }
    }

    public void remove(int value) {
        BinaryTreeNode toRemove = this.find(this.root, value);
        BinaryTreeNode minOfRight = this.findMinBin(toRemove.right);
        toRemove.value = minOfRight.value; // replace with lowest of right

        if(minOfRight.right != null){
            // set the parent left to this minOfRight.right
            // TODO how to get the parent????????????
        }else{
            // set parent left to null.
        }
    }

    public int findMin(BinaryTreeNode node) {
        if (node.left == null) {
            return (int) node.value;
        }
        return findMin(node.left);
    }

    private BinaryTreeNode findMinBin(BinaryTreeNode node) {
        if (node.left == null) {
            return node;
        }
        return findMinBin(node.left);
    }

    public int findMax(BinaryTreeNode node) {
        if (node.right == null) {
            return (int) node.value;
        }
        return findMax(node.right);
    }

    public int find(int value){
        BinaryTreeNode node = this.find(this.root, value);
        if(node == null){
            return 0;
        }else{
            return (int) node.value;
        }
    }

    private BinaryTreeNode find(BinaryTreeNode node, int value) {
        if((int) node.value == value){
            return node;
        }
        if (node.left != null) {
            if (value < (int) node.value) {
                return find(node.left, value);
            }else{
                if (node.right == null) {
                    return null;
                }
                return find(node.right, value);
            }
        }
        if (node.right != null) {
            if (value > (int) node.value) {
                return find(node.right, value);
            }else{
                if(node.left == null){
                    return null;
                }
                return find(node.left, value);
            }
        }
        return null;
    }
}
