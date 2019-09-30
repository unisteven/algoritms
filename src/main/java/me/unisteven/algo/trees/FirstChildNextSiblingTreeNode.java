package me.unisteven.algo.trees;

public class FirstChildNextSiblingTreeNode<T> {

    public T element;
    public FirstChildNextSiblingTreeNode<T> firstChild;
    public FirstChildNextSiblingTreeNode<T> nextSibling;


    public FirstChildNextSiblingTreeNode(T element) {
        this.element = element;
    }

    public void addChild(FirstChildNextSiblingTreeNode<T> t) {
        if(firstChild == null){
            this.firstChild = t;
            return;
        }
        if(this.nextSibling == null){
            this.nextSibling = t;
            return;
        }
        this.getNextFreeSibling(this.firstChild).nextSibling = t;
    }

    private FirstChildNextSiblingTreeNode<T> getNextFreeSibling(FirstChildNextSiblingTreeNode<T> t){
        if(t.nextSibling == null){
            return t;
        }
        return this.getNextFreeSibling(t.nextSibling);
    }



    public void removeChild(FirstChildNextSiblingTreeNode<T> t){
        if(t.firstChild != null){
            t.firstChild = t.firstChild.nextSibling;
        }else{
            t.firstChild = null;
        }
    }
}
