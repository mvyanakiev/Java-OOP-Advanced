package IteratorsComparators.StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] token = reader.readLine().split("\\s+");
            Person person = new Person(token[0], Integer.parseInt(token[1]));



        }








    }
}
