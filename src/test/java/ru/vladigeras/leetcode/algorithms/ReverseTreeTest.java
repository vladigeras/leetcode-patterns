package ru.vladigeras.leetcode.algorithms;

import org.junit.jupiter.api.Test;
import ru.vladigeras.leetcode.structures.BinaryTree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vladigeras.leetcode.algorithms.ReverseTree.reverse;

class ReverseTreeTest {

    @Test
    void shouldLeftNodeMakeRight() {
        var tree = new BinaryTree(8,
                new BinaryTree(3,
                        new BinaryTree(1, null, null),
                        new BinaryTree(6,
                                new BinaryTree(4, null, null),
                                new BinaryTree(7, null, null))
                ),
                new BinaryTree(10,
                        null,
                        new BinaryTree(14,
                                new BinaryTree(13, null, null),
                                null)
                )
        );

        reverse(tree);

        var expected = new BinaryTree(8,
                new BinaryTree(10,
                        new BinaryTree(14,
                                null,
                                new BinaryTree(13, null, null)),
                        null),
                new BinaryTree(3,
                        new BinaryTree(6,
                                new BinaryTree(7, null, null),
                                new BinaryTree(4, null, null)
                        ),
                        new BinaryTree(1, null, null)
                )
        );
        assertEquals(expected, tree);
    }
}
