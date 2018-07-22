package EnumerationsAnnotations.CardGame;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final int MAX_NUMBER_OF_CARDS = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Card> deck = new HashMap<>();

        for (SuitPower card : SuitPower.values()) {
            for (CardPower powerCard : CardPower.values()) {
                Card crd = new Card(String.valueOf(powerCard), String.valueOf(card));
                String nameOfCard = (crd.getCard() + " " + crd.getSuit());
                deck.put(nameOfCard, crd);
            }
        }

        String player1name = reader.readLine();
        String player2name = reader.readLine();
        Player player1 = new Player(player1name);
        Player player2 = new Player(player2name);



        while (player2.getSize() < MAX_NUMBER_OF_CARDS) {
            String[] card = reader.readLine().split("\\s+");
            String nameOfCard = card[0] + " " + card[2];
            Card cardToAdd = null;

            try {
                cardToAdd = new Card(card[0], card[2]);

                if (!deck.containsKey(nameOfCard)) {
                    System.out.println("Card is not in the deck.");
                }


            } catch (IllegalArgumentException i) {
                System.out.println("No such card exists.");
            }




           if (deck.containsKey(nameOfCard) ){
                deck.remove(nameOfCard);

                if (player1.getSize() < MAX_NUMBER_OF_CARDS) {
                    player1.addCard(cardToAdd);
                } else {
                    player2.addCard(cardToAdd);
                }
            }


        }



        if (player1.maxPower().getPower() > player2.maxPower().getPower()) {
            System.out.println(player1.toString());
        } else {
            System.out.println(player2.toString());
        }
    }
}