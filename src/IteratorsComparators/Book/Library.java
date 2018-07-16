package IteratorsComparators.Book;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    private final class LibraryIterator implements Iterator<Book> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            if (this.counter < books.length) {
                return true;
            }
            return false;
        }

        @Override
        public Book next() {
            return books[counter++];
        }
    }
}
