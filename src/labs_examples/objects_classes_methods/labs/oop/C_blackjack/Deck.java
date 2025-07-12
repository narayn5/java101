package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    String[] ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] symbols = new String[]{"♠", "♦", "♥", "♣"};
    private List<Card> cards = new ArrayList<Card>();

    public Deck() {
        int i = 0;
        for (String s : symbols) {
            for (String r : ranks) {
                if (r.equals("A")) {
                    i = 11;
                } else if (r.equals("J") || r.equals("Q") || r.equals("K")) {
                    i=10;
                } else {
                    i = Integer.parseInt(r);
                }
                cards.add(new Card(s,r,i));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card dealCard(){
        Card getCard = cards.remove(0);
        return getCard;
    }
}


