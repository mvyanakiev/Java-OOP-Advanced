package Generics.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    List<T> list;

    public CustomList() {
        this.list = new ArrayList<T>();
    }


    public void add(T element){
        this.list.add(element);
    }

    public void print(){
        this.list.forEach(x -> System.out.println(x));
    }

    public void remove(int index){
        this.list.remove(index);
    }

    public boolean contains(T element){
        if (this.list.contains(element)){
            return true;
        }
        return false;
    }

    public void swap(int first, int second){
        T temp = this.list.get(first);
        this.list.set(first, this.list.get(second));
        this.list.set(second, temp);
    }





    public int countGreaterThan(T element){
        int count = 0;

        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    public T getMax(){
        return Collections.max(this.list);
    }

    public T getMin(){
        return Collections.min(this.list);
    }

    public List<T> sort(){
//        return this.list.sort((a,b) -> a.compareTo(a, b));
//        this.list.sort((a, b) -> a.compareTo(b));
        Collections.sort(this.list);
        return this.list;
    }









}
