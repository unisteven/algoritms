package me.unisteven.algo.trees;

public class BinaryTree<T> {
    public BinaryTreeNode<T> root;

    public BinaryTree(BinaryTreeNode<T> root) {
        this.root = root;
    }

    public int getNumberOfLeaves(){
        return this.root.getNumberOfLeaves(root);
    }

    public int calculate(BinaryTreeNode<String> root){
        if(root == null){

        }
        if(root.value.equals("*")){
            // it must be a node
            return calculate(root.left) * calculate(root.right);
        }
        if(root.value.equals("+")){
            return calculate(root.left) + calculate(root.right);
        }
        if(root.value.equals("-")){
            return calculate(root.left) - calculate(root.right);
        }
        if(root.value.equals("/")){
            return calculate(root.left) / calculate(root.right);
        }
        // it is a leaf
        return Integer.parseInt(root.value);
    }
}
