package IteratorsComparators.Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> listToAdd = new ArrayList<>();

        String command = reader.readLine();

        while (!"END".equals(command)) {

            String[] input = command.split(", ");

            for (String s : input) {
                listToAdd.add(Integer.parseInt(s));
            }

            command = reader.readLine();
        }

        Lake lake = new Lake(listToAdd);
        System.out.println(lake.froggy());

        //fixme
        // input-a може да е със или без запетаи


    }
}
