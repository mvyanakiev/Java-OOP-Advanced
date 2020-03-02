package Generics.Jar;

import java.util.ArrayDeque;

/**
 * тва се прави като натиснеш / и после 2 * и ентер
 * @param <T>
 *
 */

public class Jar<T> {
    private ArrayDeque<T> items;

    public Jar() {
        this.items = new ArrayDeque<T>();
    }

    public void add(T element) {
        this.items.push(element);
    }

    public T remove() {
        if (this.items.size() > 0) {
            return items.pop();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T item : items) {
            sb.append(item);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
