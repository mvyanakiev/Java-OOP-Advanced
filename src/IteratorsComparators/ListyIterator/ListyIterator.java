package IteratorsComparators.ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator<T> {
    private List<T> myList;
    private int cursor;

    public ListyIterator(List<T> list) {
        this.myList = list;
        this.cursor = 0;
    }

    public boolean HasNext() {
        return myList.size() - 1 > this.cursor;
    }

    public boolean Move() {
        if (HasNext()) {
            this.cursor++;
            return true;
        }
        return false;
    }


    public String Print() {
        if (!this.myList.isEmpty()) {
            return String.valueOf(this.myList.get(cursor));
        } else {
            return "Invalid Operation!";
        }
    }
}
