package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards = new ArrayList<Card>();
    public Hand () {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getValue(){
        int value = 0;
        for (Card c: cards) {
            if (value > 21 && c.getRank().equals("A")) {
                value += 1;
            } else {
                value += c.getCardValue();
            }
        }
        return value;
    }

    public boolean isBust() {
        if (getValue() > 21){
            return true;
        }
        else {
            return false;
        }
    }

    public void clear() {
        cards.clear();
    }

    @Override
    public String toString() {
        for (Card c: cards) {
            return c.getRank()+c.getSuit()+" ==> "+c.getCardValue();
        }
        return "Total value is " + getValue();
    }
}
