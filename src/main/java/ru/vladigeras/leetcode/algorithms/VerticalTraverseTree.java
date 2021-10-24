package ru.vladigeras.leetcode.algorithms;

import ru.vladigeras.leetcode.structures.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class VerticalTraverseTree {

    public static <T> List<T> traverse(Tree<T> tree) {
        var result = new ArrayList<T>();
        Stack<Tree<T>> stack = new Stack<>();
        stack.add(tree);
        while (!stack.empty()) {
            Tree<T> elem = stack.pop();
            stack.addAll(elem.getChilds());
            result.add(elem.getData());
        }
        return result;
    }

    public static <T> List<T> traverseRecursion(Tree<T> tree) {
        var result = new ArrayList<T>();
        result.add(tree.getData());
        for (Tree<T> child : tree.getChilds()) {
            result.addAll(traverseRecursion(child));
        }
        return result;
    }
}
