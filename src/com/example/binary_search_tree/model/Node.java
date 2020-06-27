package com.example.binary_search_tree.model;

public class Node<T extends Comparable<T>> {
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
    }

    public static <T extends Comparable<T>> Node<T> createNode(T data) {
        return new Node<>(data);
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
