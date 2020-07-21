package com.example.linkedlist;

public class LinkedList<T extends Comparable<T>> {
    public Node<T> head;
    public int size = 0;

    public void addLast(Node<T> node) {
        if (head == null) {
            head = node;
        } else {
            Node<T> tail = head;

            while (tail.next != null) {
                tail = tail.next;
            }

            tail.next = node;
        }
        ++size;
    }


    public void addFirst(Node<T> node) {
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        ++size;
    }

    public void print() {
        System.out.println(head);
    }

    public void deleteNode(Node<T> node) {
        if (size == 0) return;

        Node<T> p = head;
        Node<T> q = null;

        while (p.next != null) {
            if (p.data.compareTo(node.data) != 0) {
                q = p;
                p = p.next;
            } else {
                break;
            }
        }

        if (p == head) {
            // remove head
            p = p.next;
            head.next = null;
            head = p;
        } else if (p.next == null) {
            // remove tail
            q.next = null;
        } else {
            // remove
            q.next = p.next;
            p.next = null;
        }

        --size;
    }

    public void reverse() {
        if (size == 0) return;

        Node<T> newHead = null;

        Node<T> current = head;

        while (current != null) {
            Node<T> prevHead = current;
            current = current.next;
            prevHead.next = newHead;
            newHead = prevHead;
        }

        head = newHead;
    }


}
