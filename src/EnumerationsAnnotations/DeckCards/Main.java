package EnumerationsAnnotations.DeckCards;

public class Main {
    public static void main(String[] args) {

        CardSuit[] playingCardSuit = CardSuit.values();
        CardRank[] playingCardRank = CardRank.values();

        for (CardSuit cardSuit : playingCardSuit) {
            for (CardRank cardRank : playingCardRank) {
                System.out.printf("%s of %s%n", cardRank, cardSuit);
            }
        }
    }
}
