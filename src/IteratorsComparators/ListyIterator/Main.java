package IteratorsComparators.ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        List<String> list = new ArrayList<>();

        if (input.length > 1) {
            for (int i = 1; i < input.length; i++) {
                list.add(input[i]);
            }
        }

        ListyIterator<String> li = new ListyIterator(list);

        String command = reader.readLine();

        while (!"END".equals(command)) {

            switch (command) {
                case "HasNext":
                    System.out.println(li.HasNext());
                    break;

                case "Move":
                    System.out.println(li.Move());
                    break;

                case "Print":
                    System.out.println(li.Print());
                    break;
            }


            command = reader.readLine();
        }


    }
}