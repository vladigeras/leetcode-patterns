package ru.vladigeras.leetcode.algorithms;

import org.junit.jupiter.api.Test;
import ru.vladigeras.leetcode.structures.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static ru.vladigeras.leetcode.algorithms.BinaryTreeSearch.search;

class BinaryTreeSearchTest {

    @Test
    void shouldSearchInBinaryTree() {
        var tree = new BinaryTree(8,
                new BinaryTree(3,
                        new BinaryTree(1, null, null),
                        new BinaryTree(6,
                                new BinaryTree(4, null, null),
                                new BinaryTree(7, null, null))),
                new BinaryTree(10,
                        null,
                        new BinaryTree(14,
                                new BinaryTree(13, null, null),
                                null)));
        assertEquals(6, search(tree, 6));
        assertEquals(13, search(tree, 13));
        assertNull(search(tree, 15));
    }
}
