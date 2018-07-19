package IteratorsComparators.StackIterator;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public void push(int number) {
        stack.add(0, number);
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("No elements");
        } else {
            stack.remove(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Integer integer : stack) {
            sb.append(integer).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
