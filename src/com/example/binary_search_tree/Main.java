package com.example.binary_search_tree;

import com.example.binary_search_tree.model.Node;
import com.example.binary_search_tree.model.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Tree<Integer> integerTree = new Tree<>();

        Queue<Integer> queue = new LinkedList<>();

        Random random = new Random();
        for (int i = 0, n = random.nextInt(20) + 10; i < n; ++i) {
            int value = random.nextInt(100) + 10;
            integerTree.insert(Node.createNode(value));
            integerTree.traverse();

            queue.add(value);
        }

        for (int value : queue) {
            System.out.print("find " + value + ":\t");
            integerTree.print(integerTree.search(value));
            System.out.println();
        }
    }
}
