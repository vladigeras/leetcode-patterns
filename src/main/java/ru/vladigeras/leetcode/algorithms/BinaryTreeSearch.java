package ru.vladigeras.leetcode.algorithms;

import ru.vladigeras.leetcode.structures.BinaryTree;

public class BinaryTreeSearch {

    public static Integer search(BinaryTree tree, Integer elem) {
        if (tree.getData().equals(elem)) {
            return elem;
        }
        if (tree.getLeft() != null && elem < tree.getData()) {
            return search(tree.getLeft(), elem);
        }
        if (tree.getRight() != null && elem > tree.getData()) {
            return search(tree.getRight(), elem);
        }
        return null;
    }
}
