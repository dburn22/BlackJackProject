package blackJack;

import java.util.Scanner;

public class Game {
	String input;
	static Deck deck = new Deck();

	public void game() {
		System.out.println("Welcome to the Gambling GODS Casino.\nHere is your BlackJack hand.\n\n");
		Casino casino = new Casino();

		deck.shuffleDeck();
		Player david = new Player();
		Player dealer = new Player();
		david.setName("David");
		dealer.setName("Dealer");
		deck.deal(david);
		deck.deal(david);
		deck.deal(dealer);
		deck.deal(dealer);

		casino.listHand(david);
		System.out.println("Player total: " + casino.getTotal(david));
		casino.listHand(dealer);

		System.out.println("Dealer total: " + casino.getTotal(dealer));

		Scanner kb = new Scanner(System.in);
		boolean keepGoing = true;
		boolean keepGoingPlayer = true;
		boolean keepGoingDealer = true;

		while (keepGoing) {
			if (casino.getTotal(dealer) <= 16) {
				System.out.println("Dealer must HIT!");
				deck.deal(dealer);
				casino.listHand(dealer);
				System.out.println("Total " + casino.getTotal(dealer));
			}
			if (casino.getTotal(dealer) == 21) {
				System.out.println("BlackJack");
			}
			if (casino.getTotal(dealer) >= 22) {
				System.out.println("Dealer Busts! You win!");
				break;
			}
			if (casino.getTotal(david) < 21) {
				// String input;
				System.out.println("Would you like to hit or stay?");
				String input = kb.next();
				if (input.equalsIgnoreCase("hit")) {

					deck.deal(david);
					casino.listHand(david);
					System.out.println("Total " + casino.getTotal(david));
					casino.listHand(dealer);
					System.out.println("Total " + casino.getTotal(dealer));
					if (casino.getTotal(david) == 21 || casino.getTotal(dealer) == 21) {
						System.out.println("BlackJack");
						keepGoing = false;
					}
					if (casino.getTotal(david) > casino.getTotal(dealer) && casino.getTotal(david) <= 21) {
						System.out.println("You win!");
					}

					if (casino.getTotal(david) == casino.getTotal(dealer)) {
						System.out.println("Push");

					}
					if (casino.getTotal(david) >= 22 || casino.getTotal(dealer) >= 22) {
						System.out.println("Bust! Dealer Wins.");

						keepGoing = false;
					}

				}
				if (input.equalsIgnoreCase("stay"))
					System.out.println("Your staying at: " + casino.getTotal(david));
				System.out.println("Dealer Total is: " + casino.getTotal(dealer));
				break;

			}
		}

	}
}
