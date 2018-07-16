package Generics.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {


            int x = Integer.parseInt(scanner.nextLine());
            Box<Integer> box = new Box<>(x);


//            String a = scanner.nextLine();
//            Box<String> box = new Box<>(a);

            System.out.println(box.toString());

        }
    }
}
