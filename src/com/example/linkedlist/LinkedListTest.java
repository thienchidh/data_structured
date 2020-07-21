package com.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTest {
    @Test
    void addLast() {
        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(Node.of(1));
        list.addLast(Node.of(2));
        list.addLast(Node.of(3));
        list.addLast(Node.of(4));
        list.addLast(Node.of(5));

        assertEquals(5, list.size);

        list.print();
    }

    @Test
    void addFirst() {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(Node.of(1));
        list.addFirst(Node.of(2));
        list.addFirst(Node.of(3));
        list.addFirst(Node.of(4));
        list.addFirst(Node.of(5));

        list.print();
    }


    @Test
    void deleteNode() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(Node.of(1));
        list.addFirst(Node.of(2));
        list.addFirst(Node.of(4));
        list.addFirst(Node.of(5));
        list.deleteNode(Node.of(2));

        list.print();
    }

    @Test
    void reverse() {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(Node.of(1));
        list.addFirst(Node.of(2));
        list.addFirst(Node.of(4));
        list.addFirst(Node.of(5));

        list.print();
        list.reverse();
        list.print();
    }
}