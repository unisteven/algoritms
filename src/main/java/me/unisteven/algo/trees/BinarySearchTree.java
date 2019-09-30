package me.unisteven.algo.trees;


public class BinarySearchTree<T extends Comparable<? super T>> {
    private BinaryTreeNode<T> root;

    public BinarySearchTree(T value) {
        root = new BinaryTreeNode<>(value);
    }

    public void insert(T element) {
        root = insert(element, root);
    }

    public void remove(T element) {
        root = remove(element, root);
    }

    public void removeMin() {
        root = removeMin(root);
    }

    public T findMin() {
        return elementAt(findMin(root));
    }

    public T findMax() {
        return elementAt(findMax(root));
    }

    public T find(T element) {
        return elementAt(find(element, root));
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private T elementAt(BinaryTreeNode<T> t) {
        return t == null ? null : t.getValue();
    }

    private BinaryTreeNode<T> find(T element, BinaryTreeNode<T> t) {
        if (element == t.getValue()) return t;

        if (element.compareTo(t.getValue()) < 0) return find(element, t.getLeft());
        if (element.compareTo(t.getValue()) > 0) return find(element, t.getRight());

        return null;
    }

    protected BinaryTreeNode<T> findMin(BinaryTreeNode<T> t) {

        if (t.getLeft() != null) return findMin(t.getLeft());

        return t;
    }

    protected BinaryTreeNode<T> findMax(BinaryTreeNode<T> t) {

        if (t.getRight() != null) return findMax(t.getRight());

        return t;
    }

    protected BinaryTreeNode<T> insert(T element, BinaryTreeNode<T> t) {
        if (t == null) {
            t = new BinaryTreeNode<>(element);
        } else if (element.compareTo(t.getValue()) < 0) {
            t.setLeft(insert(element, t.getLeft()));
        } else if (element.compareTo(t.getValue()) > 0) {
            t.setRight(insert(element, t.getRight()));
        } else {
            return null; // this is an error
        }

        return t;
    }

    protected BinaryTreeNode<T> removeMin(BinaryTreeNode<T> t) {
        if (t == null) {
            throw new IllegalArgumentException();
        } else if (t.getLeft() == null) {
            t.setLeft(removeMin(t.getLeft()));
            return t;
        } else {
            return t.getRight();
        }
    }

    protected BinaryTreeNode<T> removeMax(BinaryTreeNode<T> t) {
        if (t == null) {
            throw new IllegalArgumentException();
        } else if (t.getRight() == null) {
            t.setRight(removeMax(t.getRight()));
            return t;
        } else {
            return t.getLeft();
        }
    }

    protected BinaryTreeNode<T> remove(T element, BinaryTreeNode<T> t) {
        if (t == null) {
            throw new IllegalArgumentException();
        } else if (element.compareTo(t.getValue()) < 0) {
            t.setLeft(remove(element, t.getLeft()));
        } else if (element.compareTo(t.getValue()) > 0) {
            t.setRight(remove(element, t.getRight()));
        } else if (t.getLeft() != null && t.getRight() != null) {
            t.setValue(findMin(t.getRight()).getValue());
            t.setRight(removeMin(t.getRight()));
        } else {
            t = (t.getLeft() != null) ? t.getLeft() : t.getRight();
        }

        return t;
    }

    public BinaryTreeNode<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
