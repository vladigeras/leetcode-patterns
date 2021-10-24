package ru.vladigeras.leetcode.algorithms;

import ru.vladigeras.leetcode.structures.BinaryTree;

public class ReverseTree {

    public static void reverse(BinaryTree tree) {
        if (tree == null) {
            return;
        }
        var temp = tree.getLeft();
        tree.setLeft(tree.getRight());
        tree.setRight(temp);
        if (tree.getLeft() != null) {
            reverse(tree.getLeft());
        }
        if (tree.getRight() != null) {
            reverse(tree.getRight());
        }
    }
}
