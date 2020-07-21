package com.example.binary_search_tree.model;

public class Tree<T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> insert(T value) {
        return root = insert(root, value);
    }

    public Node<T> insert(Node<T> root, T value) {
        if (root == null) {
            return Node.createNode(value);
        }
        if (value.compareTo(root.data) < 0) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public Node<T> search(T value) {
        return search(root, value);
    }

    public Node<T> search(Node<T> root, T value) {
        if (root == null) return null;
        if (value.compareTo(root.data) < 0) {
            return search(root.left, value);
        } else if (value.compareTo(root.data) > 0) {
            return search(root.right, value);
        }
        return root;
    }

    public Node<T> remove(T value) {
        return root = remove(root, value);
    }

    public Node<T> remove(Node<T> root, T value) {
        if (root == null) return null;

        if (value.compareTo(root.data) < 0) {
            root.left = remove(root.left, value);
        } else if (value.compareTo(root.data) > 0) {
            root.right = remove(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node<T> minVal = minValue(root.right);
                root.data = minVal.data;

                root.right = remove(root.right, minVal.data);
            }
        }

        return root;
    }

    public void inorder() {
        System.out.println();
        inorder(root);
        System.out.println();
    }

    public void inorder(Node<T> root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    private Node<T> minValue(Node<T> root) {
        Node<T> e = root;
        while (e.left != null) {
            e = e.left;
        }
        return e;
    }
}