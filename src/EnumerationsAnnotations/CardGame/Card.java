package EnumerationsAnnotations.CardGame;

import EnumerationsAnnotations.CardGame.CardPower;
import EnumerationsAnnotations.CardGame.SuitPower;

public class Card implements Comparable<Card>{
    private CardPower cardPower;
    private SuitPower suitPower;

    public Card(String cardPower, String suitPower) {
        this.cardPower = CardPower.valueOf(cardPower);
        this.suitPower = SuitPower.valueOf(suitPower);
    }

    public CardPower getCard() {
        return this.cardPower;
    }

    public SuitPower getSuit() {
        return this.suitPower;
    }

    public int getPower(){
        return this.cardPower.getCardPower() + this.suitPower.getSuitPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                getCard(),
                getSuit(),
                getPower());
    }

    @Override
    public int compareTo(Card other) {
        return this.getPower() - other.getPower();
    }
}
