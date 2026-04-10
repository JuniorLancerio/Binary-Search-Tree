package model;

public class BSTNode<E> {

    public E value;
    public BSTNode<E> left;
    public BSTNode<E> right;

    public BSTNode(E value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}