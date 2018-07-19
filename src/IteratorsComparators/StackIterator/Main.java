package IteratorsComparators.StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Stack stack = new Stack();

        String command = reader.readLine();

        while (!"END".equals(command)) {

            if (command.startsWith("Pop")){
                stack.pop();
            } else if (command.startsWith("Push")){
                command = command.substring(5).trim();
                String[] numbers = command.split(", ");
                for (int i = 0; i < numbers.length; i++) {
                    stack.push(Integer.parseInt(numbers[i]));
                }
            }
            command = reader.readLine();
        }

        System.out.print(stack);
        System.out.print(stack);
    }
}
