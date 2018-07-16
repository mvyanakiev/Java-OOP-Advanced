package Generics.Tuple;

public class Tuple<T, S> {
    private T item1;
    private S item2;

    public Tuple(T item1, S item2) {
        setItem1(item1);
        setItem2(item2);
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public void setItem2(S item2) {
        this.item2 = item2;
    }

    public T getItem1() {
        return this.item1;
    }

    public S getItem2() {
        return this.item2;
    }

    @Override
    public String toString() {
        return getItem1() + " -> " + getItem2();
    }
}
