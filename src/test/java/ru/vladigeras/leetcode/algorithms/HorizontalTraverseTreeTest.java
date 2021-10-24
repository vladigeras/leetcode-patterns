package ru.vladigeras.leetcode.algorithms;

import org.junit.jupiter.api.Test;
import ru.vladigeras.leetcode.structures.Tree;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vladigeras.leetcode.algorithms.HorizontalTraverseTree.traverse;

class HorizontalTraverseTreeTest {

    @Test
    void shouldTraverseByLevel() {
        var tree = new Tree<>(5, of(
                new Tree<>(1, of(
                        new Tree<>(3, of(
                                new Tree<>(6, of()),
                                new Tree<>(8, of()))
                        ),
                        new Tree<>(9, of()))
                ),
                new Tree<>(2, of()),
                new Tree<>(0, of(
                        new Tree<>(11, of()))))
        );
        assertEquals(of(5, 1, 2, 0, 3, 9, 11, 6, 8), traverse(tree));
    }
}
