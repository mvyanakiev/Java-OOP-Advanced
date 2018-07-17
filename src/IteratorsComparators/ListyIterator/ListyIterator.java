package IteratorsComparators.ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator<T> implements Iterable<T> {
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

    public void PrintAll(){
        StringBuilder sb = new StringBuilder();

        // override foreach
        for (T element : this) {
            sb.append(element).append(" ");
        }
        System.out.println(sb.toString());
    }

    @Override
    public Iterator<T> iterator() {
        return new Listy();
    }



    private final class Listy implements Iterator<T> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            if (this.counter < myList.size()) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            return myList.get(counter++);
        }
    }






}
