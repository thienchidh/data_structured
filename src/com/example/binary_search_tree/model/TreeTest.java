package com.example.binary_search_tree.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTest {
    Tree<Integer> tree = new Tree<>();

    @BeforeEach
    void setUp() {
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(75);
        tree.insert(85);
        tree.insert(83);
        tree.insert(87);
        tree.insert(75);
        tree.insert(73);
        tree.insert(77);
        tree.insert(55);
        tree.insert(53);
        tree.insert(57);
        tree.insert(65);
        tree.insert(63);
        tree.insert(67);
        tree.insert(45);
        tree.insert(43);
        tree.insert(47);
        tree.insert(35);
        tree.insert(33);
        tree.insert(37);
        tree.insert(25);
        tree.insert(23);
        tree.insert(27);
        tree.insert(15);
        tree.insert(13);
        tree.insert(17);
    }

    @AfterEach
    void tearDown() {
        tree.inorder();
    }

    @Test
    void testSearch() {
        Node<Integer> search = tree.search(50);
        tree.inorder(search);

        System.out.println(search);
    }

    @Test
    void testRemove() {
        tree.inorder();

        tree.remove(20);
        tree.inorder();

        tree.remove(30);
        tree.inorder();

        tree.remove(50);
        tree.inorder();
    }
}