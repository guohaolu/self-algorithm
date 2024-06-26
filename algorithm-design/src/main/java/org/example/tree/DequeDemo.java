package org.example.tree;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 双端队列输出的顺序：按照从首到尾
 */
public class DequeDemo {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Deque<Integer> stack = new LinkedList<>();
        ls.forEach(stack::push);
        stack.forEach(System.out::println);
    }
}
