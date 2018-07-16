package Generics.Swap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Box<Integer>> hoi = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int x = Integer.parseInt(scanner.nextLine());
            Box<Integer> neshto = new Box<>(x);
            hoi.add(neshto);
        }


        String[] whoToSwap = scanner.nextLine().split("\\s+");
        int a = Integer.parseInt(whoToSwap[0]);
        int b = Integer.parseInt(whoToSwap[1]);

        swap(a, b, hoi);

        for (Box<Integer> stringBox : hoi) {
            System.out.println(stringBox);
        }
    }

    private static <T> void swap(int a, int b, List<Box<T>> boxes){
        Box<T> value = boxes.get(a);
        boxes.set(a, boxes.get(b));
        boxes.set(b, value);
    }
}
