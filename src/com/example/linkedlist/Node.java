package com.example.linkedlist;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    @NotNull
    @Contract(value = "_ -> new", pure = true)
    public static <T> Node<T> of(T data) {
        return new Node<>(data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

}
