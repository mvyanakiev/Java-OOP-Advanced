package IteratorsComparators.StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();
        Set<Person> byAge = new TreeSet<>();
        Set<Person> byName = new TreeSet<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] token = reader.readLine().split("\\s+");
            Person person = new Person(token[0], Integer.parseInt(token[1]));
            people.add(person);
        }

        people.stream().sorted(Person::ageCompare).forEach(byAge::add);
        people.stream().sorted(Person::nameCompare).forEach(byName::add);

        byName.forEach(System.out::println);
        byAge.forEach(System.out::println);
    }
}
