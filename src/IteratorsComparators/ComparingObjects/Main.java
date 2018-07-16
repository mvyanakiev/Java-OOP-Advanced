package IteratorsComparators.ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();

        String line = reader.readLine();

        while (!"END".equals(line)) {
            String[] tokens = line.split("\\s+");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            people.add(person);

            line = reader.readLine();
        }

        int personToCompare = Integer.parseInt(reader.readLine()) - 1;
        int equalPeople = 0;

        for (Person person : people) {
            if (person.compareTo(people.get(personToCompare)) == 0)  {
                equalPeople++;
            }
        }

        if (equalPeople > 1) {
        System.out.printf("%d %d %d", equalPeople, people.size() - equalPeople, people.size());

        } else {
            System.out.println("No matches");
        }

    }
}