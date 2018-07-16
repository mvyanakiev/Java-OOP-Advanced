package Generics.GenericCountMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Box> elements = new ArrayList<>();

        for (int i = 0; i < n; i++) {
//            String element = reader.readLine();
            double element = Double.parseDouble(reader.readLine());

//            Box<String> box = new Box(element);
            Box<Double> box = new Box(element);
            elements.add(box);

        }

//        String itemToCompare = reader.readLine();
        double itemToCompare = Double.parseDouble(reader.readLine());


//        Box<String> compBox = new Box<>(itemToCompare);
        Box<Double> compBox = new Box<>(itemToCompare);

        int count = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).compareTo(compBox) > 0) {
                count++;
            }
        }

        System.out.println(count);


    }
}