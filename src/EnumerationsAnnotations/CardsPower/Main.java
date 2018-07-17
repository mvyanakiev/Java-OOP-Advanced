package EnumerationsAnnotations.CardsPower;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String card1 = reader.readLine().toUpperCase();
        String suite1 = reader.readLine().toUpperCase();

        String card2 = reader.readLine().toUpperCase();
        String suite2 = reader.readLine().toUpperCase();

        Card firstCard = new Card(card1, suite1);
        Card secondCard = new Card(card2, suite2);


        if (firstCard.compareTo(secondCard) > 1) {
            System.out.println(firstCard);
        } else {
            System.out.println(secondCard);
        }


    }
}
