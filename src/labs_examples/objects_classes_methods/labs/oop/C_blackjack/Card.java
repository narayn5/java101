package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    private String suit;
    private String rank;
    private int value;

    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public String getSuit(){
        return this.suit;
    }

    public String getRank() {
        return this.rank;
    }

    public int getCardValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }

}
