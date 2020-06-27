package com.example.segment_tree.model;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class SegmentTree<T extends Comparable<T>> {
    private int size;
    private List<Node<T>> array;

    public SegmentTree(int size) {
        this.size = size;
        array = Stream.generate(Node<T>::new)
                .limit(size * 4 + 1)
                .collect(Collectors.toList());
    }

    public Node<T> get(int left, int right) {
        return get(1, 1, size, left, right);
    }

    public Node<T> get(int index, int left, int right, int leftQuery, int rightQuery) {
        if (rightQuery < left || leftQuery > right) {
            return new Node<>();
        }
        if (leftQuery >= left && rightQuery <= right) {
            return array.get(index);
        }
        int mid = (left + right) / 2;
        Node<T> leftNode = get(index * 2, left, mid, leftQuery, rightQuery);
        Node<T> rightNode = get(index * 2 + 1, mid + 1, right, leftQuery, rightQuery);
        return choose(leftNode, rightNode);
    }

    @NotNull
    public abstract Node<T> choose(@NotNull Node<T> left, @NotNull Node<T> right);

    public void update(int index, Node<T> newValue) {
        update(1, 1, size, index, newValue);
    }

    public void update(int i, int l, int r, int index, Node<T> newValue) {
        if (index > r || index < l) {
            return;
        }
        if (index >= l && index <= r) {
            array.set(i, newValue);
            return;
        }
        int mid = (l + r) / 2;
        update(i * 2, l, mid, index, newValue);
        update(i * 2 + 1, mid + 1, r, index, newValue);

        array.set(i, choose(array.get(i * 2), array.get(i * 2 + 1)));
    }
}
