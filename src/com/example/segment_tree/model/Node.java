package com.example.segment_tree.model;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    T data;

    @Override
    public int compareTo(Node<T> o) {
        return data.compareTo(o.data);
    }
}
