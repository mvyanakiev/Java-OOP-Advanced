package Generics.Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firsLine = reader.readLine().split("\\s+");
        Tuple<String, String> name = new Tuple<String, String>(firsLine[0] + " " + firsLine[1], firsLine[2]);

        String[] beers = reader.readLine().split("\\s+");
        Tuple<String, Integer> beerCount = new Tuple<String, Integer>(beers[0], Integer.parseInt(beers[1]));

        String[] testLine = reader.readLine().split("\\s+");
        Tuple<Integer, Double> test = new Tuple(Integer.parseInt(testLine[0]), Double.parseDouble(testLine[1]));

        System.out.println(name.toString());
        System.out.println(beerCount.toString());
        System.out.println(test.toString());
    }
}
