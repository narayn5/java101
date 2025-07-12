package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    private String name;
    private Hand hand;
    private int pot;

    public Player(String name, Hand hand, int pot) {
        this.name = name;
        this.hand = new Hand();
        this.pot = pot;
    }

    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    public Hand getHand(){
        return hand;
    }

    public int getPot(){
        return pot;
    }

    public void adjustPot(int amount) {
        pot += amount;
    }

    public void resetHand(){
        hand = new Hand();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", pot=" + pot +
                '}';
    }
}
