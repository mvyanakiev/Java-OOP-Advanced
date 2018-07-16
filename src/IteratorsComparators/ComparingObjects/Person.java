package IteratorsComparators.ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person other) {
        if (this.name.equals(other.name)
                && this.age == other.age
                && this.town.equals(other.town)) {
            return 0;
        }
        return -1;
    }
}
