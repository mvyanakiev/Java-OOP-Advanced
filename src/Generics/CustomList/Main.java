package Generics.CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        CustomList cl = new CustomList();

        while (!"END".equals(line)) {

            String[] command = line.split("\\s+");



            switch (command[0]){

                case "Add":
                    cl.add(command[1]);
                    break;

                case "Print":
                    cl.print();
                    break;

                case "Remove":
                    cl.remove(Integer.parseInt(command[1]));
                    break;

                case "Contains":
                    System.out.println(cl.contains(command[1]));
                    break;

                case "Swap":
                    cl.swap(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;

                case "Greater":
                    System.out.println(cl.countGreaterThan(command[1]));
                    break;

                case "Max":
                    System.out.println(cl.getMax());
                    break;

                case "Min":
                    System.out.println(cl.getMin());
                    break;

                case "Sort":
                    cl.sort();
                    break;


            }





            line = reader.readLine();
        }


    }
}