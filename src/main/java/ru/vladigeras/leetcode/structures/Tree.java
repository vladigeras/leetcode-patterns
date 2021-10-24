package ru.vladigeras.leetcode.structures;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Tree<T> {
    private final T data;
    private final Collection<Tree<T>> childs;

    public Tree(T data, Collection<Tree<T>> childs) {
        this.data = data;
        this.childs = Objects.requireNonNullElseGet(childs, List::of);
    }

    public T getData() {
        return data;
    }

    public Collection<Tree<T>> getChilds() {
        return childs;
    }
}