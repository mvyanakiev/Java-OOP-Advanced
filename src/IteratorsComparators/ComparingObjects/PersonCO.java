package IteratorsComparators.ComparingObjects;

public class PersonCO implements Comparable<PersonCO> {
    private String name;
    private int age;
    private String town;

    public PersonCO(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(PersonCO other) {
        if (this.name.equals(other.name)
                && this.age == other.age
                && this.town.equals(other.town)) {
            return 0;
        }
        return -1;
    }
}
