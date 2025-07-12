package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class GameController {
    private Deck deck;
    private Player humanPlayer;
    private Player computerPlayer;

    public GameController(Deck deck, Player humanPlayer, Player computerPlayer) {
        this.deck = deck;
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
    }

    public void startGame() {
        Scanner stringScan = new Scanner(System.in);
        int round = 1;
        deck.shuffle();
        humanPlayer.resetHand();
        computerPlayer.resetHand();
        while(humanPlayer.getPot() > 0 && computerPlayer.getPot() > 0) {
            System.out.println("Round: "+round);
            round++;
            int bet = 10;
            humanPlayer.adjustPot(-10);
            computerPlayer.adjustPot(-10);

            humanPlayer.resetHand();
            computerPlayer.resetHand();

            humanPlayer.addCardToHand(deck.dealCard());
            humanPlayer.addCardToHand(deck.dealCard());

            computerPlayer.addCardToHand(deck.dealCard());
            computerPlayer.addCardToHand(deck.dealCard());

            System.out.println(humanPlayer.toString());

            System.out.println("Do you want a hit or stand");
            String userInput = stringScan.nextLine();
            if (userInput.equals("hit")) {
                humanPlayer.addCardToHand(deck.dealCard());
            } else if (userInput.equals("stand") || humanPlayer.getHand().getValue() > 21) {
                humanPlayer.toString();
            }
            while(computerPlayer.getHand().getValue() < 17){
                computerPlayer.addCardToHand(deck.dealCard());
            }

            int humanValue = humanPlayer.getHand().getValue();
            int computerValue = computerPlayer.getHand().getValue();

            boolean hBust = humanValue > 21;
            boolean cBust = computerValue > 21;

            if (hBust && cBust) {
                System.out.println("Both players busted. No one wins this round.");
                humanPlayer.adjustPot(10);
                computerPlayer.adjustPot(10);
            } else if (hBust) {
                System.out.println("You busted. Computer wins the round.");
                computerPlayer.adjustPot(20);
            } else if (cBust) {
                System.out.println("Computer busted. You win the round.");
                humanPlayer.adjustPot(20);
            } else if (humanValue > computerValue) {
                System.out.println("You win the round.");
                humanPlayer.adjustPot(20);
            } else if (computerValue > humanValue) {
                System.out.println("Computer wins the round.");
                computerPlayer.adjustPot(20);
            } else {
                System.out.println("It's a tie.");
                humanPlayer.adjustPot(10);
                computerPlayer.adjustPot(10);
            }

        }

    }


    public static void main(String[] args) {
        GameController controller = new GameController(
                new Deck(),
                new Player("human",new Hand(),100),
                new Player("computer",new Hand(),100)
        );
        controller.startGame();
    }
}
