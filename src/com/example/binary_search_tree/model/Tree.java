package com.example.binary_search_tree.model;

public class Tree<T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> insert(Node<T> node) {
        return root = insert(root, node);
    }

    public Node<T> insert(Node<T> root, Node<T> node) {
        if (root == null) return node;
        if (node.data.compareTo(root.data) < 0) {
            root.left = insert(root.left, node);
        } else {
            root.right = insert(root.right, node);
        }

        return root;
    }

    public Node<T> search(T value) {
        return search(root, value);
    }

    public Node<T> search(Node<T> root, T value) {
        if (root != null) {
            if (value.compareTo(root.data) < 0) {
                return search(root.left, value);
            }
            if (value.compareTo(root.data) > 0) {
                return search(root.right, value);
            }
            return root;
        }
        return null;
    }

    public Node<T> delete(T value) {
        return root = delete(root, value);
    }

    public Node<T> delete(Node<T> root, T value) {
        if (root != null) {
            if (value.compareTo(root.data) < 0) {
                root.left = delete(root.left, value);
            } else if (value.compareTo(root.data) > 0) {
                root.right = delete(root.right, value);
            } else {
                if (root.left == null) {
                    return root.right;
                }
                if (root.right == null) {
                    return root.left;
                }

                root.data = minValue(root.right);
                root.right = delete(root.right, root.data);
            }
        }
        return root;
    }

    private T minValue(Node<T> root) {
        Node<T> e = root;
        while (e.left != null) {
            e = e.left;
        }
        return e.data;
    }


    public void traverse() {
        print(root);
        System.out.println();
    }

    public void print(Node<T> root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.data + " ");
            print(root.right);
        }
    }
}