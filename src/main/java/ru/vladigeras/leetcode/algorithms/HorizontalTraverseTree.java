package ru.vladigeras.leetcode.algorithms;

import ru.vladigeras.leetcode.structures.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HorizontalTraverseTree {

    public static <T> List<T> traverse(Tree<T> tree) {
        var result = new ArrayList<T>();
        Queue<Tree<T>> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            Tree<T> elem = queue.poll();
            queue.addAll(elem.getChilds());
            result.add(elem.getData());
        }
        return result;
    }
}
