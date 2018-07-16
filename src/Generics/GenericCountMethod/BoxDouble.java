package Generics.GenericCountMethod;


public class BoxDouble<T extends Comparable<T>> implements Comparable<BoxDouble<T>> {
    private T value;

    public BoxDouble(T value) {
        this.value = value;
    }






    @Override
    public String toString() {
        return String.format("%s: %s", this.value.getClass().getName(), this.value);
    }

    @Override
    public int compareTo(BoxDouble<T> other) {
        return this.value.compareTo(other.value);
    }





}
