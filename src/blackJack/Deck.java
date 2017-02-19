package blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck{
	static List<Card> deck = new ArrayList<>(52);


	public  List<Card> shuffleDeck() {
		int counter = 1;
		for (Value r : Value.values()) {
			for (Suit s : Suit.values()) {
				Card c;
				if (counter == 1) {
					c = new Card(r, s, 11);
					deck.add(c);
				}
				else if (counter < 10) {
					c = new Card(r, s, counter);
					deck.add(c);

				} else {
					c = new Card(r, s, 10);
					deck.add(c);

				}
			}
			counter++;
		}
		Collections.shuffle(deck);
		return deck;
	}

	public void deal(Player p){
		p.getHand().addCard(deck.remove(0));

	}

}