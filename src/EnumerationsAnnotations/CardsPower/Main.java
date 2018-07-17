package EnumerationsAnnotations.CardsPower;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String card = reader.readLine().toUpperCase();
        String suite = reader.readLine().toUpperCase();
        int powerCard = CardPower.valueOf(card).getCardPower() + SuitPower.valueOf(suite).getSuitPower();

        System.out.printf("Card name: %s of %s; Card power: %d", CardPower.valueOf(card), SuitPower.valueOf(suite), powerCard);


    }
}
