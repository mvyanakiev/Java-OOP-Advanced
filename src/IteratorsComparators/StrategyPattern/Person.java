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
        }
        return other.name.toLowerCase().charAt(0) - this.name.toLowerCase().charAt(0);
    }


    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.age);
    }

    @Override
    public int compareTo(Person other) {
        if (this.name.equals(other.name) && this.age == other.age) {
            return 0;
        }
        return -1;

    }
}
