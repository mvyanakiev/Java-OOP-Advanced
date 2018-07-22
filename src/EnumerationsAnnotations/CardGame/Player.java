package EnumerationsAnnotations.CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> cards;
    String name;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public void addCard (Card card){
        cards.add(card);
    }

    public int getSize(){
        return this.cards.size();
    }

    public Card maxPower(){
        if(!this.cards.isEmpty()) {
            Card maxPower = this.cards.get(0);

            for (int i = 1; i < this.cards.size(); i++) {
                if (maxPower.getPower() < this.cards.get(i).getPower()) {
                    maxPower = this.cards.get(i);
                }
            }

            return maxPower;
        }

        return null;
    }

    @Override
    public String toString() {
        return this.name + " wins with " + maxPower().getCard() + " of " + maxPower().getSuit() + ".";
    }
}
