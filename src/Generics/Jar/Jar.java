package Generics.Jar;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> items;

    public Jar() {
        this.items = new ArrayDeque<T>();
    }

    public void add(T element) {
        this.items.add(element);
    }

    public T remove() {
        if (this.items.size() >0  ){
            return items.pop();
        }
        return null;
    }


}
