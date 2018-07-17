package EnumerationsAnnotations.CardSuit;

public class Main {
    public static void main(String[] args) {

        CardSuit[] playingCards = CardSuit.values();
        CardRank[] rank = CardRank.values();

//        System.out.println("Card Suits:");
        System.out.println("Card Ranks:");

//        for (CardSuit card : playingCards) {
//            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card);
//        }

        for (CardRank card : rank) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card);
        }
    }
}
