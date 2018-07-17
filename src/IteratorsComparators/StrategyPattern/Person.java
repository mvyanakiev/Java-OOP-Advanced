package IteratorsComparators.StrategyPattern;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int ageCompare(Person other) {
        return other.age - this.age;
    }

    public int nameCompare(Person other) {

        if (this.name.length() - other.name.length() != 0) {
            return other.name.length() - this.name.length();
        } else {
            if (this.name.toLowerCase().charAt(0) - other.name.toLowerCase().charAt(0) != 0) {
                return other.name.toLowerCase().charAt(0) - this.name.toLowerCase().charAt(0);
            } else {
                return 0;
            }
        }
    }



    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.age);
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.equals(o.name) && this.age == o.age) {
            return 0;
        }
        return -1;

    }
}
