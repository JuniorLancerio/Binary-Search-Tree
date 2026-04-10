package model;

public class BinaryTree<K extends Comparable<K>, V> {

    private BSTNode<Association<K, V>> root;

    public void insert(K key, V value) {
        root = insertRec(root, new Association<>(key, value));
    }

    private BSTNode<Association<K, V>> insertRec(BSTNode<Association<K, V>> node, Association<K, V> data) {

        if (node == null) return new BSTNode<>(data);

        if (data.getKey().compareTo(node.value.getKey()) < 0) {
            node.left = insertRec(node.left, data);
        } else {
            node.right = insertRec(node.right, data);
        }

        return node;
    }

    public V search(K key) {
        return searchRec(root, key);
    }

    private V searchRec(BSTNode<Association<K, V>> node, K key) {

        if (node == null) return null;

        int cmp = key.compareTo(node.value.getKey());

        if (cmp == 0) return node.value.getValue();

        if (cmp < 0) return searchRec(node.left, key);

        return searchRec(node.right, key);
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(BSTNode<Association<K, V>> node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.println("(" + node.value.getKey() + ", " + node.value.getValue() + ")");
            inOrderRec(node.right);
        }
    }
}